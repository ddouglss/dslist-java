# 🎮 Projeto Backend de Sistema de Jogos - Spring Boot (Java 21)
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/seu-usuario/seu-repo/blob/main/LICENSE)

## 📋 Sobre o Projeto

Desenvolvi um sistema backend para gerenciamento de jogos, aplicando boas práticas de engenharia de software com **Spring Boot**.  
 
---
## 💻 Arquitetura do Projeto
![arquiteturaJava](https://github.com/user-attachments/assets/d51119d0-98ee-4946-ac94-73b5e2ec0e05)

acesse o link para visualizar o Sitema a cima: https://app.eraser.io/workspace/dBAQ43askZZwvqSH5Iy0?origin=share

---

## 📫 Endpoints no Postman
![dslistJava](https://github.com/user-attachments/assets/b373b07c-3a44-4b45-867a-4ad963867363)

---

## 🧠 Modelo Conceitual
![dslist-model](https://github.com/user-attachments/assets/768187db-b474-43a5-aeb1-8ab60b58abe6)

---

## 📁 Organização do Projeto
![DslistPastas](https://github.com/user-attachments/assets/ff6ea6d0-9c51-4811-9506-10430621d715)

---

## 🚀 Tecnologias Utilizadas

### 🔧 Backend
- Java 21
- Spring Boot
- Spring Data JPA
- JPA / Hibernate
- Maven
- Docker Compose
- CI/CD
- API REST
- DTO, Projections
- Embedded ID

### ☁️ Implantação em Produção
- Backend: [Railway](https://railway.app/)
- Banco de dados: PostgreSQL

---

## ✅ Funcionalidades
- Cadastro e listagem de jogos
- Relacionamento N:N com entidades (chaves compostas com `@EmbeddedId`)
- Atualizações com verbos HTTP corretos (idempotência)
- Consultas otimizadas com Projections
- Estrutura em camadas: Controller, Service, Repository

---

## 🐳 Como Executar com Docker
```bash
docker-compose up
```
## 💻 Como Executar Localmente
- Pré-requisitos
- Java 21 (ou 17, dependendo da versão)
- Maven

#Passos:
```bash
# Clonar o repositório
git clone https://github.com/ddouglss/dslist-java

# Acessar o diretório do projeto
cd dslist-java

# Executar o projeto
./mvnw spring-boot:run
```

## 🧠 Aprendizados e Conceitos Aplicados

- Padrão em camadas (Controller, Service, Repository)

- Padrão DTO e Projections

- RESTful com Spring Boot

- Deploy com CI/CD e Railway

- CORS e ambiente de desenvolvimento com Docker Compose

- Boas práticas com Java moderno (Java 21)


## Autor
Douglas Souza Silva
- Linkedin : https://www.linkedin.com/in/ddouglss/
