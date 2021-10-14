-- 4. The titles and taglines of all the movies that are in the Fantasy genre. Order the results by title (A-Z) (81 rows)


SELECT movie.title, movie.tagline
FROM movie
INNER JOIN movie_genre USING(movie_id)
INNER JOIN genre USING(genre_id)
WHERE genre_name = 'Fantasy'
ORDER BY movie.title
;