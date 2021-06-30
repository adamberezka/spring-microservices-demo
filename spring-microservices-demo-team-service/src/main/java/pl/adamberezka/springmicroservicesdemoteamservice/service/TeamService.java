package pl.adamberezka.springmicroservicesdemoteamservice.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pl.adamberezka.springmicroservicesdemoteamservice.model.Team;
import pl.adamberezka.springmicroservicesdemoteamservice.repository.TeamRepository;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getTeams(){
        return teamRepository.findAll();
    }

    public Team getTeam(Integer teamId){
        return teamRepository.findById(teamId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Could not find team with this id"
        ));
    }

    public Team createTeam(Team team){
        return teamRepository.save(team);
    }

    public Team updateTeam(Team team){
        return teamRepository.save(team);
    }

    public Team deleteTeam(Integer teamId){
        Team team = teamRepository.findById(teamId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Could not find team with this id"
                ));
        teamRepository.delete(team);
        return team;
    }

}
