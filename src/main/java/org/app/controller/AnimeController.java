package org.app.controller;

import org.app.entities.Anime;
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
    public Anime getById(@PathVariable(name = "id") long id){
        return service.getById(id);
    }

    @PostMapping
    public Anime create(@RequestBody Anime anime){
        return service.create(anime);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable(name = "id") long id){
        service.remove(id);
    }
}
