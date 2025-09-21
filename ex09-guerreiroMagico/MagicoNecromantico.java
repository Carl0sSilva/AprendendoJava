public class MagicoNecromantico extends Guerreiro {
    
    private int energiaNecromantica = 10;
    private Espada espada;
    
    public MagicoNecromantico (String nome, Espada espada, int forca){
        this.espada = espada;
        super.setNome(nome);
        super.setForcaFisica(forca);
    }
    
    @Override
    int ataqueMagico(){
        int dano;
        dano = energiaNecromantica + getForcaFisica() + espada.getForca();
        return dano;
    }
    
}