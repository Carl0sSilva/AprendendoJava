public class PedraAr extends PedraElemental {
    
    private int poderAr = 15;
    
    public int getPoderAr(){
        return poderAr;
    }
    
    public void setPoderAr(int n){
        this.poderAr = n;
    }
    
    public int extrairPoderTotalPedraAr(){
        int poder;
        poder = getNucleo() + poderAr;
        return poder;
    }
}