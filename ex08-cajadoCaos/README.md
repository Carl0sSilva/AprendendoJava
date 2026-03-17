# Cajado do Caos - Downcasting & instanceof

Este exercício foca na manipulação de objetos dentro de uma hierarquia de herança, especificamente na conversão de tipos para acessar métodos especializados.

## 🧠 Conceitos Chave

- **instanceof:** Garante a segurança do código verificando se o objeto é compatível com o tipo desejado antes da conversão.
- **Downcasting:** Conversão explícita da superclasse para a subclasse (ex: `(PedraFogo) p`).
- **Especialização:** Cada pedra elemental possui bônus e métodos de cálculo distintos, apesar de compartilharem a mesma base.

## 🏗️ Estrutura

- `PedraElemental`: Superclasse com o poder base.
- `PedraFogo`, `PedraAgua`, `PedraTerra`, `PedraAr`: Subclasses com bônus específicos.
- `CajadoCaos`: Classe responsável por identificar o tipo de pedra e extrair seu poder.

## 🛠️ Como executar

1.  Navegue até a pasta: `cd ex08-cajadoCaos`
2.  Compile: `javac *.java`
3.  Execute: `java MyClass`

## 💻 Exemplo de Saída

```text
30 (Cajado 10 + Fogo 10 + Núcleo 10)
31 (Cajado 10 + Água 11 + Núcleo 10)
40 (Cajado 10 + Terra 20 + Núcleo 10)
35 (Cajado 10 + Ar 15 + Núcleo 10)