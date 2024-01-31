package org.example.dao;

import org.example.exception.DaoException;
import org.example.models.Team;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcTeamDao implements TeamDao {

    private final JdbcTemplate jdbcTemplate;
    private final TeamDao teamDao;

    public JdbcTeamDao(JdbcTemplate jdbcTemplate, TeamDao teamDao) {
        this.jdbcTemplate = jdbcTemplate;
        this.teamDao = teamDao;
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
