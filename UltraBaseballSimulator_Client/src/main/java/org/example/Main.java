package org.example;

import org.example.models.Batter;
import org.example.models.Pitcher;

import java.text.DecimalFormat;

public class Main {
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
        System.out.println("Pitcher1's Batting AVG agains is :" + df.format(pitcher1.getBattingAvgAgainst()));
    }
}