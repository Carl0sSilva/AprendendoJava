public class PedraTerra extends PedraElemental {
    
    private int poderTerra = 20;
    
    public int getPoderTerra(){
        return poderTerra;
    }
    
    public void setPoderTerra(int n){
        this.poderTerra = n;
    }
    
    public int extrairPoderTotalPedraTerra(){
        int poder;
        poder = getNucleo() + poderTerra;
        return poder;
    }
}