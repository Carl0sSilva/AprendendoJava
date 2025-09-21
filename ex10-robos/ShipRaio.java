public class ShipRaio extends ShipBase {
    
    private int forcaRaio;
    
    public ShipRaio(int forca){
        this.forcaRaio = forca;
    }
    
    public int getForcaRaio(){
        return forcaRaio;
    }
    
    @Override
    int calcularForca(){
        return getForcaBase() + getForcaRaio();
    }
}