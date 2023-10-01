# API REST com Spring Boot e SQL Server - Controller Greetings

[![Java](https://img.shields.io/badge/Java-11-orange.svg)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-green.svg)](https://spring.io/projects/spring-boot)
[![SQL Server](https://img.shields.io/badge/SQL%20Server-2019-blue.svg)](https://www.microsoft.com/en-us/sql-server/sql-server-downloads)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

Este é um exemplo de um controlador (controller) em uma API REST criada com Spring Boot para consulta de usuários em um banco de dados SQL Server.

## Controller Greetings

O `GreetingsController` é responsável por fornecer uma API para buscar um usuário pelo ID.

### Endpoints

- `GET /find/{id}`: Retorna um usuário pelo ID.

### Uso

Para utilizar este controller, você pode fazer uma solicitação GET para o endpoint `/find/{id}` com o ID do usuário desejado.

Exemplo de uso:

```http
GET http://localhost:8080/find/1
```

### Banco de Dados
# Criando o Banco de Dados `rtSoft` e a Tabela `usuario` 🛠️

Aqui estão os comandos SQL necessários para criar o banco de dados `rtSoft` e a tabela `usuario` em um ambiente SQL Server:

```sql
CREATE DATABASE rtSoft;
GO
USE rtSoft;
GO
CREATE TABLE usuario (
    id INT PRIMARY KEY IDENTITY(1,1),
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);
