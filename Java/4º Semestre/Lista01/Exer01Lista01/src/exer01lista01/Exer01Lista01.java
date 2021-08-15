package exer01lista01;

import java.util.Scanner;

public class Exer01Lista01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetorDeInt[] = new int[10];        
        int vetorDeIntB[] = new int[10];        
        int i = 0;
        int aux = 0;
        
        for(i = 0; i < 10; i++){
            System.out.println("Digite o " + (i + 1) + " número");
            vetorDeInt[i] = Integer.parseInt(sc.nextLine());
        }
        
        for(i = 9; i >= 0; i--){
            vetorDeIntB[i] = vetorDeInt[aux];
            aux++;
        }
        
        System.out.println("A  B");
        for(i = 0; i < 10; i++){
            System.out.println(vetorDeInt[i] + "  " + vetorDeIntB[i]);
        }
    }
    
}
