public class Cajado {
    
    public void executarPoderElemental(Elemento p1, Elemento p2){
        
        if (p1.getElemento() == p2.getElemento()){
            System.out.println ("\nPoder de "+ p1.getElemento() +" executado");
            
        } else if ((p1.getElemento() == ("FOGO") && p2.getElemento() == ("AR"))||(p1.getElemento() == ("AR") && p2.getElemento() == ("FOGO"))){
            System.out.println ("\nPoder de COMBUSTÃO executado");
        }  else if ((p1.getElemento() == ("FOGO") && p2.getElemento() == ("TERRA"))||(p1.getElemento() == ("TERRA") && p2.getElemento() == ("FOGO"))){
            System.out.println ("\nPoder de LAVA executado");
        } else if ((p1.getElemento() == ("AGUA") && p2.getElemento() == ("TERRA"))||(p1.getElemento() == ("TERRA") && p2.getElemento() == ("AGUA"))){
            System.out.println ("\nPoder de PLANTA executado");
        } else if ((p1.getElemento() == ("AGUA") && p2.getElemento() == ("AR"))||(p1.getElemento() == ("AR") && p2.getElemento() == ("AGUA"))){
            System.out.println ("\nPoder de NEVE executado");
        } else {
            System.out.println ("\nCombinação inválida");
        }
        
    }
    
}