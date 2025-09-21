public class Musatron extends Basetron {
    
    private int poderMusa;
    
    public Musatron(int poder){
        this.poderMusa = poder;
    }
    
    public int getPoderMusa(){
        return poderMusa;
    }
    
    @Override
    int ataqueTotal(){
        return getPoderMusa() + getForcaInterior() + canhao.calcularForcaCanhao();
    }
}