public class CajadoCaos {
    
    private int poderCaos = 10;
    
    public int extrairPoderFogo(PedraElemental p){
        int poder = 0;
         if (p instanceof PedraFogo) {
            PedraFogo pfogo = (PedraFogo) p;
            poder = poderCaos + pfogo.extrairPoderTotalPedraFogo();
         }
         
         return poder;
    }
    
    public int extrairPoderAgua(PedraElemental p){
        int poder = 0;
        if (p instanceof PedraAgua) {
            PedraAgua pagua = (PedraAgua) p;
            poder = poderCaos + pagua.extrairPoderTotalPedraAgua();
         }
         
         return poder;
    }
    
    public int extrairPoderTerra(PedraElemental p){
        int poder = 0;
        if (p instanceof PedraTerra) {
            PedraTerra pterra = (PedraTerra) p;
            poder = poderCaos + pterra.extrairPoderTotalPedraTerra();
         }
         
         return poder;
    }
    
    public int extrairPoderAr(PedraElemental p){
        int poder = 0;
        if (p instanceof PedraAr) {
            PedraAr par = (PedraAr) p;
            poder =  poderCaos + par.extrairPoderTotalPedraAr();
         }
         
         return poder;
    }
}