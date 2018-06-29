CREATE TABLE BLOG (
  id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
  title VARCHAR(255) NOT NULL,
  contents TEXT,
  updated_time timestamp not null default current_timestamp,
  created_time timestamp not null default current_timestamp
);

