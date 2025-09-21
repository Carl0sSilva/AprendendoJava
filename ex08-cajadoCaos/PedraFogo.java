public class PedraFogo extends PedraElemental {
    
    private int poderFogo = 10;
    
    public int getPoderFogo(){
        return poderFogo;
    }
    
    public void setPoderFogo(int n){
        this.poderFogo = n;
    }
    
    public int extrairPoderTotalPedraFogo(){
        int poder;
        poder = getNucleo() + poderFogo;
        return poder;
    }
}