-- V2: Migrations para adicionara coluna de RANK_SHINOBI na tabela de cadastros

ALTER TABLE tb_cadastro
ADD COLUMN rank_shinobi VARCHAR(255);