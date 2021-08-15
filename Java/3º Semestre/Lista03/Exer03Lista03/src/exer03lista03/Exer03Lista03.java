package exer03lista03;

import java.util.Scanner;

public class Exer03Lista03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];
        int[][] soma = new int[2][2];
        int i, j;
        
        for(i = 0; i < 2; i++){
            for(j = 0; j < 2;j++){
                System.out.println("Digite da linha " + (i + 1)+ " e coluna " + (j + 1) + " da matriz 1");
                mat1[i][j] = Integer.parseInt(sc.nextLine());
                System.out.println("Digite da linha " + (i + 1)+ " e coluna " + (j + 1) + " da matriz 2");
                mat2[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        
        for(i = 0; i < 2; i++){
            for(j = 0; j < 2;j++){
                soma[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
        for(i = 0; i < 2; i++){
            for(j = 0; j < 2;j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        for(i = 0; i < 2; i++){
            for(j = 0; j < 2;j++){
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        for(i = 0; i < 2; i++){
            for(j = 0; j < 2;j++){
                System.out.print(soma[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
