package org.example.services;
import org.example.models.Team;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.http.*;

import java.util.List;

public class TeamService {
    private static final String API_BASE_URL = "http://localhost:8080/";
    private final RestTemplate restTemplate = new RestTemplate();


    public TeamService() {
        restTemplate.getInterceptors().add(new HeaderInspectingInterceptor());
    }

    public Team[] getTeamList() {
            Team[] teamList = null;
            try {
                teamList = restTemplate.getForObject(API_BASE_URL + "teams/", Team[].class);
            } catch (RestClientResponseException e) {
                System.out.println(e.getRawStatusCode() + " : " + e.getStatusText());
            } catch (ResourceAccessException e) {
                System.out.println(e.getMessage());
            }
            return teamList;
        }
}
