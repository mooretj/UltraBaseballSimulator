package org.example.models;

import java.util.List;

public class Team {
    private String teamName;
    private int wins;
    private int losses;
    private List<Batter> batters;
    private List<Pitcher> pitchers;

    public String getTeamName() {
        return teamName;
    }
    public int getWins() {
        return wins;
    }
    public void setWins(int wins){
    }
    public int getLosses() {
        return losses;
    }
    public void setLosses(int losses){
    }

    public Team(String teamName,int wins, int losses, List<Batter> batters, List<Pitcher> pitchers) {
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        this.batters = batters;
        this.pitchers = pitchers;
    }
    public Team() {
    }
}
