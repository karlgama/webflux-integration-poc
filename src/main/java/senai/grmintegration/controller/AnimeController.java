package senai.grmintegration.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import senai.grmintegration.domain.Anime;
import senai.grmintegration.repositories.AnimeRepository;

@RestController
@RequiredArgsConstructor
@RequestMapping("animes")
@Slf4j
public class AnimeController {
    private final AnimeRepository repository;

    @GetMapping
    public Flux<Anime> listall(){
        return repository.findAll();
    }
}
