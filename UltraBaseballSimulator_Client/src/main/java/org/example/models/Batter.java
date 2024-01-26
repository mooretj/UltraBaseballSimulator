package org.example.models;

public class Batter {

    private String name;
    private int plateAppearances;
    private int hits;
    private int strikeouts;
    private int singles;
    private int doubles;
    private int triples;
    private int homeruns;
    private int walks;
    private double battingAverage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlateAppearances() {
        return this.plateAppearances;
    }

    public void setPlateAppearances(int plateAppearances) {
        this.plateAppearances = plateAppearances;
    }

    public int getHits() {
        return this.hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getStrikeouts() {
        return this.strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
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

    public int getWalks() {
        return this.walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public double getBattingAverage() {
        this.battingAverage = ((double) this.hits / this.plateAppearances);
        return this.battingAverage;
    }

    public Batter(){}

    public Batter(String name, int plateAppearances, int hits, int strikeouts, int singles, int doubles, int triples, int homeruns, int walks, double battingAverage) {
        this.name = name;
        this.plateAppearances = plateAppearances;
        this.hits = hits;
        this.strikeouts = strikeouts;
        this.singles = singles;
        this.doubles = doubles;
        this.triples = triples;
        this.homeruns = homeruns;
        this.walks = walks;
        this.battingAverage = battingAverage;
    }
}
