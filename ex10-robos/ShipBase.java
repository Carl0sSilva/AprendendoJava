abstract class ShipBase {
    
    private int forcaBase;
    
    public int getForcaBase(){
        return forcaBase;
    }
    
    public void setForcaBase(int forca){
        this.forcaBase = forca;
    }
    
    abstract int calcularForca();
}