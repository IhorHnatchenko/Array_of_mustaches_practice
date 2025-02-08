create table Anime(
    id bigint primary key auto_increment,
    name varchar(255),
    max_number_of_seasons int,
    max_number_of_episodes int,
    studio varchar(255),
    description varchar(255),
    release_year int,
    genre varchar(255)
);