public class MyClass {
  public static void main(String args[]) {
      
    Pessoa ze = new Pessoa ("Zé");
    
    ze.setIdade(58);
    ze.setSexo("Masculino");
    ze.setAltura(1.9);
    ze.setPeso(102.7);
    
    System.out.println(ze.getNome());
    System.out.println(ze.getIdade());
    System.out.println(ze.getSexo());
    System.out.println(ze.getAltura());
    System.out.println(ze.getPeso());
    
  }
}