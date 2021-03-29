package exer03lista04;

public class Exer03Lista04 {

    public static void main(String[] args) {
        OperacoesMatematicas om = new OperacoesMatematicas();
        int[] vet = {1, 2, 3, 4};
        om.somar(vet);
        om.multiplicar(vet);
        om.dividir(-10, 5);
    }
    
}
