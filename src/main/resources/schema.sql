CREATE TABLE IF EXISTS User;
CREATE TABLE IF EXISTS UserGallery;

CREATE TABLE User (
username VARCHAR(30) PRIMARY KEY,
password VARCHAR(30) NOT NULL,
age INT(3) NOT NULL
);


CREATE TABLE UserGallery (
username VARCHAR(30),
url VARCHAR(300),
foreign key (username) references User(username)
);
