DROP DATABASE IF EXISTS ud26ex1;
CREATE DATABASE IF NOT EXISTS ud26ex1;
USE ud26ex1;

DROP TABLE IF EXISTS suministra;
DROP TABLE IF EXISTS proveedores;
DROP TABLE IF EXISTS piezas;

CREATE TABLE piezas(
	id int AUTO_INCREMENT PRIMARY KEY,
	nombre nvarchar(100)
);
CREATE TABLE proveedores(
	id char(4) PRIMARY KEY,
	nombre nvarchar(100)
);
CREATE TABLE suministra(
	id int AUTO_INCREMENT PRIMARY KEY,
	codigo_pieza int,
	id_proveedor char(4),
	precio int,
    FOREIGN KEY(codigo_pieza) REFERENCES piezas(id),
    FOREIGN KEY(id_proveedor) REFERENCES proveedores(id)
);
INSERT INTO piezas(nombre) VALUES ("pz1");
INSERT INTO piezas(nombre) VALUES ("pz2");
INSERT INTO piezas(nombre) VALUES ("pz3");
INSERT INTO proveedores(id, nombre) VALUES ("AAAA", "pr1");
INSERT INTO proveedores(id, nombre) VALUES ("BBBB", "pr2");
INSERT INTO suministra(codigo_pieza, id_proveedor, precio) VALUES (1, "AAAA", 199);
INSERT INTO suministra(codigo_pieza, id_proveedor, precio) VALUES (1, "AAAA", 199);
INSERT INTO suministra(codigo_pieza, id_proveedor, precio) VALUES (2, "BBBB", 199);
INSERT INTO suministra(codigo_pieza, id_proveedor, precio) VALUES (3, "BBBB", 199);