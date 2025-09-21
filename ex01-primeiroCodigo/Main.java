public class Main {
  public static void main(String args[]) {
    int idade = 18;
    int i = 0;
    String nome = "Carlos";
    
    int n = Integer.parseInt(args[0]);
    
    while(i<=n){
        System.out.printf("%d\n", i);
        i++;
    }
    

    System.out.printf("\nOlá, meu nome é %s e minha idade é %d\n", nome, idade);
    System.out.println("\n======Fim processamento======");
  }
}