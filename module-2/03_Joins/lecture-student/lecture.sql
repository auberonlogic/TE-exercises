-- INNER JOIN
SELECT * FROM city;
SELECT * FROM state;
-- Write a query to retrieve the name and state abbreviation for the 2 cities named "Columbus" in the database
SELECT city_name, state_abbreviation
FROM city
WHERE city_name = 'Columbus'
;

-- Modify the previous query to retrieve the names of the states (rather than their abbreviations).
SELECT city.city_name, state_name
FROM city INNER JOIN state ON city.state_abbreviation = state.state_abbreviation

;

SELECT city.city_name, state_name
FROM state JOIN city ON city.state_abbreviation = state.state_abbreviation

;

-- Write a query to retrieve the names of all the national parks with their state abbreviations.
-- (Some parks will appear more than once in the results, because they cross state boundaries.)
SELECT park_name, state_abbreviation
FROM park
INNER JOIN park_state ON park.park_id = park_state.park_id

;

-- The park_state table is an associative table that can be used to connect the park and state tables.
-- Modify the previous query to retrieve the names of the states rather than their abbreviations.
SELECT park.park_name, state.state_name
FROM park
INNER JOIN park_state ON park.park_id = park_state.park_id
INNER JOIN state ON park_state.state_abbreviation = state.state_abbreviation

;

-- Modify the previous query to include the name of the state's capital city.
SELECT park.park_name, state.state_name, city.city_name AS capital
FROM park
INNER JOIN park_state ON park.park_id = park_state.park_id
INNER JOIN state ON park_state.state_abbreviation = state.state_abbreviation
INNER JOIN city ON state.capital = city.city_id
;

-- Modify the previous query to include the area of each park.
SELECT park.park_name, park.area, state.state_name, city.city_name AS capital
FROM park
INNER JOIN park_state ON park.park_id = park_state.park_id
INNER JOIN state ON park_state.state_abbreviation = state.state_abbreviation
INNER JOIN city ON state.capital = city.city_id
;

SELECT *
FROM park
INNER JOIN park_state USING(park_id)
INNER JOIN state USING(state_abbreviation)
INNER JOIN city ON city.city_id = state.capital
;

-- Write a query to retrieve the names and populations of all the cities in the Midwest census region.
SELECT city.city_name, city.population, state.census_region
FROM city
INNER JOIN state USING(state_abbreviation)
WHERE census_region = 'Midwest'
;

-- Write a query to retrieve the number of cities in the city table for each state in the Midwest census region.


-- Modify the previous query to sort the results by the number of cities in descending order.



-- LEFT JOIN

-- Write a query to retrieve the state name and the earliest date a park was established in that state (or territory)
-- for every record in the state table that has park records associated with it.
SELECT state_abbreviation, COUNT(park_id)
FROM park
INNER JOIN park_state USING(park_id)
GROUP BY state_abbreviation
ORDER BY state_abbreviation
;

-- left join takes everything from left and matches with right wherever it can
SELECT state.state_name
FROM state LEFT JOIN park_state USING(state_abbreviation)
WHERE census_region IS null
;

SELECT DISTINCT state_abbreviation
FROM park_state RIGHT JOIN state USING(state_abbreviation)
;

-- a LEFT JOIN b == b RIGHT JOIN a

-- Modify the previous query so the results include entries for all the records in the state table, even if they have no park records associated with them.



-- UNION

-- Write a query to retrieve all the place names in the city and state tables that begin with "W" sorted alphabetically.
-- (Washington is the name of a city and a state--how many times does it appear in the results?)
SELECT city_name, state_name
FROM city INNER JOIN state USING(state_abbreviation)
WHERE city_name LIKE 'W%' OR state_name LIKE 'W%'
;


SELECT city_name AS place_name, state_abbreviation
FROM city
WHERE city_name LIKE 'W%'

UNION ALL -- by default, UNION removes duplicates
-- UNION ALL is faster cause it doesn't have to parse tables for duplicates
-- columns produced by UNIONS must be same datatype.

SELECT state_name AS place_name, state_abbreviation
FROM state
WHERE state_name LIKE 'W%'
ORDER BY place_name
;

SELECT CAST(population AS varchar) AS place_name, state_abbreviation
FROM city
WHERE city_name LIKE 'W%'

UNION ALL -- by default, UNION removes duplicates
-- UNION ALL is faster cause it doesn't have to parse tables for duplicates
-- columns produced by UNIONS must be same datatype.
-- can cast different datatypes to match, but why would you lol

SELECT state_name AS place_name, state_abbreviation
FROM state
WHERE state_name LIKE 'W%'
ORDER BY place_name
;



-- Modify the previous query to include a column that indicates whether the place is a city or state.
SELECT city_name AS place_name, 'City' AS city_or_state
FROM city
WHERE city_name LIKE 'W%'

UNION  -- by default, UNION removes duplicates

SELECT state_name AS place_name, 'State' AS city_or_state
FROM state
WHERE state_name LIKE 'W%'
ORDER BY place_name
;


-- MovieDB
-- After creating the MovieDB database and running the setup script, make sure it is selected in DbVisualizer and
-- confirm it is working correctly by writing queries to retrieve...

-- The names of all the movie genres


-- The titles of all the Comedy movies



SELECT * FROM collection;
SELECT * FROM genre;
SELECT * FROM movie;
SELECT * FROM movie_actor;
SELECT * FROM movie_genre;
SELECT * FROM person;

-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in
-- include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'
SELECT *
FROM movie m
INNER JOIN ;




SELECT *
FROM person p
INNER JOIN movie m ON p.person_id = m.director_id
WHERE p.person_name LIKE 'George Cukor%'
-- GROUP BY p.person_name
;

SELECT p.person_name, COUNT(m.title) AS num_of_movies
FROM person p
LEFT JOIN movie_actor ma ON ma.actor_id = p.person_id
LEFT JOIN movie m ON p.person_id = m.director_id
WHERE p.person_name LIKE 'George %'
GROUP BY p.person_id
ORDER BY p.person_name

;


SELECT p.person_name, COUNT(m.movie_id) AS num_of_movies
FROM person p
LEFT JOIN movie_actor ma ON p.person_id = ma.actor_id
LEFT JOIN movie m USING(movie_id)
WHERE p.person_name LIKE 'George %'
GROUP BY p.person_id
ORDER BY p.person_name
;




SELECT m.title, m.length_minutes, m.release_date
FROM movie m
INNER JOIN movie_genre mg USING(movie_id)
INNER JOIN genre g USING(genre_id)
WHERE g.genre_name = 'Action'
ORDER BY m.length_minutes DESC, m.release_date DESC
LIMIT 5
;




SELECT g.genre_name, COUNT(g.genre_name)
FROM movie m
INNER JOIN movie_genre mg USING(movie_id)
INNER JOIN genre g USING(genre_id)
GROUP BY g.genre_name
;





SELECT m.title, m.tagline, g.genre_name
FROM movie m
INNER JOIN movie_genre mg USING(movie_id)
INNER JOIN genre g USING(genre_id)
INNER JOIN movie_actor ma USING(movie_id)
INNER JOIN person p ON p.person_id = ma.actor_id
WHERE g.genre_name = 'Family' AND p.person_name = 'Samuel L. Jackson'
;



SELECT DISTINCT p.person_name, p.birthday
FROM person p
INNER JOIN movie_actor ma ON ma.actor_id = p.person_id
INNER JOIN movie m USING(movie_id)
WHERE p.birthday BETWEEN '1950-01-01' AND '1959-12-31' AND m.release_date BETWEEN '1985-01-01' AND '1985-12-31'
;





SELECT DISTINCT person.person_name
FROM movie
INNER JOIN collection USING(collection_id)
INNER JOIN movie_actor USING(movie_id)
INNER JOIN person ON movie_actor.actor_id = person.person_id
WHERE collection.collection_name = 'Back to the Future Collection'
;

-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)
SELECT m.title, p.person_name, m.director_id
FROM movie m -- renames movie to m
INNER JOIN movie_actor ma ON m.movie_id = ma.movie_id AND ma.actor_id = m.director_id
INNER JOIN person p ON ma.actor_id = p.person_id
;

SELECT m.title, p.person_name, m.director_id
FROM movie m -- renames movie to m
INNER JOIN movie_actor ma ON m.movie_id = ma.movie_id
INNER JOIN person p ON ma.actor_id = p.person_id
WHERE ma.actor_id = m.director_id
;



-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)

SELECT DISTINCT p.person_name, p.birthday
FROM person p
INNER JOIN movie_actor ma ON ma.actor_id = p.person_id
INNER JOIN movie m USING(movie_id)
WHERE p.birthday BETWEEN '1950-01-01' AND '1959-12-31' AND m.release_date BETWEEN '1985-01-01' AND '1985-12-31'
;

SELECT p.person_name, m.title, m.overview
FROM person p
JOIN movie_actor ma ON p.person_id = ma.actor_id
JOIN movie m USING(movie_id)
WHERE p.person_name LIKE '%W. Bush'
;



-- 17. The titles and taglines of movies that are in the "Family" genre and Samuel L. Jackson has acted in (4 rows)


SELECT m.title, m.tagline, m.overview
FROM movie m
INNER JOIN movie_genre mg USING(movie_id)
INNER JOIN genre g USING(genre_id)
INNER JOIN movie_actor ma USING(movie_id)
INNER JOIN person p ON p.person_id = ma.actor_id
WHERE g.genre_name = 'Family' AND p.person_name = 'Samuel L. Jackson'
;

SELECT m.title, m.release_date, p.person_name
FROM movie m
JOIN movie_actor ma USING(movie_id)
JOIN person p ON p.person_id = ma.actor_id
WHERE title = 'Snakes on a Plane'
;


SELECT p.person_name, COUNT(m.title) AS num_movies
FROM movie m
JOIN movie_actor ma USING(movie_id)
JOIN person p ON p.person_id = ma.actor_id
GROUP BY p.person_name
ORDER BY num_movies DESC
;

-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in
-- include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'

SELECT p.person_name, COUNT(m.movie_id) AS num_of_movies
FROM person p
LEFT JOIN movie_actor ma ON p.person_id = ma.actor_id
LEFT JOIN movie m USING(movie_id)
WHERE p.person_name LIKE 'George %'
GROUP BY p.person_id
ORDER BY p.person_name
;


--------------------- Playing around ---------------------

-- Write a query that returns the count of movies for all actors born on a leap day

SELECT p.person_name, p.birthday AS leap_day_birthdays, COUNT(ma.movie_id) AS num_of_movies
FROM person p
JOIN movie_actor ma ON p.person_id = ma.actor_id
JOIN movie m USING(movie_id)
WHERE CAST(p.birthday AS varchar) LIKE '%02-29%'
GROUP BY p.person_id
ORDER BY num_of_movies DESC, leap_day_birthdays
;



-- Write a query that returns a new column actor_age in leap years for all actors born on a leap day
SELECT p.person_name, p.birthday AS leap_day_birthdays, p.deathday, date_part('year',AGE(p.birthday))::int AS age,  (date_part('year', AGE(p.birthday)) / 4) AS leap_year_age, COUNT(m.movie_id) AS num_of_movies -- how do I get their age from their birthday?
                                                                                  -- And if I divide age by 4 will it be accurate?
FROM person p
JOIN movie_actor ma ON p.person_id = ma.actor_id
JOIN movie m USING(movie_id)
WHERE CAST(p.birthday AS varchar) LIKE '%02-29%' AND deathday IS null
GROUP BY p.person_id
--ORDER BY p.person_name

UNION ALL -- so that people who are dead are not aged to the current date

SELECT p.person_name, p.birthday AS leap_day_birthdays, p.deathday, date_part('year',AGE(p.deathday, p.birthday))::int AS age, (date_part('year',AGE(p.deathday, p.birthday)) / 4) AS leap_year_age, COUNT(m.movie_id) AS num_of_movies
FROM person p
JOIN movie_actor ma ON p.person_id = ma.actor_id
JOIN movie m USING(movie_id)
WHERE CAST(p.birthday AS varchar) LIKE '%02-29%' AND deathday IS NOT null
GROUP BY p.person_id
ORDER BY deathday
;

-- create a collection called 'Leap Day Babies Movie Collection'
-- associate it with any movies with an actor who was born on a leap day





-- number of movies for each actor born in June

SELECT p.person_name, p.birthday AS june_birthdays, COUNT(ma.movie_id) AS num_of_movies
FROM person p
JOIN movie_actor ma ON p.person_id = ma.actor_id
JOIN movie m USING(movie_id)
WHERE CAST(p.birthday AS varchar) LIKE '%-06-%'
GROUP BY p.person_id
ORDER BY num_of_movies DESC, p.person_name
;


-- number of movies for each actor born in June whose last name begins with "T"

SELECT p.person_name, p.birthday AS june_birthdays, COUNT(ma.movie_id) AS num_of_movies
FROM person p
JOIN movie_actor ma ON p.person_id = ma.actor_id
JOIN movie m USING(movie_id)
WHERE --CAST(p.birthday AS varchar) LIKE '%-06-%' AND 
p.person_name LIKE '% T%' AND p.person_name NOT LIKE '% T.%' -- excludes T as a middle initial
GROUP BY p.person_id
ORDER BY num_of_movies DESC, p.person_name
;


-- number of movies an actor has been in with other actors from the database. number of same movies?




