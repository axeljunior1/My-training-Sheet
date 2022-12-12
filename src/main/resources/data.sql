CREATE TABLE seances (
  id INT NOT NULL,
   date LONGTEXT NULL,
   discipline LONGTEXT NULL,
   image LONGTEXT NULL,
   exercices LONGTEXT NULL,
   CONSTRAINT pk_seances PRIMARY KEY (id)
);