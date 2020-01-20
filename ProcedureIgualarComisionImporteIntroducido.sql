DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `igualarComisionImpIntro`(IN `commi` INT, IN `oficio` VARCHAR(10))
    NO SQL
BEGIN
	update empleados
    SET comision = commi
    WHERE oficio = VENDEDOR;
END$$
DELIMITER ;