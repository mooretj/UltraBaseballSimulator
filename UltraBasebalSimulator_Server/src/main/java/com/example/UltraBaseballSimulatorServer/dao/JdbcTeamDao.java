package com.example.UltraBaseballSimulatorServer.dao;

import com.example.UltraBaseballSimulatorServer.exception.DaoException;
import com.example.UltraBaseballSimulatorServer.model.Team;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcTeamDao implements TeamDao {
    private final JdbcTemplate jdbcTemplate;

    public JdbcTeamDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Team> getAllTeams() {
        List<Team> teams = new ArrayList<>();
        String sql = "SELECT team_name, league, division, wins, losses FROM teams";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
            while (results.next()) {
                Team team = mapRowToTeam(results);
                teams.add(team);
            }
        }
        catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database");
        }
        return teams;
    }

    @Override
    public Team getTeamByTeamName(String teamName) {
        Team team = new Team();
        String sql = "SELECT team_name, league, division, wins, losses FROM teams WHERE team_name = ?";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, teamName);
            if (results.next()) {
                team = mapRowToTeam(results);
            }
        }
        catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database");
        }
        return team;
    }

    private Team mapRowToTeam(SqlRowSet t) {
        Team team = new Team();
        team.setTeamName(t.getString("team_name"));
        team.setLeague(t.getString("league"));
        team.setDivision(t.getString("division"));
        team.setWins(t.getInt("wins"));
        team.setLosses(t.getInt("losses"));
        return team;
    }
}
