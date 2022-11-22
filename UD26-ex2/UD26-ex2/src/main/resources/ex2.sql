DROP DATABASE IF EXISTS ud26ex2;
CREATE DATABASE IF NOT EXISTS ud26ex2;
USE ud26ex2;

DROP TABLE IF EXISTS asignado_a;
DROP TABLE IF EXISTS proyecto;
DROP TABLE IF EXISTS cientificos;
CREATE TABLE IF NOT exists proyecto (
id nvarchar(4) PRIMARY KEY,
nombre nvarchar(255),
horas int
);
CREATE TABLE IF NOT EXISTS cientificos (
dni varchar(9) PRIMARY KEY,
nom_apels nvarchar(255)
);
CREATE TABLE IF NOT EXISTS asignado_a (
id int AUTO_INCREMENT PRIMARY KEY,
cientifico_id varchar(9),
proyecto_id nvarchar(4),
FOREIGN KEY (cientifico_id) REFERENCES cientificos (dni),
FOREIGN KEY (proyecto_id) REFERENCES proyecto (id)
);

INSERT INTO proyecto (id, nombre, horas) VALUES ('PR1', 'Proyecto 1', 111);
INSERT INTO proyecto (id, nombre, horas) VALUES ('PR2', 'Proyecto 2', 112);
INSERT INTO cientificos (dni, nom_apels) VALUES('399', 'Arnau');
INSERT INTO cientificos (dni, nom_apels) VALUES('778', 'Joana');
INSERT INTO asignado_a (cientifico_id, proyecto_id) VALUES('399', 'PR1');
INSERT INTO asignado_a (cientifico_id, proyecto_id) VALUES('778', 'PR1');