package exer02lista03;

import java.util.Scanner;

public class Exer02Lista03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] aux = new int[25];
        int i, j;
        int k = 1;
        boolean passou = false;
        
        for(i = 0; i < 5; i++){
            System.out.println("Digite valor " + (i + 1)+ " para o vetor 1");
            v1[i] = Integer.parseInt(sc.nextLine());
            System.out.println("Digite valor " + (i + 1)+ " para o vetor 2");
            v2[i] = Integer.parseInt(sc.nextLine());
        }
        
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                if(v1[i] == v2[j] && aux[k - 1] != v1[i]){
                    if(k == 1 && !passou){
                        k--;
                        passou = true;
                    }
                    if(v1[i] < 0){
                        v1[i] *= -1;
                    }
                    aux[k] = v1[i];                       
                    k++;
                }
            }
        }
        for(i = 0; i < k; i++){
            System.out.println(aux[i]);
        }
    }
    
}
