package org.example.services;
import org.example.models.Team;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.http.*;

public class TeamService {
    private static final String API_BASE_URL = "https://localhost:8080/";
    private final RestTemplate restTemplate = new RestTemplate();

    public Team[] printTeamList(){
        Team[] accountList = null;
        try{
            accountList = restTemplate.getForObject(API_BASE_URL, Team[].class);
        }
        catch (RestClientResponseException e) {
            System.out.println(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            System.out.println(e.getMessage());
        }
        return accountList;
    }
}
