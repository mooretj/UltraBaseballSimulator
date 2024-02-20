package com.example.UltraBaseballSimulatorServer.dao;

import com.example.UltraBaseballSimulatorServer.model.Team;

import java.util.List;

public interface TeamDao {
    Team[] getAllTeams();
    Team getTeamByTeamName(String teamName);
}
