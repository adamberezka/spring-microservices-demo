package pl.adamberezka.springmicroservicesdemoteamservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.adamberezka.springmicroservicesdemoteamservice.model.Team;
import pl.adamberezka.springmicroservicesdemoteamservice.service.TeamService;

import java.util.List;

@RestController
@RequestMapping("/team")
public class ApiController {

    private final TeamService teamService;

    public ApiController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public ResponseEntity<List<Team>> getTeams(){
        return ResponseEntity.ok(teamService.getTeams());
    }

    @GetMapping("/{teamId}")
    public ResponseEntity<Team> getTeam(@PathVariable Integer teamId){
        return ResponseEntity.ok(teamService.getTeam(teamId));
    }

    @PostMapping
    public ResponseEntity<Team> createTeam(@RequestBody Team team){
        return ResponseEntity.ok(teamService.createTeam(team));
    }

    @PutMapping
    public ResponseEntity<Team> updateTeam(@RequestBody Team team){
        return ResponseEntity.ok(teamService.updateTeam(team));
    }

    @DeleteMapping("/{teamId}")
    public ResponseEntity<Team> deleteTeam(@PathVariable Integer teamId){
        return ResponseEntity.ok(teamService.deleteTeam(teamId));
    }

}
