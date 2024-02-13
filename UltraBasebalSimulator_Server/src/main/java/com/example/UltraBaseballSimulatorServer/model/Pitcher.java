package com.example.UltraBaseballSimulatorServer.model;

public class Pitcher {
    private String name;
    private int battersFaced;
    private int hits;
    private int totalPitches;
    private int strikes;
    private int balls;
    private int singles;
    private int doubles;
    private int triples;
    private int homeruns;
    private double battingAvgAgainst;

    public String getName() {
        return this.name;
    }

    public int getBattersFaced() {
        return this.battersFaced;
    }

    public void setBattersFaced(int battersFaced) {
        this.battersFaced = battersFaced;
    }

    public int getHits() {
        return this.hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getTotalPitches() {
        return this.totalPitches;
    }

    public void setTotalPitches(int totalPitches) {
        this.totalPitches = totalPitches;
    }

    public int getStrikes() {
        return this.strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public int getBalls() {
        return this.balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getSingles() {
        return this.singles;
    }

    public void setSingles(int singles) {
        this.singles = singles;
    }

    public int getDoubles() {
        return this.doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return this.triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getHomeruns() {
        return this.homeruns;
    }

    public void setHomeruns(int homeruns) {
        this.homeruns = homeruns;
    }

    public double getBattingAvgAgainst() {
        battingAvgAgainst = ((double) this.hits / this.battersFaced);
        return this.battingAvgAgainst;
    }

    public Pitcher() {
    }

    public Pitcher(String name, int battersFaced, int hits, int totalPitches, int strikes, int balls, int singles, int doubles, int triples, int homeruns, double battingAvgAgainst) {
        this.name = name;
        this.battersFaced = battersFaced;
        this.hits = hits;
        this.totalPitches = totalPitches;
        this.strikes = strikes;
        this.balls = balls;
        this.singles = singles;
        this.doubles = doubles;
        this.triples = triples;
        this.homeruns = homeruns;
        this.battingAvgAgainst = battingAvgAgainst;
    }
}
