public class Pessoa{
    String nome;
    Dog pet;
    public void dizerNome(){
        System.out.println("Olá, me chamo "+this.nome);
    }
    
    public void dizerNomeDog(){
        System.out.println("O nome do meu Dog é "+this.pet.nome);
        this.pet.latir();
    }
}