package pl.adamberezka.springmicroservicesdemoteamservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.adamberezka.springmicroservicesdemoteamservice.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
