# Herança e Construtores em Java

Este exercício explora a mecânica interna do Java no que diz respeito à criação de objetos herdados e ao uso da palavra-chave `super`.

## 🧠 Conceitos Chave

- **Construtores em Cascata:** Demonstração de que o Java percorre a hierarquia de classes de cima para baixo no momento da instanciação.
- **Uso do `super()`:** Como chamar construtores específicos da classe pai para evitar repetição de código.
- **Sobrecarga (Overloading):** Criação de construtores com e sem argumentos para maior flexibilidade.

## 🏗️ Hierarquia
`Veiculo` (Pai) 
 ├── `Carro` (Filho)
 └── `Esportivo` (Filho)

## 🛠️ Como executar

1.  `cd ex11-veiculos`
2.  `javac *.java`
3.  `java Main`

## 💻 O que observar
Ao rodar o código, repare que mesmo chamando `new Esportivo()`, o console imprime primeiro a criação do `Veiculo`. Isso prova que um objeto filho não pode existir sem que sua base de pai seja construída primeiro.