package exer02lista05;
public class Professor extends Pessoa {
    public Professor(String Nome, int Idade){
        super(Nome, Idade);
    }
    
    public void quemSou(){
        System.out.println("Sou o Professor " + this.Nome + " com idade " + this.Idade);
    }
}
