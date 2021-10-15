-- 6. The genres of "The Wizard of Oz" (3 rows)


SELECT g.genre_name
FROM movie m
INNER JOIN movie_genre mg USING(movie_id)
INNER JOIN genre g USING(genre_id)
WHERE m.title = 'The Wizard of Oz'
;