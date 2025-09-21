public class MyClass {
  public static void main(String args[]) {
  
  Espada esp = new Espada();
  esp.setNome("Scalibur");
  
  Espada esp1 = new Espada();
  esp1.setNome("Ema");
  
  Guerreiro aisen = new MagicoLunar ("Aisen", esp, 10);
  Guerreiro himmel = new MagicoNecromantico ("Himmel", esp1, 8);
  
  
  
  
  System.out.println(esp.getNome());
  System.out.println(aisen.getNome());
  System.out.println(himmel.getNome());
  System.out.println(himmel.ataqueFisico());
  System.out.println(himmel.ataqueMagico());
  System.out.println(aisen.ataqueFisico());
  System.out.println(aisen.ataqueMagico());
  
  }
}