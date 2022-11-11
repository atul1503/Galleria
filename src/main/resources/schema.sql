
CREATE TABLE IF NOT EXISTS  users  (username VARCHAR(30) PRIMARY KEY,
password VARCHAR(30) NOT NULL,
age INTEGER NOT NULL
);


CREATE TABLE IF NOT EXISTS  UserGallery (
username VARCHAR(30),
imageid VARCHAR(300),
foreign key (username) references users(username)
);
