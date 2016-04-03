-- phpMyAdmin SQL Dump
-- version 4.4.3
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 03-04-2016 a las 11:50:08
-- Versión del servidor: 5.6.24
-- Versión de PHP: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `control_ejercicios`
--
CREATE DATABASE IF NOT EXISTS `control_ejercicios` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `control_ejercicios`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejercicios`
--

CREATE TABLE IF NOT EXISTS `ejercicios` (
  `idEjercicio` int(11) NOT NULL,
  `nombreEjercicio` varchar(45) NOT NULL,
  `descripcionEjercicio` varchar(300) DEFAULT NULL,
  `categoriaEjercicio` varchar(45) NOT NULL,
  `cursoEjercicio` varchar(45) DEFAULT NULL,
  `fechaCreacion` datetime DEFAULT NULL,
  `fechaEjercicio` datetime DEFAULT NULL,
  `observacionesEjercicio` varchar(300) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ejercicios`
--

INSERT INTO `ejercicios` (`idEjercicio`, `nombreEjercicio`, `descripcionEjercicio`, `categoriaEjercicio`, `cursoEjercicio`, `fechaCreacion`, `fechaEjercicio`, `observacionesEjercicio`) VALUES
(7, 'Caja Paradille', 'Rudimento básico', 'percusion', 'Primero', '2016-02-02 00:00:00', '2016-02-21 00:00:00', 'Repetir 100 veces'),
(11, 'Lectura solfeo', 'Leer a primera vista', 'solfeo', 'Segundo', '2016-03-02 00:00:00', '2016-01-13 00:00:00', 'No se puede estudiar'),
(14, 'insert prueba', 'En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, ', 'Solfeo', 'Infantil', '2016-03-01 00:00:00', '2016-04-21 00:00:00', 'ga');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `rolUsuario` varchar(45) DEFAULT NULL,
  `nombreUsuario` varchar(45) DEFAULT NULL,
  `passwordUsuario` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `rolUsuario`, `nombreUsuario`, `passwordUsuario`) VALUES
(1, 'administrador', 'admin', 'admin'),
(2, 'usuario', 'user', 'user');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ejercicios`
--
ALTER TABLE `ejercicios`
  ADD PRIMARY KEY (`idEjercicio`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ejercicios`
--
ALTER TABLE `ejercicios`
  MODIFY `idEjercicio` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
