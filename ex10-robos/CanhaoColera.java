public class CanhaoColera extends CanhaoBase {
    
    private int poderColera;
    
    public CanhaoColera(int poder){
        this.poderColera = poder;
    }
    
     public int getPoderColera(){
        return poderColera;
    }
    
    @Override
    int calcularForcaCanhao(){
        return getPoderColera() + getForcaCanhao() + ship.calcularForca();
    }
}