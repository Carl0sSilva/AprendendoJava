# Sistema de Magia Elemental

Este exercício explora a **Herança** e o **Polimorfismo** em Java através de um sistema de combinações mágicas.

## 🧠 Conceitos Chave

- **Herança:** Reutilização de código onde subclasses herdam comportamentos de uma classe pai (`Elemento`).
- **Polimorfismo:** Capacidade de tratar diferentes objetos (Fogo, Água, etc.) como sendo do tipo genérico `Elemento`.
- **Lógica Condicional:** Uso de operadores lógicos (`||` e `&&`) para validar combinações de objetos.

## 🏗️ Estrutura

- `Elemento.java`: Superclasse base.
- `Fogo.java`, `Agua.java`, `Ar.java`, `Terra.java`: Subclasses específicas.
- `Cajado.java`: Classe que processa a interação entre elementos.

## 🛠️ Como executar

1.  Navegue até a pasta: `cd ex06-cajadoCombinado`
2.  Compile: `javac *.java`
3.  Execute: `java MyClass`

## 💻 Exemplo de Saída

```text
Poder de FOGO executado
Poder de COMBUSTÃO executado
Poder de LAVA executado
...