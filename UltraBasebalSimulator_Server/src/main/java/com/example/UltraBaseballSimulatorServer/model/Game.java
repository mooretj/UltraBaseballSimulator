package com.example.UltraBaseballSimulatorServer.model;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private int gameNumber;
    private int homeOuts;
    private int awayOuts;
    private int homeRuns;
    private int awayRuns;

    public Game() {
    }

    public Game(Team homeTeam, Team awayTeam, int gameNumber, int homeOuts, int awayOuts, int homeRuns, int awayRuns) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.gameNumber = gameNumber;
        this.homeOuts = homeOuts;
        this.awayOuts = awayOuts;
        this.homeRuns = homeRuns;
        this.awayRuns = awayRuns;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    public int getHomeOuts() {
        return homeOuts;
    }

    public void setHomeOuts(int homeOuts) {
        this.homeOuts = homeOuts;
    }

    public int getAwayOuts() {
        return awayOuts;
    }

    public void setAwayOuts(int awayOuts) {
        this.awayOuts = awayOuts;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getAwayRuns() {
        return awayRuns;
    }

    public void setAwayRuns(int awayRuns) {
        this.awayRuns = awayRuns;
    }
}
