# 👗📚 Gerenciamento de Lookbooks Personalizados

A aplicação **Gerenciamento de Lookbooks Personalizados** tem como objetivo ajudar os usuários a gerenciar seus lookbooks de forma fácil e intuitiva. O sistema permite a criação, edição, visualização e exclusão de lookbooks, além de associar peças de roupa a eles, ajudando o usuário a montar looks personalizados de acordo com suas preferências.

## 🚀 Funcionalidades Principais

- **CRUD de Lookbooks**: O usuário pode criar, editar, visualizar detalhes e deletar lookbooks. ✏️🗑️
- **CRUD de Peças de Roupa**: O usuário pode gerenciar suas peças de roupa associadas aos lookbooks. 👕👖
- **Visualização Detalhada**: Exibe informações detalhadas sobre cada lookbook e suas peças associadas, incluindo imagens e valores. 🔍💰

## 📂 Estrutura de Pastas
```tree
  src/
  ├── main/
  │   ├── java/com/leadtech/lookbook/
  │   │   ├── controllers/
  │   │   ├── models/
  │   │   ├── repositories/
  │   │   └── services/
  │   └── resources/
  │       ├── templates/
  │       └── application.properties
  │       └── import.sql
  └── test/
```

## 📦 Tecnologias Utilizadas

- **Frontend**: Thymeleaf 🌐
- **Backend**: Java com Spring Boot ☕️
- **Banco de Dados**: Oracle Cloud ☁️
- **Hospedagem**: Azure App Service 🌟

---

## 🛤️ Rotas da Aplicação

### Rota para Peças de Roupa (`ClothingItemController`)

- **Listar Peças**: `GET /clothing` - Exibe uma lista de todas as peças de roupa.
- **Novo Formulário**: `GET /clothing/novo` - Exibe o formulário para adicionar uma nova peça de roupa.
- **Salvar/Atualizar**: `POST /clothing` - Salva uma nova peça de roupa ou atualiza uma existente.
- **Editar**: `GET /clothing/editar/{id}` - Exibe o formulário para editar uma peça de roupa existente.
- **Deletar**: `GET /clothing/deletar/{id}` - Remove uma peça de roupa pelo ID.
- **Detalhes**: `GET /clothing/detalhes/{id}` - Exibe detalhes de uma peça de roupa específica.

### Rota para Lookbooks (`LookbookController`)

- **Listar Lookbooks**: `GET /lookbooks` - Exibe uma lista de todos os lookbooks.
- **Novo Formulário**: `GET /lookbooks/novo` - Exibe o formulário para adicionar um novo lookbook.
- **Salvar/Atualizar**: `POST /lookbooks` - Salva um novo lookbook ou atualiza um existente.
- **Editar**: `GET /lookbooks/editar/{id}` - Exibe o formulário para editar um lookbook existente.
- **Deletar**: `GET /lookbooks/deletar/{id}` - Remove um lookbook pelo ID.
- **Detalhes**: `GET /lookbooks/detalhes/{id}` - Exibe detalhes de um lookbook específico.

---

## 🚀 Deploy no Azure

### Passo a Passo

1. **Crie um Grupo de Recursos** 🏷️
   
   - **Nome**: `rg-lookbook`
   - No portal do Azure, vá para **Grupos de Recursos** e clique em **Adicionar**.
   - Insira o nome do grupo e selecione a região desejada.

2. **Crie um Plano de Serviço do App** 📈

   - **Nome**: `LookbooksAppPlan`
   - No portal do Azure, vá para **Planos de Serviço do App** e clique em **Adicionar**.
   - Insira o nome do plano, selecione a região (que deve ser a mesma do grupo de recursos) e escolha o plano de tarifa **Free** para economizar recursos.

3. **Crie um Web Service App** 🌐

   - **Nome**: `AppLookbooks`
   - No portal do Azure, vá para **Aplicativos de Serviço** e clique em **Adicionar**.
   - Selecione o **grupo de recursos** `rg-lookbook` e o **plano de serviço** `LookbooksAppPlan`.
   - Escolha o sistema operacional **Windows** e a versão do **Java 17** para o runtime.

4. **Configure o Deploy** ⚙️

   - Durante a criação do Web App, selecione **GitHub Actions** como método de deploy contínuo.
   - Conecte sua conta do GitHub, selecione o **repositório** correto e o **branch** para o deploy.
   - O Azure gerará um arquivo **YAML** para o workflow do GitHub Actions, configurando o processo de build e deploy.

5. **Faça o Deploy** 🚀

   - O deploy será iniciado automaticamente via **GitHub Actions** após atualizações no branch configurado.
   - Acompanhe o progresso no **Deployment Center** ou no **GitHub Actions**.

6. **Verifique a Aplicação** 🔍

   - Após o deploy, o Azure fornecerá uma URL para acessar a aplicação.
   - Acesse a URL (ex: `https://applookbooks.azurewebsites.net/lookbooks`) para verificar a funcionalidade.

---

## Testes do CRUD 📝

### 1. Criação (Create) ✏️

- Insira novos registros de lookbooks através da interface da aplicação.
- **Exemplo**: Adicione um novo **lookbook** com as seguintes informações:
  
  **Dados do Lookbook**:
  ```plaintext
  Nome: Look Primavera Casual
  ```

  **Dados do Item de Roupa**:
  ```plaintext
  Nome: Camiseta Ciganinha
  Categoria: CAMISETA
  Cor: Preta
  Tamanho: M
  URL da Imagem: https://abrir.link/ivTDX
  Material: Viscose
  Marca: Forever 21
  Padrão: LISO
  Preço: R$ 69,90
  Sazonalidade: PRIMAVERA
  ```

### 2. Leitura (Read) 📖

- Verifique se os dados inseridos são exibidos corretamente na aplicação.
- **Exemplo**: Após criar o lookbook, confira se todas as informações (nome, itens de roupa, etc.) estão sendo exibidas corretamente na página.

### 3. Atualização (Update) ✍️

- Edite registros existentes e confirme que as alterações foram salvas corretamente.
- **Exemplo**: Modifique o nome do lookbook e o item de roupa para:

  **Novo Nome do Lookbook**:
  ```plaintext
  Nome: Look Outono Casual
  ```

  **Dados Atualizados do Item de Roupa**:
  ```plaintext
  Nome: Camiseta Ciganinha Estilizada
  Categoria: CAMISETA
  Cor: Preta
  Tamanho: G
  URL da Imagem: https://abrir.link/ivTDX
  Material: Algodao
  Marca: Zara
  Padrão: ABSTRATO
  Preço: R$ 89,90
  Sazonalidade: OUTONO
  ```

### 4. Exclusão (Delete) 🗑️

- Exclua registros e verifique se eles foram removidos do banco de dados.
- **Exemplo**: Delete o lookbook **Look Outono Casual** e seus respectivos itens de roupa, certifique-se de que eles não aparece mais na lista de lookbooks e nas peças disponíveis.

### 5. Validação ✅

- Certifique-se de que todas as operações estão funcionando conforme esperado e sem erros.
- Use as consultas no próprio SQL Developer.


--- 


## 📊 MER/DER

![image](https://github.com/user-attachments/assets/94ffbde2-404f-4451-8abe-4633da84cf34)

## 🛠️ Integração Contínua com GitHub Actions

Este projeto utiliza o GitHub Actions para automação do fluxo de trabalho de desenvolvimento. A configuração de CI/CD é definida no arquivo `.github/workflows/main_applookbooks.yml`, que executa os seguintes passos:

- **Compilação do Projeto**: Compila o código-fonte e executa os testes automatizados. 🧪
- **Deploy Automatizado**: Publica a aplicação no Azure App Service. 🚀

## 📄 Script SQL

O arquivo `script.sql` contém o DDL das tabelas utilizadas na aplicação. Ele inclui as instruções para a criação das tabelas, definição de colunas, chaves primárias, e comentários explicativos.

- **Caminho do Arquivo**: [script.sql](script.sql)
- **Conteúdo**: 

  - **Tabelas**: Definidas com suas respectivas colunas e tipos de dados.
  - **Chaves Primárias**: Especificadas para garantir a integridade dos dados.
  - **Comentários**: Explicações sobre o propósito e estrutura das tabelas.

Você pode encontrar o arquivo [script.sql](script.sql) na raiz do repositório. Para visualizar ou executar o DDL, acesse o arquivo diretamente no repositório.

## 📝 Próximos Passos

- **Fluxo de Autenticação do Cliente**: Implementar autenticação e autorização de usuários. 🔐
- **Refatoração da Estilização dos Templates**: Melhorar a estilização das páginas para uma melhor experiência do usuário. 🎨
- **Tratamento de Upload da Imagem**: Adicionar funcionalidade para o upload de imagens no cadastro de peças de roupa. 📸
- **Implementação com IA**: Integrar uma IA para sugestão de lookbooks baseados nas preferências do usuário. 🤖

## 📄 Documentação Adicional

- **Código Fonte**: [GitHub Repository](https://github.com/laiscrz/lookbook-java-mvc) 📁
- **Vídeo de Demonstração**: [YouTube Video](https://www.youtube.com/link-para-o-video) 📹

## 🫂 Integrantes

Aqui estão os membros do grupo que participaram durante desenvolvimento desta SPRINT.

* **RM 552267 - Bianca Leticia Román Caldeira**
  - Turma: 2TDSPH
    
* **RM 552252 – Charlene Aparecida Estevam Mendes Fialho**
  - Turma: 2TDSPH

* **RM 552258 - Laís Alves da Silva Cruz**
  - Turma: 2TDSPH

* **RM 97916 – Fabricio Torres Antonio**
  - Turma: 2TDSPH

* **RM 99675 – Lucca Raphael Pereira dos Santos**
  - Turma: 2TDSPZ

<table>
  <tr>
        <td align="center">
      <a href="https://github.com/biancaroman">
        <img src="https://avatars.githubusercontent.com/u/128830935?v=4" width="100px;" border-radius='50%' alt="Bianca Román's photo on GitHub"/><br>
        <sub>
          <b>Bianca Román</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/charlenefialho">
        <img src="https://avatars.githubusercontent.com/u/94643076?v=4" width="100px;" border-radius='50%' alt="Charlene Aparecida's photo on GitHub"/><br>
        <sub>
          <b>Charlene Aparecida</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/laiscrz">
        <img src="https://avatars.githubusercontent.com/u/133046134?v=4" width="100px;" alt="Lais Alves's photo on GitHub"/><br>
        <sub>
          <b>Lais Alves</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/LuccaRaphael">
        <img src="https://avatars.githubusercontent.com/u/127765063?v=4" width="100px;" border-radius='50%' alt="Lucca Raphael's photo on GitHub"/><br>
        <sub>
          <b>Lucca Raphael</b>
        </sub>
      </a>
    </td>
     <td align="center">
      <a href="https://github.com/Fabs0602">
        <img src="https://avatars.githubusercontent.com/u/111320639?v=4" width="100px;" border-radius='50%' alt="Fabricio Torres's photo on GitHub"/><br>
        <sub>
          <b>Fabricio Torres</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

