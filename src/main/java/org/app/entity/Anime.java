package org.app.entity;



import javax.persistence.*;

@Entity
@Table(name = "Anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int maxNumberOfSeasons;

    private int maxNumberOfEpisodes;

    private String studio;

    private String description;

    // Здесь в будущем нужно сделать это с помощью enums
    private int releaseYear;

    // Здесь в будущем нужно сделать это с помощью enums
    private String genre;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNumberOfSeasons() {
        return maxNumberOfSeasons;
    }

    public void setMaxNumberOfSeasons(int MAX_number_of_seasons) {
        this.maxNumberOfSeasons = MAX_number_of_seasons;
    }

    public int getMaxNumberOfEpisodes() {
        return maxNumberOfEpisodes;
    }

    public void setMaxNumberOfEpisodes(int MAX_number_of_episodes) {
        this.maxNumberOfEpisodes = MAX_number_of_episodes;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxNumberOfSeasons=" + maxNumberOfSeasons +
                ", maxNumberOfEpisodes=" + maxNumberOfEpisodes +
                ", studio='" + studio + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre='" + genre + '\'' +
                '}';
    }
}
