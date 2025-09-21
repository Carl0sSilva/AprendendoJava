abstract class Guerreiro {
    
    private int forcaFisica;
    private String nome;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getForcaFisica(){
        return forcaFisica;
    }
    
    public void setForcaFisica(int forca){
        this.forcaFisica = forca;
    }
    
    public int ataqueFisico(){
        return forcaFisica;
    }
    
    abstract int ataqueMagico();
    
}