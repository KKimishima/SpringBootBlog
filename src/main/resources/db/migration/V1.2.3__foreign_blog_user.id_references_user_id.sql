ALTER TABLE BLOG
  ADD FOREIGN KEY (user_id) REFERENCES person (ID);