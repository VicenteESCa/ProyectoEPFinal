-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-12-2023 a las 02:51:40
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectopoo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consumidores`
--

CREATE TABLE `consumidores` (
  `rut` varchar(10) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `comuna` varchar(255) NOT NULL,
  `region` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `consumidores`
--

INSERT INTO `consumidores` (`rut`, `correo`, `password`, `nombre`, `direccion`, `comuna`, `region`) VALUES
('12345678-9', 'ana.torres@gmail.com', 'ana123', 'Ana Torres', 'Sector Ficticio 321', 'Villa Alemana', 'Valparaiso'),
('13579111-0', 'carmen.fernandez@gmail.com', 'carmen456', 'Carmen Fernandez', 'Avenida del Mar 666', 'Valparaiso', 'Valparaiso'),
('19283746-5', 'laura.rodriguez@gmail.com', 'laura789', 'Laura Rodriguez', 'Camino Inventado 987', 'Limache', 'Valparaiso'),
('24681012-3', 'felipe.nunez@gmail.com', 'felipe123', 'Felipe Nuñez', 'Callejon Sin Salida 555', 'Quilpue', 'Valparaiso'),
('86420987-2', 'gabriel.garcia@gmail.com', 'gabriel789', 'Gabriel Garcia', 'Pasaje Desconocido 777', 'Placilla', 'Valparaiso'),
('98765432-1', 'roberto.martinez@gmail.com', 'roberto456', 'Roberto Martinez', 'Ruta Imaginaria 654', 'Reñaca', 'Valparaiso');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `nombreProducto` varchar(255) NOT NULL,
  `tipoProducto` varchar(255) NOT NULL,
  `stock` int(11) NOT NULL,
  `precio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `idProveedor`, `nombreProducto`, `tipoProducto`, `stock`, `precio`) VALUES
(1, 1, 'Limpiador Multiuso', 'Utiles de Aseo', 100, 2990),
(2, 1, 'Detergente Líquido', 'Utiles de Aseo', 150, 4590),
(3, 1, 'Desinfectante de Superficies', 'Utiles de Aseo', 80, 3890),
(4, 2, 'Empanadas de Pino', 'Comida Preparada', 50, 12990),
(5, 2, 'Sándwiches Variados', 'Comida Preparada', 100, 2990),
(6, 2, 'Pizzas Congeladas', 'Comida Preparada', 60, 6990),
(7, 3, 'Pack de Arroz 5kg', 'Abarrotes y Supermercado', 200, 4990),
(8, 3, 'Lentejas Bolsa 1kg', 'Abarrotes y Supermercado', 150, 1990),
(9, 3, 'Aceite de Oliva 500ml', 'Abarrotes y Supermercado', 100, 5990),
(10, 4, 'Licuadora Oster', 'Electrodomesticos', 30, 34990),
(11, 4, 'Horno Microondas Samsung', 'Electrodomesticos', 25, 79990),
(12, 4, 'Tostadora Philips', 'Electrodomesticos', 40, 24990),
(13, 5, 'Cojín Decorativo', 'Decoracion del Hogar', 75, 8990),
(14, 5, 'Lámpara de Mesa', 'Decoracion del Hogar', 60, 12990),
(15, 5, 'Cuadros Modernos', 'Decoracion del Hogar', 50, 15990),
(16, 6, 'Set de Velas Aromáticas', 'Decoracion del Hogar', 40, 6990),
(17, 6, 'Juego de Sábanas', 'Decoracion del Hogar', 35, 12990),
(18, 6, 'Alfombra Decorativa', 'Decoracion del Hogar', 20, 19990);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `idProveedor` int(11) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `comuna` varchar(255) NOT NULL,
  `region` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`idProveedor`, `correo`, `password`, `nombre`, `direccion`, `comuna`, `region`) VALUES
(1, 'juan.perez@gmail.com', 'password123', 'Juan Perez', 'Calle Ficticia 123', 'Valparaiso', 'Valparaiso'),
(2, 'maria.lopez@gmail.com', 'pass456', 'Maria Lopez', 'Avenida Imaginaria 456', 'Viña del Mar', 'Valparaiso'),
(3, 'carlos.gomez@gmail.com', 'mypassword789', 'Carlos Gomez', 'Pasaje Inventado 789', 'Quilpue', 'Valparaiso'),
(4, 'laura.sanchez@gmail.com', 'sanchez123', 'Laura Sanchez', 'Calle Falsa 101', 'Villa Alemana', 'Valparaiso'),
(5, 'diego.morales@gmail.com', 'morales456', 'Diego Morales', 'Avenida Principal 202', 'Reñaca', 'Valparaiso'),
(6, 'sofia.castillo@gmail.com', 'castillo789', 'Sofia Castillo', 'Paseo Maritimo 303', 'Limache', 'Valparaiso');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `idServicio` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `tipoServicio` varchar(255) NOT NULL,
  `duracion` int(11) NOT NULL,
  `precio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`idServicio`, `idProveedor`, `nombre`, `tipoServicio`, `duracion`, `precio`) VALUES
(1, 1, 'Limpieza Profunda Hogar', 'Limpieza a Domicilio', 4, 39990),
(2, 1, 'Limpieza Oficina Pequeña', 'Limpieza a Domicilio', 3, 29990),
(3, 1, 'Limpieza Post-Evento', 'Limpieza a Domicilio', 0, 49990),
(4, 2, 'Mantenimiento General Vehículo', 'Mecanica Automotriz', 2, 25990),
(5, 2, 'Cambio de Aceite y Filtros', 'Mecanica Automotriz', 1, 19990),
(6, 2, 'Reparación de Frenos', 'Mecanica Automotriz', 0, 34990),
(7, 3, 'Reparación de Filtraciones', 'Plomeria', 2, 28990),
(8, 3, 'Instalación de Grifería', 'Plomeria', 2, 24990),
(9, 3, 'Mantenimiento de Tuberías', 'Plomeria', 0, 19990);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `consumidores`
--
ALTER TABLE `consumidores`
  ADD PRIMARY KEY (`rut`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `idProveedor` (`idProveedor`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`idProveedor`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`idServicio`),
  ADD KEY `FK` (`idProveedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `idServicio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedores` (`idProveedor`);

--
-- Filtros para la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD CONSTRAINT `FK` FOREIGN KEY (`idProveedor`) REFERENCES `proveedores` (`idProveedor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
