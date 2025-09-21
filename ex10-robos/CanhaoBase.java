abstract class CanhaoBase {
    
    private int forcaCanhao;
    public ShipBase ship;
    
    public int getForcaCanhao(){
        return forcaCanhao;
    }
    
    public void setForcaCanhao(int forca){
        this.forcaCanhao = forca;
    }
    
    public void setShipBase(ShipBase ship){
        this.ship = ship;
    }
    
    abstract int calcularForcaCanhao();
}