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
  └── test/
```

## 📦 Tecnologias Utilizadas

- **Frontend**: Thymeleaf 🌐
- **Backend**: Java com Spring Boot ☕️
- **Banco de Dados**: Oracle Cloud ☁️
- **Hospedagem**: Azure App Service 🌟

## 🛠️ Instalação e Execução

1. **Clone o Repositório** 🧑‍💻

   ```bash
   git clone https://github.com/laiscrz/lookbook-java-mvc.git
   cd lookbook-java-mvc
   ```

2. **Configure o Banco de Dados** 🗃️

   - Certifique-se de que o Oracle Database está em execução e acessível.
   - Atualize as configurações de banco de dados no arquivo `src/main/resources/application.properties` com as credenciais do seu banco de dados.

3. **Compile e Execute a Aplicação** 🚀

   ```bash
   ./mvnw clean package
   ./mvnw spring-boot:run
   ```

4. **Acesse a Aplicação** 🌐

   Navegue até `http://localhost:8080` no seu navegador para acessar a aplicação.

## 🛠️ Deploy no Azure

### Passo a Passo

1. **Crie um Grupo de Recursos** 🏷️
   
   - **Nome**: `rg-lookbook`
   - No portal do Azure, vá para **Grupos de Recursos** e clique em **Adicionar**.
   - Insira o nome do grupo e selecione a região desejada.

2. **Crie um Plano de Serviço do App** 📈

   - **Nome**: `LookbooksAppPlan`
   - No portal do Azure, vá para **Planos de Serviço do App** e clique em **Adicionar**.
   - Insira o nome do plano, selecione a região (deve corresponder ao grupo de recursos), e escolha o plano de tarifa adequado para sua aplicação.

3. **Crie um Web Service App** 🌐

   - **Nome**: `AppLookbooks`
   - No portal do Azure, vá para **Aplicativos de Serviço** e clique em **Adicionar**.
   - Insira o nome do aplicativo, selecione o grupo de recursos `rg-lookbook`, e escolha o plano de serviço do app `LookbooksAppPlan`.

4. **Configure o Deploy** ⚙️

   - No portal do Azure, acesse o aplicativo criado em **Aplicativos de Serviço**.
   - Vá para **Deployment Center** e configure o repositório GitHub para o deploy contínuo.
   - Configure a autenticação e selecione o branch do GitHub que você deseja usar para deploy.

5. **Faça o Deploy** 🚀

   - Com as configurações prontas, o Azure automaticamente fará o deploy da sua aplicação sempre que houver uma atualização no branch configurado.

6. **Verifique a Aplicação** 🔍

   - Após o deploy, vá para a URL fornecida pelo Azure para verificar se a aplicação está funcionando corretamente.

## 📊 MER/DER

![image](https://github.com/user-attachments/assets/94ffbde2-404f-4451-8abe-4633da84cf34)

## 🛠️ Integração Contínua com GitHub Actions

Este projeto utiliza o GitHub Actions para automação do fluxo de trabalho de desenvolvimento. A configuração de CI/CD é definida no arquivo `.github/workflows/ci.yml`, que executa os seguintes passos:

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

