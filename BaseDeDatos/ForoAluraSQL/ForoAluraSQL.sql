#Crear la base de datos
CREATE DATABASE foro_alura;

#Seleccionar la base de datos que se quiere usar
USE foro_alura;

#Crear la tabla "topicos"
CREATE TABLE `foro_alura`.`topicos` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NOT NULL,
  `mensaje` TEXT NOT NULL,
  `fecha_creacion` DATE NOT NULL,
  `estatus` VARCHAR(50) NOT NULL,
  `autor` VARCHAR(100) NOT NULL,
  `curso` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));
  
#Seleccionar la tabla de topicos
SELECT * FROM topicos;

#En caso de que haya un error en la migracion via Flyway
DELETE FROM flyway_schema_history WHERE success = 0;

#Insertar un usuario (ejemplo)
INSERT INTO usuarios (login, clave)
VALUES ("bryant.baptista", "123456");

#Seleccionar la tabla de usuarios
SELECT * FROM usuarios;

#clave = $2a$10$qFI5NpQud1xmVhv9QZ0Mnef4mSz7rwMxcrRg2Do4a2VfMTBNdZaXS