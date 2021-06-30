package pl.adamberezka.springmicroservicesdemouserservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.adamberezka.springmicroservicesdemouserservice.model.User;
import pl.adamberezka.springmicroservicesdemouserservice.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ApiController {

    private final UserService userService;

    public ApiController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok(userService.getUsers());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable Integer userId){
        return ResponseEntity.ok(userService.getUser(userId));
    }

    @GetMapping("/byTeam/{teamId}")
    public ResponseEntity<List<User>> getUsersByTeamId(@PathVariable Integer teamId){
        return ResponseEntity.ok(userService.getUsersInTeam(teamId));
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok(userService.createUser(user));
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<User> deleteUser(@PathVariable Integer userId){
        return ResponseEntity.ok(userService.deleteUser(userId));
    }
}
