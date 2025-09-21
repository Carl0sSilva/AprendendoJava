public class Esportivo extends Veiculo {

    public Esportivo(){
        super();
        System.out.println("Carro esportivo criado com construtor padrão.");
    }

    public Esportivo(String tipo){
        super(tipo);
        System.out.println("Carro esportivo do tipo "+ tipo +" criado.");
    }
}