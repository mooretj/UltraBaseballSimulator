package com.example.UltraBaseballSimulatorServer.dao;

import com.example.UltraBaseballSimulatorServer.model.Batter;

import java.util.ArrayList;
import java.util.List;

public class JdbcBatterDao implements BatterDao {
    public List<Batter> getBattersByTeam(String teamName) {
        List<Batter> batters = new ArrayList<>();
        return batters;
    }

    public Batter updateBatter(Batter batter) {
        return batter;
    }
}
