-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 28/05/2023 às 18:53
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `pokedex`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `pokemons`
--

CREATE TABLE `pokemons` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `tipo1` varchar(255) DEFAULT NULL,
  `tipo2` varchar(255) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `hp` int(11) DEFAULT NULL,
  `ataque` int(11) DEFAULT NULL,
  `defesa` int(11) DEFAULT NULL,
  `spAtk` int(11) DEFAULT NULL,
  `spDef` int(11) DEFAULT NULL,
  `velocidade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pokemons`
--

INSERT INTO `pokemons` (`id`, `nome`, `tipo1`, `tipo2`, `total`, `hp`, `ataque`, `defesa`, `spAtk`, `spDef`, `velocidade`) VALUES
(1, 'Bulbassauro', 'Grama', 'Veneno', 318, 45, 49, 49, 65, 65, 45),
(2, 'Ivyssauro', 'Grama', 'Veneno', 405, 80, 60, 63, 80, 80, 80),
(3, 'Venussauro', 'Grama', 'Veneno', 525, 80, 82, 83, 100, 100, 80),
(4, 'Charmander', 'Fogo', '', 309, 39, 52, 43, 60, 50, 65),
(5, 'Charmeleon', 'Fogo', '', 405, 58, 64, 58, 80, 65, 80),
(6, 'Charizard', 'Fogo', 'Voador', 534, 78, 84, 78, 109, 85, 100),
(7, 'Squirtle', 'Água', '', 314, 44, 48, 65, 50, 64, 43),
(8, 'Wartotle', 'Água', '', 405, 59, 63, 80, 65, 80, 58),
(9, 'Blastoise', 'Água', '', 530, 79, 83, 100, 85, 105, 78),
(10, 'Caterpie', 'Inseto', '', 195, 45, 30, 35, 20, 20, 45),
(11, 'Metapod', 'Inseto', '', 205, 50, 20, 55, 25, 25, 30),
(12, 'Butterfree', 'Inseto', 'Voador', 395, 60, 45, 50, 90, 80, 70),
(13, 'Weedle', 'Inseto', 'Veneno', 195, 40, 35, 30, 20, 20, 50),
(14, 'Kakuna', 'Inseto', 'Veneno', 205, 45, 25, 50, 25, 25, 35),
(15, 'Beedrill', 'Inseto', 'Veneno', 395, 65, 90, 40, 45, 80, 75),
(16, 'Pidgey', 'Normal', 'Voador', 251, 40, 45, 40, 35, 35, 56),
(17, 'Pidgeotto', 'Normal', 'Voador', 349, 63, 60, 55, 50, 50, 71),
(18, 'Pidgeot', 'Normal', 'Voador', 479, 83, 80, 75, 70, 70, 101),
(19, 'Rattata', 'Normal', '', 253, 30, 56, 35, 25, 35, 72),
(20, 'Raticate', 'Normal', '', 413, 55, 81, 60, 50, 70, 97),
(21, 'Spearow', 'Normal', 'Voador', 262, 40, 60, 30, 31, 31, 70),
(22, 'Fearow', 'Normal', 'Voador', 442, 65, 90, 65, 61, 61, 100),
(23, 'Ekans', 'Veneno', '', 288, 35, 60, 44, 40, 54, 55),
(24, 'Arbok', 'Veneno', '', 448, 60, 95, 69, 65, 79, 80),
(25, 'Pikachu', 'Elétrico', '', 320, 35, 55, 40, 50, 50, 90),
(26, 'Raichu', 'Elétrico', '', 485, 60, 90, 55, 90, 80, 110),
(27, 'Sandshrew', 'Terrestre', '', 300, 50, 75, 85, 20, 30, 40),
(28, 'Sandslash', 'Terrestre', '', 450, 75, 100, 110, 45, 55, 65),
(29, 'Nidoran♀', 'Veneno', '', 275, 55, 47, 52, 40, 40, 41),
(30, 'Nidorina', 'Veneno', '', 365, 70, 62, 67, 55, 55, 56),
(31, 'Nidoqueen', 'Veneno', 'Terrestre', 505, 90, 92, 87, 75, 85, 76),
(32, 'Nidoran♂', 'Veneno', '', 273, 46, 57, 40, 40, 40, 50),
(33, 'Nidorino♂', 'Veneno', '', 365, 61, 72, 57, 55, 55, 65),
(34, 'Nidoking♂', 'Veneno', 'Terrestre', 505, 81, 102, 77, 85, 75, 85),
(35, 'Clefairy', 'Fada', '', 323, 70, 45, 48, 60, 65, 35),
(36, 'Clefable', 'Fada', '', 483, 95, 70, 73, 95, 90, 60),
(37, 'Vulpix', 'Fogo', '', 299, 38, 41, 40, 50, 65, 65),
(38, 'Ninetales', 'Fogo', '', 505, 73, 76, 75, 81, 100, 100),
(39, 'Jigglypuff', 'Normal', 'Fada', 270, 115, 45, 20, 45, 25, 20),
(40, 'Wigglytuff', 'Normal', 'Fada', 435, 140, 70, 45, 85, 50, 45),
(41, 'Zubat', 'Veneno', 'Voador', 245, 40, 45, 35, 30, 40, 55),
(42, 'Golbat', 'Veneno', 'Voador', 455, 75, 80, 70, 65, 75, 90),
(43, 'Oodish', 'Grama', 'Veneno', 320, 45, 50, 55, 75, 65, 30),
(44, 'Gloom', 'Grama', 'Veneno', 395, 60, 65, 70, 85, 75, 40),
(45, 'Vileplume', 'Grama', 'Veneno', 490, 75, 80, 85, 110, 90, 50),
(46, 'Paras', 'Inseto', 'Grama', 285, 35, 70, 55, 45, 55, 25),
(47, 'Parasect', 'Inseto', 'Grama', 405, 60, 95, 80, 60, 80, 30),
(48, 'Venonat', 'Inseto', 'Veneno', 305, 60, 55, 50, 40, 55, 45),
(49, 'Venomoth', 'Inseto', 'Veneno', 450, 70, 65, 60, 90, 75, 90),
(50, 'Diglett', 'Terrestre', '', 265, 10, 55, 25, 35, 45, 95),
(51, 'Dugtrio', 'Terrestre', '', 425, 35, 100, 50, 50, 70, 120),
(52, 'Meowth', 'Normal', '', 290, 40, 45, 35, 40, 40, 90),
(53, 'Persian', 'Normal', '', 440, 65, 70, 60, 65, 65, 115),
(54, 'Psyduck', 'Água', '', 320, 50, 52, 48, 65, 50, 55),
(55, 'Golduck', 'Água', '', 500, 80, 82, 78, 95, 80, 85),
(56, 'Mankey', 'Lutador', '', 305, 40, 80, 35, 35, 45, 70),
(57, 'Primeape', 'Lutador', '', 455, 65, 105, 60, 60, 70, 95),
(58, 'Growlithe', 'Fogo', '', 350, 55, 70, 45, 70, 50, 60),
(59, 'Arcanine', 'Fogo', '', 555, 90, 110, 80, 100, 80, 95),
(60, 'Poliwag', 'Água', '', 300, 40, 50, 40, 40, 40, 90),
(61, 'Poliwhirl', 'Água', '', 385, 65, 65, 65, 50, 50, 90),
(62, 'Poliwrath', 'Água', 'Lutador', 510, 90, 95, 95, 70, 90, 70),
(63, 'Abra', 'Psíquico', '', 310, 25, 20, 15, 105, 55, 90),
(64, 'Kadabra', 'Psíquico', '', 400, 40, 35, 30, 120, 70, 105),
(65, 'Alakazam', 'Psíquico', '', 500, 55, 50, 45, 135, 95, 120),
(66, 'Machop', 'Lutador', '', 305, 70, 80, 50, 35, 35, 35),
(67, 'Machoke', 'Lutador', '', 405, 80, 100, 70, 50, 60, 45),
(68, 'Machamp', 'Lutador', '', 505, 90, 130, 80, 65, 85, 55),
(69, 'Bellsprout', 'Grama', 'Veneno', 300, 50, 75, 35, 70, 30, 40),
(70, 'Weepinbell', 'Grama', 'Veneno', 390, 65, 90, 50, 85, 45, 55),
(71, 'Victreebel', 'Grama', 'Veneno', 490, 80, 105, 65, 100, 70, 70),
(72, 'Tentacool', 'Água', 'Veneno', 335, 40, 40, 35, 50, 100, 70),
(73, 'Tentacruel', 'Água', 'Veneno', 515, 80, 70, 65, 80, 120, 100),
(74, 'Geodude', 'Pedra', 'Terrestre', 300, 40, 80, 100, 30, 30, 20),
(75, 'Graveler', 'Pedra', 'Terrestre', 390, 55, 95, 115, 45, 45, 35),
(76, 'Golem', 'Pedra', 'Terrestre', 495, 80, 120, 130, 55, 65, 45),
(77, 'Ponyta', 'Fogo', '', 410, 50, 85, 55, 65, 65, 9),
(78, 'Rapidash', 'Fogo', '', 500, 65, 100, 70, 80, 80, 105),
(79, 'Slowpoke', 'Água', 'Psíquico', 315, 90, 65, 65, 40, 40, 15),
(80, 'Slowbro', 'Água', 'Psíquico', 490, 95, 75, 110, 100, 80, 30),
(81, 'Magnemite', 'Elétrico', 'Metálico', 325, 25, 35, 70, 95, 55, 45),
(82, 'Magneton', 'Elétrico', 'Metálico', 465, 50, 60, 95, 120, 70, 70),
(83, 'Farfetch\'d', 'Normal', 'Voador', 377, 52, 90, 55, 58, 62, 60),
(84, 'Doduo', 'Normal', 'Voador', 310, 35, 85, 45, 35, 35, 75),
(85, 'Dodrio', 'Normal', 'Voador', 470, 60, 110, 70, 60, 60, 110),
(86, 'Seel', 'Água', '', 325, 65, 45, 55, 45, 70, 45),
(87, 'Dewgong', 'Água', 'Gelo', 475, 90, 70, 80, 70, 95, 70),
(88, 'Grimer', 'Veneno', '', 325, 80, 80, 50, 40, 50, 25),
(89, 'Muk', 'Veneno', '', 500, 105, 105, 75, 65, 100, 50),
(90, 'Shellder', 'Água', '', 305, 30, 65, 100, 45, 25, 40),
(91, 'Cloyster', 'Água', 'Gelo', 525, 50, 95, 180, 85, 45, 70),
(92, 'Gastly', 'Fantasma', 'Veneno', 310, 30, 35, 30, 100, 35, 80),
(93, 'Haunter', 'Fantasma', 'Veneno', 405, 45, 50, 45, 115, 55, 95),
(94, 'Gengar', 'Fantasma', 'Veneno', 500, 60, 65, 60, 130, 75, 110),
(95, 'Onix', 'Pedra', 'Terrestre', 385, 35, 45, 160, 30, 45, 70),
(96, 'Drowzee', 'Psíquico', '', 328, 60, 48, 45, 43, 90, 42),
(97, 'Hypno', 'Psíquico', '', 483, 85, 73, 70, 73, 115, 67),
(98, 'Krabby', 'Água', '', 325, 30, 105, 90, 25, 25, 50),
(99, 'Kingler', 'Água', '', 475, 55, 130, 115, 50, 50, 75),
(100, 'Voltorb', 'Elétrico', '', 330, 40, 30, 50, 55, 55, 100),
(101, 'Electrode', 'Elétrico', '', 490, 60, 50, 70, 80, 80, 150),
(102, 'Exeggcute', 'Grama', 'Psíquico', 325, 60, 40, 80, 60, 45, 40),
(103, 'Exeggutor', 'Grama', 'Psíquico', 530, 95, 95, 85, 125, 75, 55),
(104, 'Cubone', 'Terrestre', '', 320, 50, 50, 95, 40, 50, 35),
(105, 'Marowak', 'Terrestre', '', 425, 60, 80, 110, 50, 80, 45),
(106, 'Hitmonlee', 'Lutador', '', 455, 50, 120, 53, 35, 110, 87),
(107, 'Hitmonchan', 'Lutador', '', 455, 50, 105, 79, 35, 110, 76),
(108, 'Licktung', 'Normal', '', 385, 90, 55, 75, 60, 75, 30),
(109, 'Koffing', 'Veneno', '', 340, 40, 65, 95, 60, 45, 35),
(110, 'Weezing', 'Veneno', '', 490, 65, 90, 120, 85, 70, 60),
(111, 'Rhyhorn', 'Terrestre', 'Pedra', 345, 80, 85, 95, 30, 30, 25),
(112, 'Rhydon', 'Terrestre', 'Pedra', 485, 105, 130, 120, 45, 45, 40),
(113, 'Chansey', 'Normal', '', 450, 250, 5, 5, 35, 105, 50),
(114, 'Tangela', 'Grama', '', 435, 65, 55, 115, 100, 40, 60),
(115, 'Kangaskhan', 'Normal', '', 490, 105, 95, 80, 40, 80, 90),
(116, 'Horsea', 'Água', '', 295, 30, 40, 70, 70, 25, 60),
(117, 'Seadra', 'Água', '', 440, 55, 65, 95, 95, 45, 85),
(118, 'Goldeen', 'Água', '', 320, 45, 67, 60, 35, 50, 63),
(119, 'Seaking', 'Água', '', 450, 80, 92, 65, 65, 80, 68),
(120, 'Staryu', 'Água', '', 340, 30, 45, 55, 70, 55, 85),
(121, 'Starmie', 'Água', 'Psíquico', 520, 60, 75, 85, 100, 85, 115),
(122, 'Mr.Mime', 'Psíquico', 'Fada', 460, 40, 45, 65, 100, 120, 90),
(123, 'Scyther', 'Inseto', 'Voador', 500, 70, 110, 80, 55, 80, 105),
(124, 'Jynx', 'Gelo', 'Psíquico', 455, 65, 50, 35, 115, 95, 95),
(125, 'Electabuzz', 'Elétrico', '', 490, 65, 83, 57, 95, 85, 105),
(126, 'Magmar', 'Fogo', '', 495, 65, 95, 57, 100, 85, 93),
(127, 'Pinsir', 'Inseto', '', 500, 65, 125, 100, 55, 70, 85),
(128, 'Tauros', 'Normal', '', 490, 75, 100, 95, 40, 70, 110),
(129, 'Magikarp', 'Água', '', 200, 20, 10, 55, 15, 20, 80),
(130, 'Gyarados', 'Água', 'Voador', 540, 95, 125, 79, 60, 100, 81),
(131, 'Lapras', 'Água', 'Gelo', 535, 130, 85, 80, 85, 95, 60),
(132, 'Ditto', 'Normal', '', 288, 48, 48, 48, 48, 48, 48),
(133, 'Eeve', 'Normal', '', 325, 55, 55, 50, 45, 65, 55),
(134, 'Vaporeon', 'Água', '', 525, 130, 65, 60, 110, 95, 65),
(135, 'Jolteon', 'Elétrico', '', 525, 65, 65, 60, 110, 95, 130),
(136, 'Flareon', 'Fogo', '', 525, 65, 130, 60, 95, 110, 65),
(137, 'Porygon', 'Normal', '', 395, 65, 60, 70, 85, 75, 40),
(138, 'Omanyte', 'Pedra', 'Água', 355, 35, 40, 100, 90, 55, 35),
(139, 'Omastar', 'Pedra', 'Água', 495, 70, 60, 125, 115, 70, 55),
(140, 'Kabuto', 'Pedra', 'Água', 355, 30, 80, 90, 55, 45, 55),
(141, 'Kabutops', 'Pedra', 'Água', 495, 60, 115, 105, 65, 70, 80),
(142, 'Aerodactyl', 'Pedra', 'Voador', 515, 80, 105, 65, 60, 75, 130),
(143, 'Snorlax', 'Normal', '', 540, 160, 110, 65, 65, 110, 30),
(144, 'Articuno', 'Gelo', 'Voador', 580, 90, 85, 100, 95, 125, 85),
(145, 'Zapdos', 'Elétrico', 'Voador', 580, 90, 90, 85, 125, 90, 100),
(146, 'Moltres', 'Fogo', 'Voador', 580, 90, 100, 90, 125, 85, 90),
(147, 'Dratini', 'Dragão', '', 300, 41, 64, 45, 50, 50, 50),
(148, 'Dragonair', 'Dragão', '', 420, 61, 84, 65, 70, 70, 70),
(149, 'Dragonite', 'Dragão', 'Voador', 600, 91, 134, 95, 100, 100, 80),
(150, 'Mewtwo', 'Psíquico', '', 680, 106, 110, 90, 154, 90, 130),
(151, 'Mew', 'Psíquico', '', 600, 100, 100, 100, 100, 100, 100);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pokemonsregistrados`
--

CREATE TABLE `pokemonsregistrados` (
  `id` int(11) NOT NULL,
  `id_treinador` int(11) NOT NULL,
  `id_poke1` int(11) DEFAULT NULL,
  `id_poke2` int(11) DEFAULT NULL,
  `id_poke3` int(11) DEFAULT NULL,
  `id_poke4` int(11) DEFAULT NULL,
  `id_poke5` int(11) DEFAULT NULL,
  `id_poke6` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pokemonsregistrados`
--

INSERT INTO `pokemonsregistrados` (`id`, `id_treinador`, `id_poke1`, `id_poke2`, `id_poke3`, `id_poke4`, `id_poke5`, `id_poke6`) VALUES
(1, 2, 0, 0, 0, 4, 5, 0),
(2, 3, 0, 0, 3, 4, 5, 6);

-- --------------------------------------------------------

--
-- Estrutura para tabela `treinadores`
--

CREATE TABLE `treinadores` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `treinadores`
--

INSERT INTO `treinadores` (`id`, `nome`, `idade`, `cidade`) VALUES
(2, 'Brock', 22, 'Pewter'),
(3, 'Misty', 19, 'Cerulean'),
(4, 'ash', 12, 'Pallet Town'),
(6, 'bob', 22, 'Viridian');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `pokemons`
--
ALTER TABLE `pokemons`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `pokemonsregistrados`
--
ALTER TABLE `pokemonsregistrados`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_treinador` (`id_treinador`);

--
-- Índices de tabela `treinadores`
--
ALTER TABLE `treinadores`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `pokemons`
--
ALTER TABLE `pokemons`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=152;

--
-- AUTO_INCREMENT de tabela `pokemonsregistrados`
--
ALTER TABLE `pokemonsregistrados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `treinadores`
--
ALTER TABLE `treinadores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `pokemonsregistrados`
--
ALTER TABLE `pokemonsregistrados`
  ADD CONSTRAINT `pokemonsregistrados_ibfk_1` FOREIGN KEY (`id_treinador`) REFERENCES `treinadores` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
