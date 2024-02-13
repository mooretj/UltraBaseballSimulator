package com.example.UltraBaseballSimulatorServer.dao;

import com.example.UltraBaseballSimulatorServer.model.Team;

import java.util.List;

public interface TeamDao {
    List<Team> getAllTeams();
    Team getTeamByTeamName(String teamName);
}
