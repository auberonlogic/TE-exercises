-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.

SELECT DISTINCT g.genre_name
FROM movie m
INNER JOIN movie_genre mg USING(movie_id)
INNER JOIN genre g USING(genre_id)
INNER JOIN movie_actor ma USING(movie_id)
INNER JOIN person p ON p.person_id = ma.actor_id
WHERE p.person_name = 'Christopher Lloyd'
;