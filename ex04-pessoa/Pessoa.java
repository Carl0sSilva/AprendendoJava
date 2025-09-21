public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    private double altura;
    private double peso;
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
}