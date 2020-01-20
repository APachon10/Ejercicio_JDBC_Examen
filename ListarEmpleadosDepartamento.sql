DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `consultaEmpleadosDepartamento`(IN `dep_name` VARCHAR(20))
    NO SQL
BEGIN
SELECT * FROM empleados WHERE dept_no = (SELECT dept_no FROM departamentos WHERE dnombre = dep_name);
END$$
DELIMITER ;