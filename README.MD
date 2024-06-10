# Characters Application

Este é um projeto de exemplo para uma aplicação de gerenciamento de personagens, utilizando Spring Boot, Java 17, H2 Database e Docker.

## Requisitos

- Java 17
- Maven
- SpringBoot 3 ou superior
- Docker
- Intellij IDE
- MySQL(opcional)

## Instalação e Configuração

1. Clone o repositório do projeto:

   ```bash
   git clone https://seu-repositorio/characters.git

2. Navegue até o diretório do projeto:

   ```bash
   cd characters

3. Construa o projeto utilizando o Maven:
   ```bash
   mvn clan install

## Configuração do Banco de Dados

Este projeto utiliza um bando de dados H2 em memória por padrão. Não é necessário configurar nenhum banco de dados.

## Execução com Docker

1. Construa a imagem Docker do projeto:
   ```bash
   docker build -t characters-app

2. Execute o container Docker:
   ```bash
   docker run -p 8080:8080 characters-app

# Uso

Após a execução, você pode acessar a API do aplicativo para gerenciar os personagens. Alguns endpoints úteis incluem:

    GET /characters: Retorna todos os personagens cadastrados.
    GET /characters/{id}: Retorna um personagem específico pelo ID.
    POST /characters: Cria um novo personagem.
    PUT /characters/{id}: Atualiza um personagem existente pelo ID.
    DELETE /characters/{id}: Remove um personagem pelo ID.

Consulte a documentação da API ou os arquivos de código-fonte para obter mais detalhes sobre os endpoints disponíveis.

# Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

# Licença

Este projeto é licenciado sob renanpa96

