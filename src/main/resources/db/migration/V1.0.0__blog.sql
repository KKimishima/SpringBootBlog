CREATE TABLE BLOG (
  id serial PRIMARY KEY     NOT NULL,
  title        VARCHAR(255) NOT NULL,
  contents TEXT,
  updated_time timestamp    not null default current_timestamp,
  created_time timestamp    not null default current_timestamp
);

