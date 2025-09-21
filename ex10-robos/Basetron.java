abstract class Basetron {
    
    private int forcaInterior;
    public CanhaoBase canhao;
    
    public int getForcaInterior(){
        return forcaInterior;
    }
    
    public void setForcaInterior(int forca){
        this.forcaInterior = forca;
    }
    
    public void setCanhaoBase(CanhaoBase canhao){
        this.canhao = canhao;
    }
    
    abstract int ataqueTotal();
}