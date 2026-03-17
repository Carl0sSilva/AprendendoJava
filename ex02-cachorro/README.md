# Sistema de Associação Pessoa e Pet (Java POO)

Este projeto demonstra conceitos fundamentais de **Programação Orientada a Objetos** em Java, com foco em associação de classes e no uso do contexto de instância.

## 🧠 Conceitos Aplicados

* **Classes e Objetos:** Implementação das entidades `Pessoa` e `Dog`.
* **Associação de Objetos:** Demonstração de como um objeto pode conter outro como atributo.
* **Palavra-chave `this`:** Utilizada para referenciar explicitamente os atributos da própria instância do objeto.

## 🔍 Explicação Técnica: O uso do `this`

No código de `Pessoa.java`, usamos `this.nome` e `this.pet.nome`. 
O `this` é uma referência à **própria instância** do objeto. Ele garante que o código aceda ao atributo correto dentro do "molde" da classe, sendo essencial para diferenciar atributos de classe de variáveis locais ou parâmetros.

## 🛠️ Como executar

Estando na raiz do repositório, utilize os comandos:

1.  **Acesse o diretório:**
    ```bash
    cd ex02-cachorro
    ```

2.  **Compile os arquivos:**
    ```bash
    javac Dog.java Pessoa.java MyClass.java
    ```

3.  **Inicie o programa:**
    ```bash
    java MyClass
    ```

## 💻 Saída Esperada

```text
Criando objetos!
Olá, me chamo Romualdinho
O nome do meu Dog é Esnupi
au au