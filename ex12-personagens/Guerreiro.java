/* A Classe Guerreiro deve herdar de personagem --- faça isso acontecer! */
class Guerreiro extends Personagem {
	// Aqui vai as variáveis de instancia do Guerreiro
	String arma;

	// Construtor padrão de Guerreiro
	// chame o construtor padrão da Classe Personagem (usar super)
	// Depois preencha a variavel arma com o valor = Espada de Aco
	public Guerreiro() {
		// Implemente aqui o que foi pedido acima
		super();
		arma = "Espada de Aço";
		System.out.println("Construtor padrão de Guerreiro chamado.");
	}

	// Construtor sobrecarregado de Guerreiro - crie ele recebendo os parametros nome, nivel, saude e arma.
	public Guerreiro(String nome, int nivel, int saude, String arma) {
		// Chama o construtor sobrecarregado da classe Personagem - use super
		super(nome, nivel, saude);
		// preenche o atributo arma com o valor do parametro
		this.arma = arma;
		// exibir mensagem "Construtor sobre/carregado de Guerreiro chamado."
		System.out.println("Construtor sobrecarregado de Guerreiro chamado.");
	}

	public void mostrarInfo() {
		// Chama o método mostrarInfo da classe base -> use super
		super.mostrarInfo();
		// exiba a mensagem "Arma: [valorArma]"
		System.out.println("Arma: " + arma);
	}
}