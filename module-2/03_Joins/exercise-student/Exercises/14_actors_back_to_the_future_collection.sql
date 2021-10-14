-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)

SELECT DISTINCT person.person_name
FROM movie
INNER JOIN collection USING(collection_id)
INNER JOIN movie_actor USING(movie_id)
INNER JOIN person ON movie_actor.actor_id = person.person_id
WHERE collection.collection_name = 'Back to the Future Collection'
;