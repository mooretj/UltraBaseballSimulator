package org.example.dao;

import org.example.exception.DaoException;
import org.example.models.Pitcher;

import java.util.List;


public interface PitcherDao {
    /**
     * @param teamName name of the team
     * @return a list of pitcher objects by team
     * @throws DaoException if an error occurs such as failure to connect with the datastore
     *      *or other datastore-specific exceptions.
     */
    List<Pitcher> getPitchersByTeam(String teamName);

    /**
     * @param pitcher pitcher object to be updated
     * @return a fully updated pitcher object
     * @throws DaoException if an error occurs such as failure to connect with the datastore
     *      *or other datastore-specific exceptions.
     */
    Pitcher updatePitcher(Pitcher pitcher);
}
