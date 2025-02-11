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
    public void remove(long id) {
        repository.deleteById(id);
    }
}
