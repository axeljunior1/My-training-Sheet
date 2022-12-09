CREATE TABLE seances (
  id INT NOT NULL,
   date VARCHAR(255) NULL,
   discipline VARCHAR(255) NULL,
   exercices VARCHAR(255) NULL,
   image VARCHAR(255) NULL,
   CONSTRAINT pk_seances PRIMARY KEY (id)
);