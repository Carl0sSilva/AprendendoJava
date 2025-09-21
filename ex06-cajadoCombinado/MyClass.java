public class MyClass {
  public static void main(String args[]) {
      
      Elemento pfogo1 = new Fogo();
      Elemento pfogo2 = new Fogo();
      
      Elemento pagua1 = new Agua();
      Elemento pagua2 = new Agua();
      
      Elemento pterra1 = new Terra();
      Elemento pterra2 = new Terra();
      
      Elemento par1 = new Ar();
      Elemento par2 = new Ar();
      
      Cajado cajado = new Cajado();
      
      cajado.executarPoderElemental(pfogo1, pfogo2);
      cajado.executarPoderElemental(par1, pfogo2);
      cajado.executarPoderElemental(pfogo1, par2);
      cajado.executarPoderElemental(pfogo1, pterra2);
      cajado.executarPoderElemental(pterra1, pfogo2);
      cajado.executarPoderElemental(pterra1, pagua2);
      cajado.executarPoderElemental(pagua1, pterra2);
      cajado.executarPoderElemental(pagua1, par2);
      cajado.executarPoderElemental(par1, pagua2);
      cajado.executarPoderElemental(par1, pterra2);



  }
}