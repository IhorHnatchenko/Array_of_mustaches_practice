package org.app.service;

import org.app.entity.Anime;

import java.util.List;


public interface AnimeService {

    List<Anime> getAll();

    Anime getById(long id);

    Anime create(Anime anime);

    void remove (long id);

}
