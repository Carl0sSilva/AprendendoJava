public class ShipTerra extends ShipBase {
    
    private int forcaTerra;
    
    public ShipTerra(int forca){
        this.forcaTerra = forca;
    }
    
    public int getForcaTerra(){
        return forcaTerra;
    }
    
    @Override
    int calcularForca(){
        return getForcaBase() + getForcaTerra();
    }
}