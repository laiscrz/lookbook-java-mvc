-- Peca de Roupa 1
INSERT INTO clothing_item ( nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ( 'Camiseta Branca', 'CAMISETA', 'Branco', 'M', 'https://abrir.link/DwOYl', 'Algodao', 'Nike', 'Liso', 49.90, '2024-09-01', 'Verao');

-- Peca de Roupa 2
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Vestido Floral', 'VESTIDO', 'Azul', 'P', 'https://abrir.link/xmZnn', 'Poliester', 'Zara', 'Floral', 129.90, '2024-08-15', 'Primavera');

-- Peca de Roupa 3
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Calca Jeans', 'CALCA', 'Azul', 'G', 'https://abrir.link/AnnAE', 'Jeans', 'Lee', 'Liso', 99.90, '2024-07-10', 'Outono');

-- Peca de Roupa 4
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Jaqueta de Couro', 'JAQUETA', 'Preto', 'M', 'https://abrir.link/cFHDB', 'Couro', 'Guess', 'Liso', 299.90, '2024-09-05', 'Inverno');

-- Peça de Roupa 5
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Camisa Social', 'CAMISA', 'Azul Escuro', 'G', 'https://abrir.link/OloiE', 'Algodao', 'Polo', 'LISO', 89.90, '2024-08-25' ,'PRIMAVERA');


--Lookbook 1
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Verao Casual', '2024-09-04');

-- Lookbook 2
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Primavera Romantico', '2024-09-01');

-- Lookbook 3
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Casual de Outono', '2024-08-20');

-- Lookbook 4
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Inverno Urbano', '2024-09-06');

-- Lookbook 5
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Festa Chic', '2024-09-10');



-- Relacionando Lookbook 1 com Clothing Item 1 (Camiseta Branca)
INSERT INTO lookbook_clothing_item (lookbook_id, clothing_item_id) VALUES (1, 1);


-- Relacionando Lookbook 2 com Clothing Item 2 (Vestido Floral)
INSERT INTO lookbook_clothing_item (lookbook_id, clothing_item_id) VALUES (2, 2);

-- Relacionando Lookbook 3 com Clothing Item 3 (Calca Jeans)
INSERT INTO lookbook_clothing_item (lookbook_id, clothing_item_id) VALUES (3, 3);

-- Relacionando Lookbook 4 com Clothing Item 4 (Jaqueta de Couro)
INSERT INTO lookbook_clothing_item (lookbook_id, clothing_item_id) VALUES (4, 4);

-- Relacionando Lookbook 5 com Clothing Item 5 (Camisa Social)
INSERT INTO lookbook_clothing_item (lookbook_id, clothing_item_id) VALUES (5, 5);
