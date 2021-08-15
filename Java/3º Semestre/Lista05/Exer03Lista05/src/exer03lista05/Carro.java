package exer02lista05;
public class Carro extends Veiculo{
    public Carro(String Placa){
        super(Placa);
    }
    
    public void imprime(){
        System.out.println("Carro de Placa: " + this.Placa);
    }
}
