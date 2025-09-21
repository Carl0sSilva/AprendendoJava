public class Carro {
    int ano;
    String marca;
    String modelo;
    String cor;
    
    public void exibirModelo(){
        System.out.println("\nEste carro é um "+this.modelo);
    }
    public void exibirAnoECor(){
        System.out.printf("Ano %d, e é da cor %s\n", this.ano, this.cor);
    }
}