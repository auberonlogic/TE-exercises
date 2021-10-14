-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)

SELECT DISTINCT person.person_name
FROM movie
INNER JOIN collection USING(collection_id)
INNER JOIN person ON movie.director_id = person.person_id
WHERE collection.collection_name = 'Harry Potter Collection'
;