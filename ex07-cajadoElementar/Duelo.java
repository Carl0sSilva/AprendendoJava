public class Duelo {
    
    public void iniciarDuelo (Player p1, Player p2){
        int dano;
        int resistencia;
        
        System.out.println ("O Player 1 ataca com seu cajado embuído pelo poder do elemento "+ p1.getNucleo());
        System.out.println ("O Player 2 defende com os poderes elementais de "+ p2.getNucleo() +" emanados de seu anel");
        
        dano = p1.atacar();
        resistencia = p2.defender();
        
        if (dano > resistencia){
            System.out.println("\nO poderoso ataque de "+ p1.getNucleo() +" do Player 1 supera a defesa de "+ p2.getNucleo() +" do Player 2");
            System.out.println("\nO player 1 é o vencedor do duelo");
        } else if (resistencia > dano){
            System.out.println("\nO ataque de "+ p1.getNucleo() +" do Player 1 não é capaz de penetrar a forte defesa de "+ p2.getNucleo() +" do Player 2");
            System.out.println("\nO player 2 é o vencedor do duelo");
        } else {
            System.out.println("\nOs poderes elementais de "+ p1.getNucleo() +" se cancelam em uma grande explosão");
            System.out.println("\nO duelo termina empatado");
        }
        
        System.out.println("\nPlayer 1 dano: "+ dano);
        System.out.println("Player 2 resistencia: "+ resistencia);
        System.out.println("===============================================================\n");
        
    }
    
}