-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)


SELECT DISTINCT genre.genre_name
FROM movie
INNER JOIN movie_genre USING(movie_id)
INNER JOIN genre USING(genre_id)
INNER JOIN movie_actor  USING(movie_id)
INNER JOIN person ON person.person_id = movie_actor.actor_id
WHERE person.person_name = 'Robert De Niro' AND movie.release_date >= '2010-01-01'
;