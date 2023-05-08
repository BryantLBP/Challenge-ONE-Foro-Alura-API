ALTER TABLE `foro_alura`.`topicos` 
CHANGE COLUMN `mensaje` `mensaje` VARCHAR(255) NOT NULL ,
ADD UNIQUE INDEX `titulo_UNIQUE` (`titulo` ASC) VISIBLE,
ADD UNIQUE INDEX `mensaje_UNIQUE` (`mensaje` ASC) VISIBLE;
;
