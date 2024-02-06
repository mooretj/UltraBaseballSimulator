package org.example;

import org.example.dao.*;
import org.example.dao.TeamDao;
import org.example.models.Batter;
import org.example.models.Pitcher;
import org.example.models.Team;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final TeamDao teamDao;

    public Main(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".###");
        System.out.println("Hello world!");
        Batter batter1 = new Batter();
        batter1.setHits(6);
        batter1.setPlateAppearances(22);
        System.out.printf("Batter1's Batting AVG is: " + df.format(batter1.getBattingAverage()));
        System.out.println("");
        Pitcher pitcher1 = new Pitcher();
        pitcher1.setBattersFaced(46);
        pitcher1.setHits(24);
        System.out.println("Pitcher1's Batting AVG against is :" + df.format(pitcher1.getBattingAvgAgainst()));



        System.out.println("Baseball Teams");
        for(Team team: teamDao.getAllTeams()) {
            System.out.println(team.getTeamName());
        }
    }
}