-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.

SELECT DISTINCT genre.genre_name
FROM movie
INNER JOIN movie_genre USING(movie_id)
INNER JOIN genre USING(genre_id)
INNER JOIN movie_actor  USING(movie_id)
INNER JOIN person ON person.person_id = movie_actor.actor_id
WHERE person.person_name = 'Christopher Lloyd'
;