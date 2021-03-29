package exer04lista03;

import java.util.Scanner;

public class Exer04Lista03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][2];
        int i, j;
        
        for(i = 0; i < 4; i++){
            for(j = 0; j < 2;j++){
                System.out.println("Digite da linha " + (i + 1)+ " e coluna " + (j + 1) + " da matriz");
                mat[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for(i = 0; i < 2; i++){
            for(j = 0; j < 4;j++){
                System.out.print(mat[j][i]);
            }
            System.out.println("");
        }
    }
    
}
