-- INSERT

-- Add Disneyland to the park table. (It was established on 7/17/1955, has an area of 0.78 square miles and does not offer camping.)
SELECT * FROM park;
INSERT INTO park (park_name, date_established, area, has_camping)
VALUES ('Disneyland', '1995-07-17', .78, false);

-- Add Hawkins, IN (with a population of 30,000 and an area of 14.71 square miles) and Cicely, AK (with a popuation of 839 and an area of 4.39 square miles) to the city table.
SELECT * FROM city;
INSERT INTO city VALUES (DEFAULT, 'Hawkins', 'IN', 60000, 14.71);
-- If you don't specify columns, it will fill all columns in order
-- BUT, what about primary key? ---> use DEFAULT

-- Since Disneyland is in California (CA), add a record representing that to the park_state table.
SELECT * FROM park_state;
INSERT INTO park_state (park_id, state_abbreviation) SELECT park_id, 'CA' AS state_abbreviation FROM park WHERE park_name = 'Disneyland';

SELECT park_id, 'CA' AS state_abbreviation FROM park WHERE park_name = 'Disneyland'; -- develop query first to get it right, then put it into the INSERT

-- UPDATE

-- Change the state nickname of California to "The Happiest Place on Earth."
SELECT * FROM state ORDER BY state_abbreviation;

UPDATE state
SET state_nickname = 'The Happiest Place on Earth'
WHERE state_abbreviation = 'CA'
;

-- Increase the population of California by 1,000,000.
UPDATE state
SET population = population - 1000000
WHERE state_abbreviation = 'CA'
;

-- Change the capital of California to Anaheim.
UPDATE state
SET capital = (SELECT city_id FROM city WHERE city_name = 'Anaheim' AND state_abbreviation = 'CA')
WHERE state_abbreviation = 'CA'
;

(SELECT city_id FROM city WHERE city_name = 'Anaheim' AND state_abbreviation = 'CA');
SELECT * FROM state WHERE state_abbreviation = 'CA';
SELECT city_name, state_name FROM state JOIN city ON state.capital = city.city_id;

-- Change California's nickname back to "The Golden State", reduce the population by 1,000,000, and change the capital back to Sacramento.
UPDATE state
SET population = population + 1000000,
    state_nickname = 'The Golden State',
    capital = (SELECT city_id FROM city WHERE city_name = 'Sacramento' AND state_abbreviation = 'CA')
WHERE state_abbreviation = 'CA';


-- DELETE

-- Delete Hawkins, IN from the city table.
SELECT * FROM city WHERE city_name = 'Hawkins';
DELETE FROM city WHERE city_id = (SELECT city_id FROM city WHERE city_name = 'Hawkins');

-- Delete all cities with a population of less than 1,000 people from the city table.
DELETE FROM city WHERE population < 1000;


-- REFERENTIAL INTEGRITY

-- Try adding a city to the city table with "XX" as the state abbreviation.
SELECT * FROM city;
SELECT * FROM state;
INSERT INTO city VALUES (DEFAULT, 'Gotham', 'XX', 330000000, 1000);
-- Cannot create a city from a state that does not exist.
-- Foreign Key constraint. XX is not a state_abbreviation in state table


-- Try deleting California from the state table.
DELETE FROM state WHERE state_abbreviation = 'CA';

-- Try deleting Disneyland from the park table. Try again after deleting its record from the park_state table.
SELECT * FROM park;
DELETE FROM park_state WHERE park_id = (SELECT park_id FROM park WHERE park_name = 'Disneyland');
DELETE FROM park WHERE park_name = 'Disneyland';

SELECT * FROM park_state;

-- CONSTRAINTS

-- NOT NULL constraint
-- Try adding Smallville, KS to the city table without specifying its population or area.
SELECT * FROM city;
INSERT INTO city (city_name, state_abbreviation) VALUES ('Smallville', 'KS');

-- DEFAULT constraint
-- Try adding Smallville, KS again, specifying an area but not a population.
INSERT INTO city (city_name, state_abbreviation, area) VALUES ('Smallville', 'KS', 10);
SELECT * FROM city WHERE city_name = 'Smallville';
-- population can be a default value of 0 if you haven't entered it. But area must be a set value. Not null constraint

-- Retrieve the new record to confirm it has been given a default, non-null value for population.


-- UNIQUE constraint
-- Try changing California's nickname to "Vacationland" (which is already the nickname of Maine).
SELECT * FROM state;
UPDATE state SET state_nickname = 'Vacationland' WHERE state_abbreviation = 'CA';

-- CHECK constraint
-- Try changing the census region of Florida (FL) to "Southeast" (which is not a valid census region).
UPDATE state
SET census_region = 'Southeast'
WHERE state_abbreviation = 'FL';

SELECT DISTINCT census_region FROM state;

SELECT * FROM city;
-- TRANSACTIONS
-- Start transaction
--   do some stuff (Inserts, Updates, Deletes, etc)
--   ... (doesn't count until COMMIT)
--   COMMIT / ROLLBACK


-- Delete the record for Smallville, KS within a transaction.
SELECT * FROM city WHERE city_name = 'Smallville';
START TRANSACTION;
DELETE FROM city WHERE city_name = 'Smallville';
ROLLBACK;
COMMIT;

-- Delete all of the records from the park_state table, but then "undo" the deletion by rolling back the transaction.
SELECT * FROM park_state;
START TRANSACTION;
DELETE FROM park_state;

ROLLBACK;

-- Update all of the cities to be in the state of Texas (TX), but then roll back the transaction.
SELECT * FROM city;
START TRANSACTION;
UPDATE city SET state_abbreviation = 'TX';
SELECT * FROM city;
ROLLBACK;

-- Demonstrate two different SQL connections trying to access the same table where one is inside of a transaction but hasn't committed yet.
SELECT * FROM state;
SELECT city_name, state_name FROM state JOIN city ON (state.state_abbreviation = city.state_abbreviation);
START TRANSACTION;
UPDATE state SET capital = (SELECT city_id FROM city WHERE city_name = 'Pittsburgh');
ROLLBACK;


-- 1. Add a new person to the person table with the name "Lisa Byway" with the birthday of 4/15/1984 (1 row)

SELECT * FROM person;
INSERT INTO person (person_name, birthday) VALUES ('Lisa Byway', '1984-04-15');

-- 2. Add "Euclidean Pi" to the movie table. The overview is "The epic story of Euclid as a pizza delivery boy in ancient Greece"
-- and was released 3/14/2015. Since its an epic, the run length is 3 hours and 14 minutes (194 minutes). (1 row)

SELECT * FROM movie;

INSERT INTO movie (title, overview, release_date, length_minutes)
VALUES ('Euclidean Pi', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', '2015-03-14', 194)
;

-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? Add Eric Stoltz to the list of actors for
-- "Back to the Future" (1 row)


INSERT INTO movie_actor (movie_id, actor_id)
VALUES ((SELECT movie_id FROM movie WHERE title = 'Back to the Future'), (SELECT person_id FROM person WHERE person_name = 'Eric Stoltz'))
;



SELECT p.person_name, p.person_id, m.title, m.movie_id
FROM person p
JOIN movie_actor ma ON ma.actor_id = p.person_id
JOIN movie m USING(movie_id)
WHERE p.person_name = 'Eric Stoltz'
;

-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)
SELECT * FROM genre;
SELECT * FROM movie;

INSERT INTO genre (genre_name) VALUES ('Sports');
INSERT INTO movie_genre (movie_id, genre_id)
VALUES ((SELECT movie_id FROM movie WHERE title = 'Coach Carter'), (SELECT genre_id FROM genre WHERE genre_name = 'Sports'));


-- 5. The movie "Star Wars" was originally released by that name because it wasn't known if there would be a sequel.
-- After the subsequent movies came out, it was retroactively re-titled "Star Wars: A New Hope".
-- Update the title in the movie table to "Star Wars: A New Hope" (1 row)

SELECT * FROM movie WHERE title LIKE 'Star Wars%';
UPDATE movie
SET title = 'Star Wars: A New Hope'
WHERE title = 'Star Wars';

-- 6. For movies that are longer than 3 hours and 30 minutes (210 minutes), add the sentence "This is a long movie." to the end of the overview. (5 rows)
-- Note: The overviews end in a period with no trailing spaces. You'll need to also add a space before the new sentence.

SELECT * FROM movie;
SELECT * FROM movie WHERE length_minutes > 210;

UPDATE movie
SET overview = overview || ' This is a long movie.'
WHERE length_minutes > 210;


-- 7. Remove the actor appearances in "Avengers: Infinity War" (14 rows)
-- Note: Don't remove the actors themeselves, just make it so it seems no one appeared in the movie.


SELECT * FROM movie_actor WHERE movie_id = (SELECT movie_id FROM movie WHERE title = 'Avengers: Infinity War');

DELETE FROM movie_actor WHERE movie_id = (SELECT movie_id FROM movie WHERE title = 'Avengers: Infinity War');


-- 8. Remove "Penn Jillette" from the person table 
-- You'll have to remove data from another table before you can make him "disappear" (Get it? Because he's a magician...) (1 row each)

SELECT p.person_name, m.title
FROM person p
JOIN movie_actor ma ON ma.actor_id = p.person_id
JOIN movie m USING(movie_id)
WHERE p.person_name = 'Penn Jillette';

DELETE FROM movie_actor WHERE actor_id = (SELECT person_id FROM person WHERE person_name = 'Penn Jillette');
DELETE FROM person WHERE person_name = 'Penn Jillette';

-- 9. Remove "Memento" from the movie table
-- You'll have to remove data from two other tables before you can remove it (13 rows, 2 rows, 1 row)


SELECT * FROM movie WHERE title = 'Memento';

DELETE FROM movie_genre WHERE movie_id = (SELECT movie_id FROM movie WHERE title = 'Memento');
DELETE FROM movie_actor WHERE movie_id = (SELECT movie_id FROM movie WHERE title = 'Memento');
DELETE FROM movie WHERE title = 'Memento';


-- 10. For all people born before 1950 and have a home page, add the home page to the end of their biography. (142 rows)
-- Note: Assume all biographies end in a period with no trailing spaces. You'll need to also add a space before the website address.

SELECT * FROM person
WHERE birthday < '1950-01-01' AND home_page IS NOT null;

UPDATE person
SET biography = biography || ' ' || home_page
WHERE birthday < '1950-01-01' AND home_page IS NOT null;


-- 11. Hollywood is remaking the classic movie "The Blob" and doesn't have a director yet.
-- Add yourself to the person table, and assign yourself as the director of "The Blob" (the movie is already in the movie table).
-- (1 record each)

SELECT * FROM person WHERE person_name = 'Ryan Theerman';

INSERT INTO person  VALUES (DEFAULT, 'Ryan Theerman', '1987-12-15', null, 'Ryan was born in a state of ignorance and has been trying to fix that ever since.', null, null);
UPDATE movie
Set director_id = (SELECT person_id FROM person WHERE person_name = 'Ryan Theerman')
WHERE title = 'The Blob';

SELECT director_id FROM movie;


-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them,
-- set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)

SELECT p.person_name, m.title, c.collection_name
FROM movie m
JOIN movie_actor ma USING(movie_id)
JOIN person p ON ma.actor_id = p.person_id
LEFT JOIN collection c USING(collection_id)
WHERE p.person_name = 'Bill Murray'
;


INSERT INTO collection (collection_name)
VALUES ('Bill Murray Collection');

UPDATE movie
SET collection_id = (SELECT collection_id 
                     FROM collection 
                     WHERE collection_name = 'Bill Murray Collection')
WHERE movie_id = (SELECT movie_id 
                  FROM movie_actor 
                  WHERE actor_id = (SELECT person_id 
                                    FROM person 
                                    WHERE person_name = 'Bill Murray'));
                                    


UPDATE movie
SET collection_id = (SELECT collection_id 
                     FROM collection 
                     WHERE collection_name = 'Bill Murray Collection')
WHERE movie_id IN (SELECT movie_id 
                  FROM movie_actor 
                  WHERE actor_id = (SELECT person_id 
                                    FROM person 
                                    WHERE person_name = 'Bill Murray'));


SELECT p.person_name, m.title, m.collection_id
FROM person p 
JOIN movie_actor ma ON ma.actor_id = p.person_id
LEFT JOIN movie m USING(movie_id)
WHERE person_name = 'Bill Murray';


SELECT * FROM collection;

INSERT INTO genre (genre_name) VALUES ('Sports');
INSERT INTO movie_genre (movie_id, genre_id)
VALUES ((SELECT movie_id FROM movie WHERE title = 'Coach Carter'), (SELECT genre_id FROM genre WHERE genre_name = 'Sports'));

SELECT title, release_date FROM movie ORDER BY release_date;

SELECT p.person_name, m.title 
FROM movie m
JOIN movie_actor ma USING(movie_id)
JOIN person p ON p.person_id = ma.actor_id
WHERE p.person_name = 'Tom Cruise'
;


SELECT m.title, p.person_name, m.director_id
FROM movie m
JOIN person p ON m.director_id = p.person_id
ORDER BY p.person_name
;