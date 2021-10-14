-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)
SELECT title, release_date
FROM person
INNER JOIN movie_actor ON person.person_id = movie_actor.actor_id
INNER JOIN movie USING(movie_id)
WHERE person_name = 'Tom Hanks'
;