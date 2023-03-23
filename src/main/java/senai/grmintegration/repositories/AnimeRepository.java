package senai.grmintegration.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import senai.grmintegration.domain.Anime;


public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {
}
