package com.example.UltraBaseballSimulatorServer.dao;

import com.example.UltraBaseballSimulatorServer.model.Pitcher;

import java.util.ArrayList;
import java.util.List;

public class JdbcPitcherDao implements PitcherDao {
    @Override
    public List<Pitcher> getPitchersByTeam(String teamName) {
        List<Pitcher> pitchers = new ArrayList<>();
        return pitchers;
    }
    @Override
    public Pitcher updatePitcher(Pitcher pitcher) {
        return pitcher;
    }
}
