package org.app.repository;

import org.app.entity.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {

    Optional<Anime> getAnimeByName(String name);

    Optional<Anime> getAnimeByGenre(String genre);

    Optional<Anime> getAnimeByReleaseYear(int releaseYear);

    Optional<Anime> getAnimeByStudio(String studio);

}