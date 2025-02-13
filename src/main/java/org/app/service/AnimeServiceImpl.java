package org.app.service;

import org.app.entity.Anime;
import org.app.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeServiceImpl implements AnimeService {


    @Autowired
    private AnimeRepository repository;


    @Override
    public List<Anime> getAll() {
        return repository.findAll();
    }

    @Override
    public Anime getById(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Anime create(Anime anime) {
        return repository.save(anime);
    }

    @Override
    public Anime getByName(String name) {
        return repository.getAnimeByName(name).orElse(null); //or else Throw
    }

    @Override
    public Anime getByGenre(String genre) {
        return repository.getAnimeByGenre(genre).orElse(null);
    }

    @Override
    public Anime getByReleaseYear(int releaseYear) {
        return repository.getAnimeByReleaseYear(releaseYear).orElse(null);
    }

    @Override
    public Anime getByStudio(String studio) {
        return repository.getAnimeByStudio(studio).orElse(null);
    }

    @Override
    public void remove(long id) {
        repository.deleteById(id);
    }
}