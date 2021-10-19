
DROP TABLE IF EXISTS event_member;
DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS group_member;
DROP TABLE IF EXISTS interest_group;
DROP TABLE IF EXISTS member;


CREATE TABLE member (
  member_id serial PRIMARY KEY,
  member_last_name varchar(50) NOT NULL,
  member_first_name varchar(50) NOT NULL,
  email varchar(50) NOT NULL UNIQUE,
  phone numeric,
  date_of_birth timestamp NOT NULL,
  reminder_emails boolean NOT NULL DEFAULT false
);

CREATE TABLE interest_group (
  group_id serial PRIMARY KEY,
  group_name varchar(50) UNIQUE
);


CREATE TABLE group_member (
  group_id int NOT NULL,
  member_id int NOT NULL,
  CONSTRAINT pk_group_member PRIMARY KEY (group_id, member_id), 
  CONSTRAINT fk_group_member_group FOREIGN KEY (group_id) REFERENCES interest_group (group_id),
  CONSTRAINT fk_group_member_member FOREIGN KEY (member_id) REFERENCES member (member_id)
);

CREATE TABLE event (
  event_id serial PRIMARY KEY,
  event_name varchar(200) NOT NULL,
  description varchar(1000) NOT NULL,
  start_date_and_time timestamp NOT NULL,
  duration_in_minutes int DEFAULT 30,
  group_id int,
  
  CONSTRAINT fk_event_group FOREIGN KEY (group_id) REFERENCES interest_group (group_id)
);

CREATE TABLE event_member (
  event_id int NOT NULL,
  member_id int NOT NULL,
  CONSTRAINT pk_event_member PRIMARY KEY (event_id, member_id),
  CONSTRAINT fk_event_member_event FOREIGN KEY (event_id) REFERENCES event (event_id),
  CONSTRAINT fk_event_member_member FOREIGN KEY (member_id) REFERENCES member (member_id)
);

--Populate the tables with data for at least four events, three groups, and eight members.
--Make sure each event has at least one member assigned to it, and each group has at least two members.




INSERT INTO member VALUES (DEFAULT, 'Lumbergh', 'Bill', 'bill.lumbergh@initech.com', 5104793881, '1956-09-20', true);
INSERT INTO member VALUES (DEFAULT, 'Gibbons', 'Peter', 'peter.gibbons@initech.com', null, '1967-06-05', false);
INSERT INTO member VALUES (DEFAULT, 'Aniston', 'Joanna', 'joanna.aniston@chotchkies.com', 2104160233, '1969-02-11', false);
INSERT INTO member VALUES (DEFAULT, 'Waddams', 'Milton', 'milton.waddams@initech.com', 2106663980, '1951-11-17', true);
INSERT INTO member VALUES (DEFAULT, 'Bolton', 'Michael', 'michael.bolton.no.relation@initech.com', 9858765023, '1967-02-20', false);
INSERT INTO member VALUES (DEFAULT, 'Nagheenanajar', 'Samir', 'samir.nagheenanajar@initech.com', 2106194522, '1972-02-12', false);
INSERT INTO member VALUES (DEFAULT, 'Smykowski', 'Tom', 'tom.smykowski@jumptoconclusionsmat.com', null, '1948-05-12', true);
INSERT INTO member VALUES (DEFAULT, 'Slydell', 'Bob', 'bob.slydell@humanresourcesolutions.com', 5629836219, '1959-08-03', true);

-- (group_id, group_name)
INSERT INTO interest_group VALUES (DEFAULT, 'Michael Bolton Music Lovers');
INSERT INTO interest_group VALUES (DEFAULT, 'Copy Machine Haters');
INSERT INTO interest_group VALUES (DEFAULT, 'TPS Report Appreciators');
INSERT INTO interest_group VALUES (DEFAULT, 'Stapler Enthusiasts');
INSERT INTO interest_group VALUES (DEFAULT, 'Initech Defrauders');

-- (group_id, member_id)
INSERT INTO group_member VALUES (1, 1);
INSERT INTO group_member VALUES (1, 7);
INSERT INTO group_member VALUES (1, 8);

INSERT INTO group_member VALUES (2, 2);
INSERT INTO group_member VALUES (2, 5);
INSERT INTO group_member VALUES (2, 6);

INSERT INTO group_member VALUES (3, 1);
INSERT INTO group_member VALUES (3, 7);

INSERT INTO group_member VALUES (4, 1);
INSERT INTO group_member VALUES (4, 4);

INSERT INTO group_member VALUES (5, 2);
INSERT INTO group_member VALUES (5, 5);
INSERT INTO group_member VALUES (5, 6);

-- (event_id, event_name, description, start_date_and_time, duration_in_minutes, group_id)
INSERT INTO event VALUES (DEFAULT, 'Michael Bolton Anniversary Tour', 'It is that time again. Michael Bolton, whoever he is, will deliver the performance of a lifetime. Do not miss out!', '2021-11-15 20:00:00', 120, 1);
INSERT INTO event VALUES (DEFAULT, 'Destroy the Copy Machine', 'Are you tired of your documents being eaten by Initechs POS copier? So are we! Join us to beat the hell out of it with a baseball bat. Damn it feels good to be a gangster.', '2021-10-20 15:30:00', DEFAULT, 2);
INSERT INTO event VALUES (DEFAULT, 'Staff Meeting', 'Join the rest of the team Saturday morning before dawn. We are discussing the many benefits of TPS reports, as well as the value of coming into work on your day off. Be there or get fired.', '2021-10-23 04:45:00', 300, 3);
INSERT INTO event VALUES (DEFAULT, 'Stapler Party', 'It is like a tupperware party, but with staplers. I do not know what a tupperware party is, but it sounds as lame as a stapler party. Come on down!', '2021-12-15 17:00:00', 60, 4);
INSERT INTO event VALUES (DEFAULT, 'Rip Off the Company Strategy Meeting', 'We will be discussing the details of how best to defraud our employer without being sent to federal fu... prison. Lumbergh cannot come. All others welcome.', '2021-10-19 19:00:00', 180, 5);

-- (event_id, member_id)
INSERT INTO event_member VALUES (1, 1);
INSERT INTO event_member VALUES (1, 8);
INSERT INTO event_member VALUES (1, 2);
INSERT INTO event_member VALUES (1, 6);

INSERT INTO event_member VALUES (2, 2);
INSERT INTO event_member VALUES (2, 5);
INSERT INTO event_member VALUES (2, 6);

INSERT INTO event_member VALUES (3, 1);
INSERT INTO event_member VALUES (3, 5);
INSERT INTO event_member VALUES (3, 6);
INSERT INTO event_member VALUES (3, 7);
INSERT INTO event_member VALUES (3, 8);

INSERT INTO event_member VALUES (4, 1);
INSERT INTO event_member VALUES (4, 4);
INSERT INTO event_member VALUES (4, 8);

INSERT INTO event_member VALUES (5, 2);
INSERT INTO event_member VALUES (5, 5);
INSERT INTO event_member VALUES (5, 6);
INSERT INTO event_member VALUES (5, 4);



SELECT * FROM member;
SELECT * FROM interest_group;
SELECT * FROM group_member;
SELECT * FROM event;
SELECT * FROM event_member;
