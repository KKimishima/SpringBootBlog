CREATE TABLE person (
  id serial PRIMARY KEY                           NOT NULL,
  name         VARCHAR(255)                       NOT NULL,
  email        VARCHAR(255)                       NOT NULL,
  updated_time timestamp                          not null default current_timestamp,
  created_time timestamp                          not null default current_timestamp
);
