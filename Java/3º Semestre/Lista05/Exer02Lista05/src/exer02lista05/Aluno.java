package exer02lista05;

public class Aluno extends Pessoa {
    public Aluno(String Nome, int Idade){
        super(Nome, Idade);
    }
    
    public void quemSou(){
        System.out.println("Sou o Aluno " + this.Nome + " com idade " + this.Idade);
    }
}
