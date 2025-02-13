package org.app.controller;

import org.app.entity.Anime;
import org.app.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Anime")
public class AnimeController {

    @Autowired
    private AnimeService service;

    @GetMapping
    public List<Anime> getAll() {
        return service.getAll();
    }


    @GetMapping("/{id}")
    public Anime getById(@PathVariable(name = "id") long id) {
        return service.getById(id);
    }

    @GetMapping("/{name}")
    public Anime getByName(@PathVariable(name = "name") String name) {
        return service.getByName(name);
    }

    @GetMapping("/{genre}")
    public Anime getByGenre(@PathVariable(name = "genre") String genre) {
        return service.getByGenre(genre);
    }

    @GetMapping("/{releaseYear}")
    public Anime getByReleaseYear(@PathVariable(name = "releaseYear") int releaseYear) {
        return service.getByReleaseYear(releaseYear);
    }

    @GetMapping("/{studio}")
    public Anime getByStudio(@PathVariable(name = "studio") String studio) {
        return service.getByStudio(studio);
    }

    @PostMapping
    public Anime create(@RequestBody Anime anime) {
        return service.create(anime);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable(name = "id") long id) {
        service.remove(id);
    }
}