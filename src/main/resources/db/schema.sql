CREATE TABLE category (
  id   INT PRIMARY KEY,
  name VARCHAR(100)
);

CREATE TABLE post (
  id    INT PRIMARY KEY,
  catId INT,
  name  VARCHAR(100),
  price INT
)