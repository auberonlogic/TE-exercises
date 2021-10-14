-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent to earliest (9 rows)

SELECT movie.title
FROM movie
INNER JOIN collection USING(collection_id)
WHERE collection.collection_name = 'Star Wars Collection'
ORDER BY release_date DESC
;