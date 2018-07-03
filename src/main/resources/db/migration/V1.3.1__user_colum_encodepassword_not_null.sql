update person
SET encode_password = 'admin123'
WHERE name = 'admin';

ALTER TABLE person
  ALTER COLUMN encode_password SET NOT NULL;