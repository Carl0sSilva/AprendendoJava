/* faça Mago ser filho de personagem */
class Mago extends Personagem {
	// criar uma variavel de instancia chamama magia com tipo String;
	String magia;

	// Construtor padrão de Mago
	public Mago() {
		// Chama o construtor padrão da classe Personagem
		super();
		// preenche a variavel de instancia com o valor "Fogo";
		magia = "Fogo";
		// exibir a mensagem "Construtor padrão de Mago chamado."
		System.out.println("Construtor padrão de Mago chamado.");
	}

	// Construtor sobrecarregado de Mago
	// receber nome, nivel, saude e magia
	public Mago(String nome, int nivel, int saude, String magia) {
		// Chama o construtor sobrecarregado da classe Personagem passando nos parametros
		super(nome, nivel, saude);
		// receber e preencher a variavel magia (usar this)
		this.magia = magia;
		// exibir "Construtor sobrecarregado de Mago chamado."
		System.out.println("Construtor sobrecarregado de Mago chamado.");
	}

	public void mostrarInfo() {
		// Chama o método da classe base
		super.mostrarInfo();
		System.out.println("Magia: " + magia);
	}
}