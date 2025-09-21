public class MyClass {
  public static void main(String args[]) {
      
      Player p1 = new Player();
      Player p2 = new Player();
      Player p3 = new Player();
      Player p4 = new Player();
      Player p5 = new Player();
      Player p6 = new Player();
      Player p7 = new Player();
      Player p8 = new Player();
      Duelo duelo = new Duelo();
      
      p1.defineElemento("AGUA", "AGUA");
      p2.defineElemento("FOGO", "FOGO");
      p3.defineElemento("AR", "AR");
      p4.defineElemento("TERRA", "TERRA");
      p5.defineElemento("TERRA", "FOGO");
      p6.defineElemento("TERRA", "AGUA");
      p7.defineElemento("AR", "AGUA");
      p8.defineElemento("AR", "FOGO");
      
      
      //Água x Água
      duelo.iniciarDuelo(p1, p1);
      //Água x Fogo
      duelo.iniciarDuelo(p1, p2);
      //Água x Ar
      duelo.iniciarDuelo(p1, p3);
      //Água x Terra
      duelo.iniciarDuelo(p1, p4);
      //Fogo x Água
      duelo.iniciarDuelo(p2, p1);
      //Fogo x Fogo
      duelo.iniciarDuelo(p2, p2);
      //Fogo x Ar
      duelo.iniciarDuelo(p2, p3);
      //Fogo x Terra
      duelo.iniciarDuelo(p2, p4);
      //Ar x Água
      duelo.iniciarDuelo(p3, p1);
      //Ar x Fogo
      duelo.iniciarDuelo(p3, p2);
      //Ar x Ar
      duelo.iniciarDuelo(p3, p3);
      //Ar x Terra
      duelo.iniciarDuelo(p3, p4);
      //Terra x Água
      duelo.iniciarDuelo(p4, p1);
      //Terra x Fogo
      duelo.iniciarDuelo(p4, p2);
      //Terra x Ar
      duelo.iniciarDuelo(p4, p3);
      //Terra x Terra
      duelo.iniciarDuelo(p4, p4);
      //Lava x Planta
      duelo.iniciarDuelo(p5, p6);
      //Neve x Combustão
      duelo.iniciarDuelo(p7, p8);
      //Agua x Neve
      duelo.iniciarDuelo(p1, p7);
      //Planta x Terra
      duelo.iniciarDuelo(p6, p4);
    


  }
}