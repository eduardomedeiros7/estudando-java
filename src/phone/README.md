# Phone Project

Este projeto prático foca na implementação de relacionamentos entre objetos em Java, utilizando os conceitos de **Composição** e **Associação**.

## 🛠️ Tecnologias e Conceitos
- **Java**: Linguagem principal.
- **Composition**: A classe `Phone` possui uma `Screen` (ciclo de vida dependente).
- **Association**: A classe `User` possui um `Phone` (ciclo de vida independente).
- **Encapsulation**: Uso de modificadores `private`, getters e setters.

## 🏗️ Arquitetura (UML)

Abaixo está o modelo conceitual que serviu de base para a construção das classes `User`, `Phone` e `Screen`:

<img src="uml/uml-phone.drawio.png" alt="Diagrama UML do Projeto" width="600">

## 💻 Como rodar
A execução principal acontece na classe `Program`, onde os objetos são instanciados e as associações são realizadas manualmente.