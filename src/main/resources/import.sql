-- Peca de Roupa 1
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Camiseta Branca', 'CAMISETA', 'Branco', 'M', 'https://abrir.link/DwOYl', 'Algodao', 'Nike', 'LISO', 49.90, TO_DATE('2024-09-01', 'YYYY-MM-DD'), 'VERAO');

-- Peca de Roupa 2
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Vestido Floral', 'VESTIDO', 'Azul', 'P', 'https://abrir.link/xmZnn', 'Poliester', 'Zara', 'FLORAL', 129.90, TO_DATE('2024-08-15', 'YYYY-MM-DD'), 'PRIMAVERA');

-- Peca de Roupa 3
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Calca Jeans', 'CALCA', 'Azul', 'G', 'https://abrir.link/AnnAE', 'Jeans', 'Lee', 'LISO', 99.90, TO_DATE('2024-07-10', 'YYYY-MM-DD'), 'OUTONO');

-- Peca de Roupa 4
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Jaqueta de Couro', 'JAQUETA', 'Preto', 'M', 'https://abrir.link/cFHDB', 'Couro', 'Guess', 'LISO', 299.90, TO_DATE('2024-09-05', 'YYYY-MM-DD'), 'INVERNO');

-- Peça de Roupa 5
INSERT INTO clothing_item (nome, categoria, cor, tamanho, imagem_url, material, marca, padrao, preco, data_cadastro, sazonalidade) VALUES ('Camisa Social', 'CAMISA', 'Azul Escuro', 'G', 'https://abrir.link/OloiE', 'Algodao', 'Polo', 'LISO', 89.90, TO_DATE('2024-08-25', 'YYYY-MM-DD'), 'OUTONO');

-- Lookbook 1
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Verao Casual', TO_DATE('2024-09-04', 'YYYY-MM-DD'));

-- Lookbook 2
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Primavera Romantico', TO_DATE('2024-09-01', 'YYYY-MM-DD'));

-- Lookbook 3
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Casual de Outono', TO_DATE('2024-08-20', 'YYYY-MM-DD'));

-- Lookbook 4
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Inverno Urbano', TO_DATE('2024-09-06', 'YYYY-MM-DD'));

-- Lookbook 5
INSERT INTO lookbook (nome, data_criacao) VALUES ('Look Festa Chic', TO_DATE('2024-09-10', 'YYYY-MM-DD'));

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
