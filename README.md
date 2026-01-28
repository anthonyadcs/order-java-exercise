# Exercício de Pedidos – Java (Orientação a Objetos)

Este repositório contém a implementação do **exercício de Pedido** do curso **Java Completo – Programação Orientada a Objetos**, ministrado por **Nélio Alves**.

O objetivo principal do exercício é praticar **modelagem orientada a objetos**, com foco em **composição de classes**, uso de **enum**, **listas**, **datas** e **boas práticas de organização de código**.

---

## 📌 Descrição do Exercício

O sistema simula um **pedido de compra**, semelhante a um cenário de e-commerce, onde é possível:

* Criar um cliente
* Criar um pedido com data e status
* Adicionar múltiplos itens ao pedido
* Associar produtos a cada item
* Calcular subtotais e o valor total do pedido
* Exibir um resumo completo do pedido

Todo o foco está na **estrutura do domínio**, não em interface gráfica ou persistência de dados.

---

## 🧱 Estrutura do Projeto

O projeto é composto pelas seguintes entidades principais:

### 🧍 Client

Representa o cliente que realizou o pedido.

Atributos típicos:

* Nome
* Email
* Data de nascimento

---

### 📦 Order

Representa o pedido realizado.

Responsabilidades:

* Armazenar o momento do pedido
* Controlar o status do pedido
* Manter a lista de itens
* Calcular o valor total

---

### 🧾 OrderItem

Representa um item dentro do pedido.

Responsabilidades:

* Armazenar quantidade e preço
* Manter a referência ao produto
* Calcular o subtotal do item

---

### 🏷 Product

Representa o produto comercializado.

Atributos típicos:

* Nome
* Preço

---

### 📌 OrderStatus (Enum)

Enumeração que define os possíveis estados de um pedido, como:

* PENDING_PAYMENT
* PROCESSING
* SHIPPED
* DELIVERED

---

## 🔗 Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Composição de objetos
* Encapsulamento
* Enumerações (`enum`)
* Coleções (`List`)
* Datas com `LocalDate` e `LocalDateTime`
* Separação de responsabilidades

---

## 🚀 Objetivo Educacional

Este exercício tem como finalidade consolidar conceitos fundamentais de Java e Orientação a Objetos, servindo como base para o desenvolvimento de sistemas maiores, APIs e aplicações backend.

---

## 🛠 Tecnologias Utilizadas

* Java
* Java SE (Collections, Date/Time API)

---

## 📚 Curso de Referência

* **Java Completo – Programação Orientada a Objetos**
* Instrutor: **Nélio Alves**

---

## 📄 Observações

Esta implementação representa **a minha versão da resolução do exercício**, podendo apresentar diferenças em relação à solução proposta pelo instrutor ao longo do curso.

As decisões de modelagem e organização do código foram mantidas propositalmente, pois refletem **meu raciocínio, minhas escolhas e minha forma de abordar a resolução de problemas** no momento do desenvolvimento.

O objetivo não é substituir ou corrigir a solução original do professor, mas **registrar meu processo de aprendizado**, evidenciando como compreendo e aplico os conceitos de Orientação a Objetos em Java.

Este projeto possui fins **educacionais** e serve como base para evolução técnica, revisões futuras e comparação de abordagens diferentes para um mesmo problema.
