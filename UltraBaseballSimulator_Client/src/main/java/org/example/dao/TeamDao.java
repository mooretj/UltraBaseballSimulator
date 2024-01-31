package org.example.dao;

import org.example.models.Team;

import java.util.List;

public interface TeamDao {
    List<Team> getAllTeams();
/*    Team getTeamByName(String teamName);
    Team getTeamById(int teamId);*/
}
