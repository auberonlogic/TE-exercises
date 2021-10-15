-- 4. The titles and taglines of all the movies that are in the Fantasy genre. Order the results by title (A-Z) (81 rows)


SELECT m.title, m.tagline
FROM movie m
INNER JOIN movie_genre mg USING(movie_id)
INNER JOIN genre g USING(genre_id)
WHERE g.genre_name = 'Fantasy'
ORDER BY m.title
;