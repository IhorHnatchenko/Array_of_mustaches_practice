package org.app.service;

import org.app.entities.Anime;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AnimeService {

    List<Anime> getAll();

    Anime getById(long id);

    Anime create(Anime anime);

    void remove (long id);

}
