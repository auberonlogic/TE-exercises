-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)
SELECT m.title, m.release_date
FROM person p
INNER JOIN movie_actor ma ON p.person_id = ma.actor_id
INNER JOIN movie m USING(movie_id)
WHERE p.person_name = 'Tom Hanks'
;