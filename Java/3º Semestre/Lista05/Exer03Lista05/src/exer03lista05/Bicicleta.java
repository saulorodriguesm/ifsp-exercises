package exer02lista05;
public class Bicicleta extends Veiculo{
    public Bicicleta(String Placa){
        super(Placa);
    }
    
    public void imprime(){
        System.out.println("Bicicleta de Placa: " + this.Placa);
    }
}
