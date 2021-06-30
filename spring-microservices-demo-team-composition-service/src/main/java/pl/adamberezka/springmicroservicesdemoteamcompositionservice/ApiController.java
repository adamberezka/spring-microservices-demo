package pl.adamberezka.springmicroservicesdemoteamcompositionservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import pl.adamberezka.springmicroservicesdemoteamcompositionservice.model.Team;
import pl.adamberezka.springmicroservicesdemoteamcompositionservice.model.TeamInfoResponse;
import pl.adamberezka.springmicroservicesdemoteamcompositionservice.model.User;

import java.util.List;

@RestController
@RequestMapping("/team-info")
public class ApiController {

    private final WebClient.Builder webClientBuilder;

    public ApiController(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    @GetMapping("/{teamId}")
    public ResponseEntity<TeamInfoResponse> getTeamInfo(@PathVariable Integer teamId){
        Team team = webClientBuilder
                .build()
                .get()
                .uri("http://team-service/team/"+teamId)
                .retrieve()
                .bodyToMono(Team.class)
                .block();

        List<User> userList = webClientBuilder
                .build()
                .get()
                .uri("http://user-service/user/byTeam/"+teamId)
                .retrieve()
                .bodyToFlux(User.class).collectList().block();

        return ResponseEntity.ok(
                new TeamInfoResponse(
                        team,
                        userList
        ));
    }

}
