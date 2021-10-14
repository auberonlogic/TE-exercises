-- 11. Hollywood is remaking the classic movie "The Blob" and doesn't have a director yet. Add yourself to the person table, and assign yourself as the director of "The Blob" (the movie is already in the movie table). (1 record each)
INSERT INTO person  VALUES (DEFAULT, 'Ryan Theerman', '1987-12-15', null, 'Ryan was born in a state of ignorance and has been trying to fix that ever since.', null, null);
UPDATE movie
SET director_id = (SELECT person_id FROM person WHERE person_name = 'Ryan Theerman')
WHERE title = 'The Blob';