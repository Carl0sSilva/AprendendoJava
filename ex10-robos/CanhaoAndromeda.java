public class CanhaoAndromeda extends CanhaoBase {
    
    private int poderAndromeda;
    
    public CanhaoAndromeda(int poder){
        this.poderAndromeda = poder;
    }
    
     public int getPoderAndromeda(){
        return poderAndromeda;
    }
    
    @Override
    int calcularForcaCanhao(){
        return getPoderAndromeda() + getForcaCanhao() + ship.calcularForca();
    }
}