-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)

SELECT movie.title
FROM movie
INNER JOIN collection USING(collection_id)
INNER JOIN person ON movie.director_id = person.person_id
WHERE collection.collection_name = 'Star Wars Collection' AND person.person_name != 'George Lucas'
;