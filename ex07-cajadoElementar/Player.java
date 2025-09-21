public class Player {
    
    String nucleo1;
    String nucleo2;
    String nucleo3;
    private Cajado cajado;
    private Anel anel;
    private int ataque = 10;
    private int defesa = 10;
    private Elemento mento1;
    private Elemento mento2;
    
    public Player() {
        this.cajado = new Cajado();
        this.anel = new Anel();
    }
    
    //Definindo os elementos
    public void defineElemento(String n1, String n2){
        if(n1 == ("FOGO")){
            this.mento1 = new Fogo();
        } else if (n1 == ("AGUA")){
            this.mento1 = new Agua();
        } else if (n1 == ("AR")){
            this.mento1 = new Ar();
        } else {
            this.mento1 = new Terra();
        }
        
        if(n2 == ("FOGO")){
            this.mento2 = new Fogo();
        } else if (n2 == ("AGUA")){
            this.mento2 = new Agua();
        } else if (n2 == ("AR")){
            this.mento2 = new Ar();
        } else {
            this.mento2 = new Terra();
        }
        
        this.nucleo1 = n1;
        this.nucleo2 = n2;
    }
    
    public int getPoderCajado() {
        return cajado.getPoderCajado();
    }
    
    public int getPoderAnel() {
        return anel.getPoderAnel();
    }
    
    public int getForca() {
        return (mento1.getForca() + mento2.getForca())/2;
    }
    
    public String getNucleo(){
        if (nucleo1 == ("FOGO") && nucleo2 == ("AR")|| nucleo1 == ("AR") && nucleo2 == ("FOGO")){
            nucleo3 = "COMBUSTAO";
        } else if (nucleo1 == ("FOGO") && nucleo2 == ("TERRA")|| nucleo1 == ("TERRA") && nucleo2 == ("FOGO")){
            nucleo3 = "LAVA";
        } else if (nucleo1 == ("AGUA") && nucleo2 == ("TERRA")|| nucleo1 == ("TERRA") && nucleo2 == ("AGUA")){
            nucleo3 = "PLANTA";
        } else if (nucleo1 == ("AGUA") && nucleo2 == ("AR")|| nucleo1 == ("AR") && nucleo2 == ("AGUA")){
            nucleo3 = "NEVE";
        } else {
            nucleo3 = nucleo1;
        }
        
        return nucleo3;
    }
    
    public int atacar(){
        int dano;
        dano = ataque + getPoderCajado() + getForca();
        return dano;
    }
    
    public int defender(){
        int resistencia;
        resistencia = defesa + getPoderAnel() + getForca();
        return resistencia;
    }
    
}