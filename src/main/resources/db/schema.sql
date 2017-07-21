CREATE TABLE users (
  id       INT PRIMARY KEY,
  email    VARCHAR(255) UNIQUE NOT NULL,
  password VARCHAR(255)        NOT NULL,
  name     VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE category (
  id    INT PRIMARY KEY,
  name  VARCHAR(100) UNIQUE NOT NULL,
  alias VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE post (
  id          INT PRIMARY KEY,
  catId       INT          NOT NULL,
  userId      INT          NOT NULL,
  name        VARCHAR(100) NOT NULL,
  description VARCHAR(500) NOT NULL,
  price       INT          NOT NULL
);

INSERT INTO users VALUES (1, 'test@test.com', 'test', 'test');

INSERT INTO category VALUES (1, 'Кольца', 'ring');
INSERT INTO category VALUES (2, 'Ожерелья', 'necklaces');
INSERT INTO category VALUES (3, 'Серьги', 'ear');
INSERT INTO category VALUES (4, 'Браслеты', 'bracelet');
INSERT INTO category VALUES (5, 'Колье', 'choker');
INSERT INTO category VALUES (6, 'Комплекты', 'jewelry-set');

INSERT INTO post VALUES (1, 1, 1, 'Супер кольцо баюма', 'Продам соверешнно новое кольцо баюма! Не дорого!', 199);
INSERT INTO post VALUES (2, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post VALUES (3, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post VALUES (4, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post VALUES (5, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post VALUES (6, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post VALUES (7, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post VALUES (8, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post VALUES (9, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post
VALUES (10, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post
VALUES (11, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post
VALUES (12, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post
VALUES (13, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post
VALUES (14, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post
VALUES (15, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);
INSERT INTO post
VALUES (16, 1, 1, 'Супер кольцо королевы муравьев', 'Lorem ipsum dolor sit amet, consectetur adip', 99);