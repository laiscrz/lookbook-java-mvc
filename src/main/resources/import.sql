-- Peca de Roupa 1
INSERT INTO clothing_item ( nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ( 'Camiseta Branca', 'Camiseta', 'Branco', 'M', 'https://abrir.link/DwOYl', 'Algodão', 'Marca A', 'Liso', 49.90, '2024-09-01', 'Verão');

-- Peca de Roupa 2
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Vestido Floral', 'Vestido', 'Azul', 'P', 'https://abrir.link/xmZnn', 'Poliéster', 'Marca B', 'Floral', 129.90, '2024-08-15', 'Primavera');

-- Peca de Roupa 3
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Calça Jeans', 'Calça', 'Azul', 'G', 'https://abrir.link/AnnAE', 'Jeans', 'Marca C', 'Liso', 99.90, '2024-07-10', 'Outono');

-- Peca de Roupa 4
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Jaqueta de Couro', 'Jaqueta', 'Preto', 'M', 'https://abrir.link/cFHDB', 'Couro', 'Marca D', 'Liso', 299.90, '2024-09-05', 'Inverno');


--Lookbook 1
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Verão Casual', '2024-09-04');

-- Lookbook 2
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Primavera Romântico', '2024-09-01');

-- Lookbook 3
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Casual de Outono', '2024-08-20');

-- Lookbook 4
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Inverno Urbano', '2024-09-06');


-- Relacionando Lookbook 1 com Clothing Item 1 (Camiseta Branca)
INSERT INTO lookbook_clothing_item (lookbook_id, clothing_item_id) VALUES (1, 1);


-- Relacionando Lookbook 2 com Clothing Item 2 (Vestido Floral)
INSERT INTO lookbook_clothing_item (lookbook_id, clothing_item_id) VALUES (2, 2);

-- Relacionando Lookbook 3 com Clothing Item 3 (Calca Jeans)
INSERT INTO lookbook_clothing_item (lookbook_id, clothing_item_id) VALUES (3, 3);

-- Relacionando Lookbook 4 com Clothing Item 4 (Jaqueta de Couro)
INSERT INTO lookbook_clothing_item (lookbook_id, clothing_item_id) VALUES (4, 4);
