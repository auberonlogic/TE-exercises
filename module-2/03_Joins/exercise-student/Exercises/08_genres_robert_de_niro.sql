-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)


SELECT DISTINCT g.genre_name
FROM movie m
INNER JOIN movie_genre mg USING(movie_id)
INNER JOIN genre g USING(genre_id)
INNER JOIN movie_actor ma USING(movie_id)
INNER JOIN person p ON p.person_id = ma.actor_id
WHERE p.person_name = 'Robert De Niro' AND m.release_date >= '2010-01-01'
;