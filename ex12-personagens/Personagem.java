class Personagem {
    
    // colocar abaixo as variaveis do personagem
    String nome;
    int saude;
    int nivel;

    // Construtor padrão - Deve ter o nome "Desconhecido", nivel 1, saude 100 e mostrar a mensagem "Construtor padrão de Personagem chamado."
    public Personagem(){
        nome = "Desconhecido";
        saude = 100;
        nivel = 1;
        System.out.println("Construtor padrão de Personagem chamado.");
    }

    // Construtor com parâmetros - Deve receber os três parâmetros do personagem e preencher as variáveis de instância
    // ao final exibir a mensagem - Construtor sobrecarregado de Personagem chamado.
    public Personagem(String nome, int nivel, int saude){
        // Preencher com this.variavel = nomeParametroPassado
        this.nome = nome;
        this.saude = saude;
        this.nivel = nivel;
        System.out.println("Construtor sobrecarregado de Personagem chamado.");
    }

    public void mostrarInfo(){
        System.out.println("Nome: "+ nome +", Nível: "+ nivel +", Saúde: "+ saude);
    }
}
