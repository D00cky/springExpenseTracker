# 💰 Expense Tracker API

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-blue)

## 📋 Sobre o Projeto

O **Expense Tracker** é uma API RESTful desenvolvida para auxiliar no controle financeiro pessoal. O objetivo principal deste projeto foi consolidar os fundamentos do desenvolvimento Backend com **Java** e **Spring Boot**, focando em boas práticas de arquitetura e código limpo.

Este projeto serviu como base para meus estudos em:
- Estruturação de projetos em camadas (Controller, Service, Repository).
- Injeção de Dependência e Inversão de Controle.
- Operações de CRUD (Create, Read, Update, Delete).
- Manipulação de persistência de dados.

## 🚀 Tecnologias Utilizadas

- **Linguagem:** Java 17 (ou superior)
- **Framework:** Spring Boot 3
- **Gerenciador de Dependências:** Maven
- **Banco de Dados:** Utilizado H2 Database para fins de testes rapidos na memoria
- **Ferramentas:** Git/Postman

## ⚙️ Funcionalidades

- [x] Cadastrar uma nova despesa/transação.
- [x] Listar todas as transações.
- [x] Atualizar dados de uma transação.
- [x] Deletar uma transação.
- [ ] *Futuro:* Filtragem de despesas por mês.
- [ ] *Futuro:* Integração com API externa de conversão de moedas.

## 📦 Como Rodar o Projeto

### Pré-requisitos
Certifique-se de ter o **Java JDK 17+** e o **Maven** instalados em sua máquina.

```bash
# Clone este repositório
git clone [https://github.com/SEU-USUARIO/expense-tracker.git](https://github.com/SEU-USUARIO/expense-tracker.git)

# Entre na pasta do projeto
cd expense-tracker

# Compile e execute o projeto (Via terminal Linux)
./mvnw spring-boot:run

