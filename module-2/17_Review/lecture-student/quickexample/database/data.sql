DDL: Data Description language

DROP TABLE IF EXISTS person;

CREATE TABLE person (
  person_id serial primary key,
  person_name varchar(100) not null
);

INSERT INTO person VALUES (DEFAULT, 'Tom');
INSERT INTO person VALUES (DEFAULT, 'Tom');
INSERT INTO person VALUES (DEFAULT, 'Walt');
INSERT INTO person VALUES (DEFAULT, 'Ellen');
INSERT INTO person VALUES (DEFAULT, 'Stephen');