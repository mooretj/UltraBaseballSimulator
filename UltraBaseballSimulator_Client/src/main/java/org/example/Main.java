package org.example;

import org.example.models.Batter;
import org.example.models.Pitcher;
import org.example.models.Team;
import org.example.services.TeamService;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String API_BASE_URL = "http://localhost:8080/";
    private final TeamService teamService = new TeamService();

    public static void main(String[] args) {

        Main main = new Main();
        main.run();

        /*DecimalFormat df = new DecimalFormat(".###");
        System.out.println("Hello world!");
        Batter batter1 = new Batter();
        batter1.setHits(6);
        batter1.setPlateAppearances(22);
        System.out.printf("Batter1's Batting AVG is: " + df.format(batter1.getBattingAverage()));
        System.out.println("");
        Pitcher pitcher1 = new Pitcher();
        pitcher1.setBattersFaced(46);
        pitcher1.setHits(24);
        System.out.println("Pitcher1's Batting AVG against is: " + df.format(pitcher1.getBattingAvgAgainst()));*/

    }
    private void run() {
        List<Team> teams;
        teams = teamService.getTeamList();
        for(Team team : teams) {
            System.out.println(team.getTeamName());
        }
    }
}