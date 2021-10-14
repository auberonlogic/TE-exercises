-- 5. The titles and release dates of all the movies that are in the Comedy genre.
-- Order the results by release date, earliest to latest. (220 rows)


SELECT movie.title, movie.release_date
FROM movie
INNER JOIN movie_genre USING(movie_id)
INNER JOIN genre USING(genre_id)
WHERE genre_name = 'Comedy'
ORDER BY movie.release_date
;