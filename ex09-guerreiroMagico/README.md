# Guerreiros Mágicos - Classes Abstratas

Este exercício explora o uso de classes e métodos abstratos para criar sistemas de tipos flexíveis e obrigar a implementação de comportamentos específicos em subclasses.

## 🧠 Conceitos Chave

- **Classes Abstratas:** Uso da palavra-chave `abstract` para impedir a criação de objetos genéricos da classe `Guerreiro`.
- **Contratos de Comportamento:** O método `abstract int ataqueMagico()` garante que qualquer tipo de guerreiro criado no futuro tenha uma implementação de magia.
- **Polimorfismo:** Capacidade de referenciar objetos específicos (`MagicoLunar`) através de um tipo genérico (`Guerreiro`).

## 🏗️ Estrutura

- `Guerreiro`: Classe base abstrata.
- `MagicoLunar` / `MagicoNecromantico`: Implementações concretas.
- `Espada`: Objeto de composição que adiciona bônus ao ataque.

## 🛠️ Como executar

1.  `cd ex09-guerreiroMagico`
2.  `javac *.java`
3.  `java MyClass`

## 💻 Saída Esperada

Exibe o nome das armas, dos guerreiros e os valores calculados de seus ataques físicos e mágicos, demonstrando a integração entre os atributos do guerreiro e sua espada.