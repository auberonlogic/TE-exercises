-- 17. The titles and taglines of movies that are in the "Family" genre and Samuel L. Jackson has acted in (4 rows)


SELECT m.title, m.tagline
FROM movie m
INNER JOIN movie_genre mg USING(movie_id)
INNER JOIN genre g USING(genre_id)
INNER JOIN movie_actor ma USING(movie_id)
INNER JOIN person p ON p.person_id = ma.actor_id
WHERE g.genre_name = 'Family' AND p.person_name = 'Samuel L. Jackson'
;