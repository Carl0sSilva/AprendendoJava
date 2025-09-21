public class MyClass {
  public static void main(String args[]) {
      Carro carro1 = new Carro();
      Carro carro2 = new Carro();
      Carro meuCarro = new Carro();
      
      carro1.ano = 1980;
      carro1.marca = "VW";
      carro1.modelo = "Fusca";
      carro1.cor = "Azul";
      
      carro2.ano = 2000;
      carro2.marca = "Ford";
      carro2.modelo = "Fiesta";
      carro2.cor = "Vermelho";
      
      meuCarro.ano = 2006;
      meuCarro.marca = "Chevrolet";
      meuCarro.modelo = "Corvette C6";
      meuCarro.cor = "Vermelho";
      
      carro1.exibirModelo();
      carro1.exibirAnoECor();
      
      carro2.exibirModelo();
      carro2.exibirAnoECor();
      
      meuCarro.exibirModelo();
      meuCarro.exibirAnoECor();
  }
}