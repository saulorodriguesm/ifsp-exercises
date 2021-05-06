package exer03lista05;
public class Moto extends Veiculo{
    public Moto(String Placa){
        super(Placa);
    }
    
    public void imprime(){
        System.out.println("Moto de Placa: " + this.Placa);
    }
}
