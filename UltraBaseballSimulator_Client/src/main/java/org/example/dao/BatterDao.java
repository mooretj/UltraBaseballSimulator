package org.example.dao;

import org.example.models.Batter;
import org.example.exception.DaoException;

import java.util.List;

public interface BatterDao {

    /**
     * @param teamName Name of the team.
     * @return List of all batters on this team.
     * @throws DaoException if an error occurs such as failure to connect with the datastore
     *or other datastore-specific exceptions.
     */
    List<Batter> getBattersByTeam(String teamName);

    /**
     * @param batter the Batter object to be updated.
     * @return a fully populated updated Batter
     * @throws DaoException if an error occurs such as failure to connect with the datastore or other datastore-specific exceptions.
     */
    Batter updateBatter(Batter batter);
}
