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

DELETE FROM flyway_schema_history WHERE success = 0;
