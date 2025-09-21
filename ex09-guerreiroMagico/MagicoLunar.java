public class MagicoLunar extends Guerreiro {
    
    private int energiaLunar = 10;
    private Espada espada;
    
    public MagicoLunar (String nome, Espada espada, int forca){
        this.espada = espada;
        super.setNome(nome);
        super.setForcaFisica(forca);
    }
    
    @Override
    int ataqueMagico(){
        int dano;
        dano = energiaLunar + getForcaFisica() + espada.getForca();
        return dano;
    }
    
}