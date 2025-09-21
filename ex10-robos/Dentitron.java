public class Dentitron extends Basetron {
    
    private int poderDenti;
    
    public Dentitron(int poder){
        this.poderDenti = poder;
    }
    
    public int getPoderDenti(){
        return poderDenti;
    }
    
    @Override
    int ataqueTotal(){
        return getPoderDenti() + getForcaInterior() + canhao.calcularForcaCanhao();
    }
}