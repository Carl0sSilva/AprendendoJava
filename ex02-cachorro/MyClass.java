public class MyClass {
  public static void main(String args[]) {
    System.out.println("Criando objetos!");
    
    Pessoa p1 = new Pessoa();
    p1.nome = "Romualdinho";
    
    Dog doguinho = new Dog();
    doguinho.nome = "Esnupi";
    doguinho.raca = "Beagle";
    
    p1.pet = doguinho;


    p1.dizerNome();
    p1.dizerNomeDog();
    //System.out.println("Sum of x+y = " + z);
  }
}