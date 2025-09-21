public class Calculadora{

    public void soma(int n1,int n2){
        System.out.printf ("A realização da soma de %d e %d é igual a %d\n", n1, n2, (n1+n2));
    }
    
    public void subtracao(int n1,int n2){
        System.out.printf ("\nA realização da subtração de %d e %d é igual a %d\n", n1, n2, (n1-n2));
    }
    
    public void multiplicacao(int n1,int n2){
        System.out.printf ("\nA realização da multiplicação de %d e %d é igual a %d\n", n1, n2, (n1*n2));
    }
    
    public void divisao(int n1,int n2){
        System.out.printf ("\nA realização da divisão de %d e %d é igual a %d\n", n1, n2, (n1/n2));
    }

}
