public class MyClass {
  public static void main(String args[]) {
    
    PedraElemental pf = new PedraFogo();
    PedraElemental pa = new PedraAgua();
    PedraElemental pt = new PedraTerra();
    PedraElemental par = new PedraAr();
    CajadoCaos c = new CajadoCaos();
    
    System.out.println(c.extrairPoderFogo(pf));
    System.out.println(c.extrairPoderAgua(pa));
    System.out.println(c.extrairPoderTerra(pt));
    System.out.println(c.extrairPoderAr(par));
    
  }
}