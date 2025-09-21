public class Main{
    public static void main (String args[]){

        System.out.println("=== Criando Veículo ===");
        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo("Caminhão");
        
        System.out.println("\n=== Criando Carro ===");
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("SUV");

        System.out.println("\n=== Criando Esportivo ===");
        Esportivo esportivo1 = new Esportivo();
        Esportivo esportivo2 = new Esportivo("Conversível");
    }
}
