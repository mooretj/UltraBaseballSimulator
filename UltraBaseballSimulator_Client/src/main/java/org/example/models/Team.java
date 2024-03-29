package org.example.models;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Team {
    @JsonProperty("team_name")
    private String teamName;
    private String league;
    private String division;
    private int wins;
    private int losses;

    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName =teamName;
    }
    public String getLeague() {
        return league;
    }
    public void setLeague(String league){
        this.league = league;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public int getWins() {
        return wins;
    }
    public void setWins(int wins){
        this.wins = wins;
    }
    public int getLosses() {
        return losses;
    }
    public void setLosses(int losses){
        this.losses =losses;
    }

    public Team(String teamName, String league, String division, int wins, int losses) {
        this.teamName = teamName;
        this.league = league;
        this.division = division;
        this.wins = wins;
        this.losses = losses;
    }
    public Team() {
    }
}
