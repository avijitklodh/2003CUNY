
CREATE TABLE director(
d_id int PRIMARY KEY AUTO_INCREMENT,
name varchar(200)
);

SELECT * FROM director;

INSERT INTO director VALUES (0,'Dylan Kubrick');
INSERT INTO director VALUES (0,'Francis Avi Coppola');



CREATE TABLE movie(
m_id int PRIMARY KEY AUTO_INCREMENT,
title varchar(200),
d_id int,
CONSTRAINT FK_MOVIE_DIRECTOR FOREIGN KEY movie(d_id) REFERENCES director(d_id)
);

SELECT * FROM movie;

INSERT INTO movie VALUES(0,'Apcoalyse now',3);
INSERT INTO movie VALUES(0,'Full Metal Jacket',3);
INSERT INTO movie VALUES(0,'Inception 2 Electric Boogaloo',2);
INSERT INTO movie VALUES(0,'Dark knight risese agian! the sequel!',2);
INSERT INTO movie VALUES(0,'Dark knight rises. Kung fu Power!',2);


CREATE TABLE actor(
a_id int PRIMARY KEY AUTO_INCREMENT,
name varchar(200)
);


CREATE TABLE actor_movie(
actor_id int,
movie_id int,
CONSTRAINT FK_AM_ACTOR FOREIGN KEY actor_movie(actor_id) REFERENCES actor(a_id),
CONSTRAINT FK_AM_MOVIE FOREIGN KEY actor_movie(movie_id) REFERENCES movie(m_id)
);

INSERT INTO actor VALUES (0,'Jian');
INSERT INTO actor VALUES (0,'Tiffany');


INSERT into actor_movie VALUES (1,5);
INSERT into actor_movie VALUES (1,3);
INSERT into actor_movie VALUES (1,5);
INSERT into actor_movie VALUES (1,2);


INSERT into actor_movie VALUES (2,5);

SELECT * FROM movie;
