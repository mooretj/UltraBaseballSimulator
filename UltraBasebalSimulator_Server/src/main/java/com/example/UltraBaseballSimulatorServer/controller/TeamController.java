package com.example.UltraBaseballSimulatorServer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.UltraBaseballSimulatorServer.model.*;
import com.example.UltraBaseballSimulatorServer.dao.TeamDao;

import java.util.List;

@RestController
@RequestMapping("teams/")
public class TeamController {
    private final TeamDao teamDao;

    public TeamController(TeamDao teamDao){
        this.teamDao = teamDao;
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping
    public Team[] getListOfTeams() {
        return teamDao.getAllTeams();
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("{teamName}")
    public Team getTeamByName(@PathVariable String teamName) {
        return teamDao.getTeamByTeamName(teamName);
    }
}
