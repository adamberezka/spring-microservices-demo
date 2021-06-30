package pl.adamberezka.springmicroservicesdemouserservice.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pl.adamberezka.springmicroservicesdemouserservice.model.User;
import pl.adamberezka.springmicroservicesdemouserservice.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(Integer userId){
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Could not find user with thi)s ID"));
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public User deleteUser(Integer userId){
        User user = userRepository.findById(userId).
                orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Could not find user with this ID"
        ));
        userRepository.delete(user);
        return user;
    }

    public List<User> getUsersInTeam(Integer teamId) {
        return userRepository.findAllByTeamId(teamId);
    }
}
