-- 6. The genres of "The Wizard of Oz" (3 rows)


SELECT genre.genre_name
FROM movie
INNER JOIN movie_genre USING(movie_id)
INNER JOIN genre USING(genre_id)
WHERE movie.title = 'The Wizard of Oz'
;