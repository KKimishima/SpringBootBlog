CREATE TABLE USER (
  id           INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
  name         VARCHAR(255)                       NOT NULL,
  email        VARCHAR(255)                       NOT NULL,
  updated_time timestamp                          not null default current_timestamp,
  created_time timestamp                          not null default current_timestamp
);
