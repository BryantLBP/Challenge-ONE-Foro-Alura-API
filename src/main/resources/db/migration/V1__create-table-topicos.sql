CREATE TABLE `foro_alura`.`topicos` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(150) NOT NULL,
  `mensaje` TEXT NOT NULL,
  `fecha_creacion` DATE NOT NULL,
  `estatus` VARCHAR(50) NOT NULL,
  `autor` VARCHAR(100) NOT NULL,
  `curso` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));