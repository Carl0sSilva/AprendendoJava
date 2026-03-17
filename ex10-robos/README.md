# Sistema de Robôs Modulares - POO Avançada

Este exercício demonstra a montagem de objetos complexos através da composição de diferentes módulos e o uso de hierarquias abstratas para manter a flexibilidade do sistema.

## 🧠 Conceitos Chave

- **Composição de Objetos:** Demonstração de "tem-um" em múltiplos níveis (Robô tem Canhão, Canhão tem Nave).
- **Delegação de Métodos:** O robô não sabe calcular a força da nave diretamente; ele pede ao canhão, que por sua vez pede à nave.
- **Classes Abstratas:** Garantem a padronização dos métodos `ataqueTotal()`, `calcularForcaCanhao()` e `calcularForca()`.

## 🏗️ Componentes do Projeto

- **Robôs:** `Dentitron`, `Musatron`.
- **Canhões:** `Andromeda`, `Colera`.
- **Naves (Ships):** `Agua`, `Terra`, `Raio`.

## 🛠️ Como executar

1.  `cd ex10-robos`
2.  `javac *.java`
3.  `java MyClass`

## 💻 Exemplo de Saída

O programa exibirá os valores de ataque final de cada configuração de robô montada no `MyClass.java`, refletindo a soma de todos os módulos acoplados.