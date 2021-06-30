package pl.adamberezka.springmicroservicesdemouserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.adamberezka.springmicroservicesdemouserservice.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByTeamId(Integer teamId);
}
