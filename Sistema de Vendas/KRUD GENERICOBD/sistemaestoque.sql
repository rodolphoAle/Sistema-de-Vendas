-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Dez-2023 às 01:11
-- Versão do servidor: 10.4.17-MariaDB
-- versão do PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `sistemaestoque`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_clientes`
--

CREATE TABLE `tb_clientes` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `rg` varchar(30) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `telefone` varchar(30) DEFAULT NULL,
  `celular` varchar(30) DEFAULT NULL,
  `cep` varchar(100) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_clientes`
--

INSERT INTO `tb_clientes` (`id`, `nome`, `rg`, `cpf`, `email`, `telefone`, `celular`, `cep`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `estado`) VALUES
(9, 'charlie', '22.222.222', '111.111.111-11', 'charlie@charliegmail.com', '(11)1111-1111', '(99)9 9999-9999', '11111-111', 'tv raimundinho', 1, 'casa', 'trançador', 'caxambu', 'MG'),
(12, 'joao da silva', '11.111.111', '111.111.111-13', 'charlie@charliegmail.com', '(11)1111-1111', '(99)9 9999-9999', '11111-111', 'tv raimundinho', 1, 'casa', 'trançador', 'caxambu', 'MG'),
(13, ' charlie rodrigues da silva', '11.111.111', '111.111.111-12', 'charlie@charliegmail.com', '(11)1111-1111', '(99)9 9999-9999', '11111-111', 'tv raimundinho', 1, 'casa', 'trançador', 'caxambu', 'MG'),
(14, 'ffbfgbfg', '00.000.000', '111.111.111-14', '0000', '(11)1111-1111', '(99)9 9999-9999', '00000-000', '0000', 0, '00', 'vila verde', '0000', 'AC');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_fornecedores`
--

CREATE TABLE `tb_fornecedores` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `cnpj` varchar(100) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `telefone` varchar(30) DEFAULT NULL,
  `celular` varchar(30) DEFAULT NULL,
  `cep` varchar(100) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_fornecedores`
--

INSERT INTO `tb_fornecedores` (`id`, `nome`, `cnpj`, `email`, `telefone`, `celular`, `cep`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `estado`) VALUES
(1, 'sang sung', '77.777.777/7777-77', 'ss@gmail.com', '(11)1111-1111', '(99)9 9999-9999', '11111-111', 'tv raimundinho', 44, 'mobile', 'trançadoor', 'caxambu', 'CE'),
(3, 'moto ', '22.222.222/2222-22', 'G@gmail.com', '(11)1111-1111', '(99)9 9999-9999', '11111-111', 'tv do beco2', 22, 'mobile', '2', 'caxambu2', 'MG'),
(4, 'motorola ', '00.000.000/0000-00', 'ss@gmail.com', '(11)1111-1111', '(99)9 9999-9999', '11111-111', 'tv do beco', 44, 'mobile', 'jardim das naçoes', 'cambuquira', 'MS'),
(5, 'magazine luiza', '99.999.999/9999-99', 'magazine@yahoo.com.br', '(11)1111-1111', '(99)9 9999-9999', '11111-111', 'joaquim dos santos', 78, 'empresa', 'vila verde', 'caxambu', 'CE');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_funcionarios`
--

CREATE TABLE `tb_funcionarios` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `rg` varchar(30) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `cargo` varchar(100) DEFAULT NULL,
  `nivel_acesso` varchar(50) DEFAULT NULL,
  `telefone` varchar(30) DEFAULT NULL,
  `celular` varchar(30) DEFAULT NULL,
  `cep` varchar(100) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_funcionarios`
--

INSERT INTO `tb_funcionarios` (`id`, `nome`, `rg`, `cpf`, `email`, `senha`, `cargo`, `nivel_acesso`, `telefone`, `celular`, `cep`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `estado`) VALUES
(4, 'ricardo azarias', '11.111.111', '111.111.111-11', 'helio@gmail.com.br', '000', 'entregador', 'Usuário', '(11)1111-1111', '(99)9 9999-9999', '37440-000', 'rua das flores mais lindas', 55, 'alameda1', 'da pedra1', 'cerranos1', 'MT'),
(6, 'charlie abraao', '11.111.111', '111.111.111-11', 'helio@gmail.com', '000', 'entregador', 'Administrador', '(11)1111-1111', '(99)9 9999-9999', '37440-000', 'rua das flores mais lindas', 55, 'alameda', 'da pedra', 'cerranos', 'MT');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_itensvendas`
--

CREATE TABLE `tb_itensvendas` (
  `id` int(11) NOT NULL,
  `venda_id` int(11) DEFAULT NULL,
  `produto_id` int(11) DEFAULT NULL,
  `qtd` int(11) DEFAULT NULL,
  `subtotal` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_itensvendas`
--

INSERT INTO `tb_itensvendas` (`id`, `venda_id`, `produto_id`, `qtd`, `subtotal`) VALUES
(198, 233, 9, 2, '200.00'),
(199, 235, 9, 1, '100.00'),
(200, 239, 8, 1, '16000.00'),
(201, 241, 7, 1, '1100.00'),
(202, 242, 9, 1, '100.00'),
(203, 243, 9, 1, '100.00'),
(204, 244, 9, 1, '100.00'),
(205, 245, 9, 1, '100.00'),
(206, 247, 9, 1, '100.00'),
(207, 249, 9, 1, '100.00'),
(208, 250, 6, 1, '155.00'),
(209, 251, 5, 1, '1500.00'),
(210, 252, 9, 1, '100.00'),
(211, 253, 9, 1, '100.00'),
(212, 254, 9, 1, '100.00'),
(213, 255, 9, 1, '100.00'),
(214, 256, 9, 2, '200.00'),
(215, 256, 5, 2, '3000.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_parcelas`
--

CREATE TABLE `tb_parcelas` (
  `id` int(11) NOT NULL,
  `cliente_id` int(11) DEFAULT NULL,
  `data_venda` datetime DEFAULT NULL,
  `total` decimal(10,2) DEFAULT NULL,
  `parcela` decimal(10,2) DEFAULT NULL,
  `obs` varchar(100) DEFAULT NULL,
  `num_parcelas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_parcelas`
--

INSERT INTO `tb_parcelas` (`id`, `cliente_id`, `data_venda`, `total`, `parcela`, `obs`, `num_parcelas`) VALUES
(46, 12, '2020-11-02 00:00:00', '240.00', '24.00', '', 5),
(47, 14, '2020-11-02 00:00:00', '16000.00', '1000.00', 'maior que quinze mil', 14),
(48, 14, '2020-11-02 00:00:00', '1100.00', '100.00', '', 9),
(49, 9, '2020-11-02 00:00:00', '100.00', '10.00', '', 10);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_produtos`
--

CREATE TABLE `tb_produtos` (
  `id` int(11) NOT NULL,
  `descricao` varchar(100) DEFAULT NULL,
  `preco` decimal(10,2) DEFAULT NULL,
  `qtd_estoque` int(11) DEFAULT NULL,
  `for_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_produtos`
--

INSERT INTO `tb_produtos` (`id`, `descricao`, `preco`, `qtd_estoque`, `for_id`) VALUES
(5, 'tablet', '1500.00', 17, 3),
(6, 'relogio', '155.00', 0, 1),
(7, 'celular', '1100.00', 27, 1),
(8, 'computador sang sung', '16000.00', 11, 5),
(9, 'teclado de pc', '100.00', 72, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_vendas`
--

CREATE TABLE `tb_vendas` (
  `id` int(11) NOT NULL,
  `cliente_id` int(11) DEFAULT NULL,
  `data_venda` datetime DEFAULT NULL,
  `total_venda` decimal(10,2) DEFAULT NULL,
  `observacoes` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_vendas`
--

INSERT INTO `tb_vendas` (`id`, `cliente_id`, `data_venda`, `total_venda`, `observacoes`) VALUES
(233, 12, '2020-11-02 00:00:00', NULL, ''),
(234, 9, '2020-11-02 00:00:00', '48.00', ''),
(235, 9, '2020-11-02 00:00:00', '100.00', ''),
(236, 9, '2020-11-02 00:00:00', '24.00', ''),
(237, 9, '2020-11-02 00:00:00', '24.00', ''),
(238, 12, '2020-11-02 00:00:00', '24.00', ''),
(239, 14, '2020-11-02 00:00:00', NULL, ''),
(240, 14, '2020-11-02 00:00:00', '2000.00', 'maior que quinze mil'),
(241, 14, '2020-11-02 00:00:00', NULL, ''),
(242, 9, '2020-11-02 00:00:00', '100.00', 'tentando'),
(243, 9, '2020-11-02 00:00:00', '100.00', 'tentando'),
(244, 9, '2020-11-02 00:00:00', '100.00', 'tentando'),
(245, 9, '2020-11-02 00:00:00', '100.00', ''),
(246, 14, '2020-11-02 00:00:00', '100.00', ''),
(247, 9, '2020-11-02 00:00:00', NULL, ''),
(248, 9, '2020-11-02 00:00:00', '100.00', ''),
(249, 12, '2020-11-02 00:00:00', NULL, ''),
(250, 9, '2023-11-09 22:31:20', '155.00', ''),
(251, 9, '2023-11-13 21:56:17', '1500.00', ''),
(252, 9, '2023-11-13 22:00:33', '100.00', 'teste'),
(253, 9, '2023-11-13 22:15:28', '100.00', 'sem troco'),
(254, 9, '2023-11-13 22:18:06', '100.00', 'teste'),
(255, 9, '2023-11-13 22:28:23', '100.00', 'teste'),
(256, 9, '2023-11-13 22:46:40', '3200.00', 'teste final');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_clientes`
--
ALTER TABLE `tb_clientes`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tb_fornecedores`
--
ALTER TABLE `tb_fornecedores`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tb_funcionarios`
--
ALTER TABLE `tb_funcionarios`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tb_itensvendas`
--
ALTER TABLE `tb_itensvendas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `venda_id` (`venda_id`),
  ADD KEY `produto_id` (`produto_id`);

--
-- Índices para tabela `tb_parcelas`
--
ALTER TABLE `tb_parcelas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cliente_id` (`cliente_id`);

--
-- Índices para tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `for_id` (`for_id`);

--
-- Índices para tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cliente_id` (`cliente_id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_clientes`
--
ALTER TABLE `tb_clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de tabela `tb_fornecedores`
--
ALTER TABLE `tb_fornecedores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `tb_funcionarios`
--
ALTER TABLE `tb_funcionarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `tb_itensvendas`
--
ALTER TABLE `tb_itensvendas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=216;

--
-- AUTO_INCREMENT de tabela `tb_parcelas`
--
ALTER TABLE `tb_parcelas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT de tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=257;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tb_itensvendas`
--
ALTER TABLE `tb_itensvendas`
  ADD CONSTRAINT `tb_itensvendas_ibfk_1` FOREIGN KEY (`venda_id`) REFERENCES `tb_vendas` (`id`),
  ADD CONSTRAINT `tb_itensvendas_ibfk_2` FOREIGN KEY (`produto_id`) REFERENCES `tb_produtos` (`id`);

--
-- Limitadores para a tabela `tb_parcelas`
--
ALTER TABLE `tb_parcelas`
  ADD CONSTRAINT `tb_parcelas_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `tb_clientes` (`id`);

--
-- Limitadores para a tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  ADD CONSTRAINT `tb_produtos_ibfk_1` FOREIGN KEY (`for_id`) REFERENCES `tb_fornecedores` (`id`);

--
-- Limitadores para a tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
  ADD CONSTRAINT `tb_vendas_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `tb_clientes` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
