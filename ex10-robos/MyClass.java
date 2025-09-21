public class MyClass {
  public static void main(String args[]) {
    
    ShipBase shipA = new ShipAgua(11);
    ShipBase shipT = new ShipTerra(12);
    ShipBase shipR = new ShipRaio(13);
    
    CanhaoBase canhaoAA = new CanhaoAndromeda(16);
    CanhaoBase canhaoAT = new CanhaoAndromeda(16);
    CanhaoBase canhaoCR = new CanhaoColera(15);
    
    Basetron dentiAA = new Dentitron(19);
    Basetron dentiAT = new Dentitron(19);
    Basetron musaCR = new Musatron(20);
    
    shipA.setForcaBase(10);
    shipT.setForcaBase(10);
    shipR.setForcaBase(10);
    
    canhaoAA.setForcaCanhao(10);
    canhaoAT.setForcaCanhao(10);
    canhaoCR.setForcaCanhao(10);
    
    dentiAA.setForcaInterior(20);
    dentiAT.setForcaInterior(20);
    musaCR.setForcaInterior(20);
    
    canhaoAA.setShipBase(shipA);
    canhaoAT.setShipBase(shipT);
    canhaoCR.setShipBase(shipR);
    
    dentiAA.setCanhaoBase(canhaoAA);
    dentiAT.setCanhaoBase(canhaoAT);
    musaCR.setCanhaoBase(canhaoCR);
    
    System.out.println(dentiAA.ataqueTotal());
    System.out.println(dentiAT.ataqueTotal());
    System.out.println(musaCR.ataqueTotal());
  }
}