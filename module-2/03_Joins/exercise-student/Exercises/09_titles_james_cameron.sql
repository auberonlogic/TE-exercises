-- 9. The titles of movies directed by James Cameron (6 rows)

SELECT movie.title
FROM movie
INNER JOIN person ON person.person_id = movie.director_id
WHERE person.person_name = 'James Cameron'
;