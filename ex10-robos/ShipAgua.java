public class ShipAgua extends ShipBase {
    
    private int forcaAgua;
    
    public ShipAgua(int forca){
        this.forcaAgua = forca;
    }
    
    public int getForcaAgua(){
        return forcaAgua;
    }
    
    @Override
    int calcularForca(){
        return getForcaBase() + getForcaAgua();
    }
}