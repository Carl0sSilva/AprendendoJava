# Personagens RPG - Avaliação de Herança

Este repositório finaliza a trilha de aprendizado de Java básico/intermediário, focando na estrutura de classes de um sistema de RPG.

## 🧠 Conceitos Chave

- **Super & This:** Diferenciação clara entre atributos da própria classe e chamadas à classe pai.
- **Sobrescrita (Override):** Especialização do método `mostrarInfo()` para exibir atributos únicos de cada classe.
- **Hierarquia de Instanciação:** Demonstração visual de como o Java invoca construtores da superclasse antes das subclasses.

## 🏗️ Estrutura

- `Personagem`: Base com nome, nível e saúde.
- `Guerreiro`: Subclasse com bônus de arma.
- `Mago`: Subclasse com bônus de magia.

## 🛠️ Como executar

1.  `cd ex12-personagens`
2.  `javac *.java`
3.  `java Main`

## 💻 O que este exercício prova?
Este exercício demonstra a capacidade de estender funcionalidades sem repetir código (DRY - Don't Repeat Yourself), um dos maiores benefícios da Programação Orientada a Objetos.