package exer02lista05;
public class TecnicoAdministrativo extends Pessoa {
    public TecnicoAdministrativo(String Nome, int Idade){
        super(Nome, Idade);
    }
    
    public void quemSou(){
        System.out.println("Sou o Técnico Administrativo " + this.Nome + " com idade " + this.Idade);
    }
}
