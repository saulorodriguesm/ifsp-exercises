package exer05lista03;

import java.util.Random;
import java.util.Scanner;

public class Exer05Lista03 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[20][20];
        int i, j, opcao;
        
        for(i = 0; i < 20; i++){
            for(j = 0; j < 20; j++){
                mat[i][j] = rand.nextInt(9);
            }
        }
        do{
            System.out.println("1- Matriz completa");
            System.out.println("2- Triângulo superior a partir da esquerda");
            System.out.println("3- Triângulo superior a partir da direita");
            System.out.println("4- Triângulo inferior a partir da esquerda");
            System.out.println("5- Triângulo inferior a partir da direita");
            System.out.println("6- SAIR");
            opcao = Integer.parseInt(sc.nextLine());

            switch(opcao){
                case 1:
                    for(i = 0; i < 20; i++){
                        for(j = 0; j < 20; j++){
                            System.out.print(mat[i][j]);
                        }
                        System.out.println("");
                    } 
                    System.out.println("");
                    break;
                case 2:
                    for(i = 0; i < 20; i++){
                        for(j = 0; j < 20; j++){
                            if((i + j) < 20){
                                System.out.print(mat[i][j]);
                            }
                        }
                        System.out.println("");
                    } 
                    System.out.println("");
                    break;
                case 3:
                    for(i = 0; i < 20; i++){
                        for(j = 0; j < 20; j++){
                            if(i <= j){
                                System.out.print(mat[i][j]);
                            }else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    } 
                    System.out.println("");
                    break;              
                case 4:
                    for(i = 0; i < 20; i++){
                        for(j = 0; j < 20; j++){
                            if(i >= j){
                                System.out.print(mat[i][j]);
                            }
                        }
                        System.out.println("");
                    } 
                    System.out.println("");
                    break;              
                case 5:
                    for(i = 0; i < 20; i++){
                        for(j = 0; j < 20; j++){
                            if((i + j) >= 19){
                                System.out.print(mat[i][j]);
                            }else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    } 
                    System.out.println("");
                    break;   
                default:
                    System.out.println("Digite apenas números pertencentes ao menu");
                    break;
            }
                   
        }while(opcao != 6);
        
    }
    
}
