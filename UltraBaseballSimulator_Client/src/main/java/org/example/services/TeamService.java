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

    public List<Team> getTeamList() {
            List<Team> teamList = null;
            try {
                ResponseEntity<List<Team>> responseEntity = restTemplate.exchange(
                        API_BASE_URL + "teams/",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Team>>() {}
                );
                teamList = responseEntity.getBody();
            } catch (RestClientResponseException e) {
                System.out.println(e.getRawStatusCode() + " : " + e.getStatusText());
            } catch (ResourceAccessException e) {
                System.out.println(e.getMessage());
            }
            return teamList;
        }
}
