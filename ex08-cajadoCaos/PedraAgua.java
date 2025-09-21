public class PedraAgua extends PedraElemental {
    
    private int poderAgua = 11;
    
    public int getPoderAgua(){
        return poderAgua;
    }
    
    public void setPoderAgua(int n){
        this.poderAgua = n;
    }
    
    public int extrairPoderTotalPedraAgua(){
        int poder;
        poder = getNucleo() + poderAgua;
        return poder;
    }
}