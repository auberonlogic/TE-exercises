-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)

SELECT DISTINCT p.person_name
FROM movie m
INNER JOIN collection c USING(collection_id)
INNER JOIN movie_actor ma USING(movie_id)
INNER JOIN person p ON ma.actor_id = p.person_id
WHERE c.collection_name = 'Back to the Future Collection'
;