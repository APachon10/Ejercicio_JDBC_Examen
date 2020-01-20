DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `igualarComisionImpIntro`(IN `commi` INT)
    NO SQL
BEGIN
	update empleados
    SET comision = commi
    WHERE oficio = "VENDEDOR";
END$$
DELIMITER ;