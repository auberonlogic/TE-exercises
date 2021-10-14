-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in.
-- Order the results by the actor names (A-Z). (48 rows)


SELECT person_name, movie.title
FROM person
INNER JOIN movie_actor ON person.person_id = movie_actor.actor_id
INNER JOIN movie USING(movie_id)
WHERE person.person_name LIKE '%Jones' AND person.person_name NOT LIKE '%Zeta%'
Order BY person_name
;