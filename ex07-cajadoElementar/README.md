# Arena de Duelos Elementares

Um sistema de RPG em Java que utiliza composição de objetos para simular duelos mágicos entre jogadores com diferentes afinidades elementares.

## 🚀 Novidades deste Exercício

- **Composição de Objetos:** O Player agora "tem" um Cajado e um Anel.
- **Motor de Duelo:** Uma classe dedicada (`Duelo`) para processar a lógica de vitória/derrota.
- **Cálculos Dinâmicos:** Métodos que somam atributos de múltiplos objetos para gerar um resultado final.

## 🎮 Funcionamento

O sistema permite que cada jogador escolha dois elementos base. Dependendo da escolha, um "Núcleo" especial é gerado (ex: Fogo + Terra = Lava). O duelo compara o `atacar()` do Player 1 com o `defender()` do Player 2.

## 🏗️ Estrutura de Pastas

- `Player.java`: Atributos e métodos do guerreiro.
- `Duelo.java`: Lógica de comparação de poder.
- `Cajado.java` / `Anel.java`: Itens de equipamento.
- `Elemento.java` + subclasses: Sistema de tipos.

## 🛠️ Como executar

1.  `cd ex07-cajadoElementar`
2.  `javac *.java`
3.  `java MyClass`

## 💻 Exemplo de Saída

```text
O Player 1 ataca com seu cajado embuído pelo poder do elemento LAVA
O Player 2 defende com os poderes elementais de AGUA emanados de seu anel
O player 1 é o vencedor do duelo