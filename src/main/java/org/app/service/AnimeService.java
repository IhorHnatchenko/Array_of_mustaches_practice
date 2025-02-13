package org.app.service;

import org.app.entity.Anime;

import java.util.List;


public interface AnimeService {

    List<Anime> getAll();

    Anime getById(long id);

    Anime create(Anime anime);

    Anime getByName(String name);

    Anime getByGenre(String genre);

    Anime getByReleaseYear(int releaseYear);

    Anime getByStudio(String studio);

    void remove(long id);
}