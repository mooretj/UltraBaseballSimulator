package com.example.UltraBaseballSimulatorServer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Team {
    @JsonProperty("team_name")
    private String teamName;
    private String league;
    private String division;
    private int wins;
    private int losses;

    public String getTeamName() {
        return this.teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getLeague() {
        return this.league;
    }
    public void setLeague(String league){
        this.league = league;
    }
    public String getDivision() {
        return this.division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public int getWins() {
        return this.wins;
    }
    public void setWins(int wins){
        this.wins = wins;
    }
    public int getLosses() {
        return this.losses;
    }
    public void setLosses(int losses){
        this.losses = losses;
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
