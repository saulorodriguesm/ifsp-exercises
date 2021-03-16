/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer08lista02.pkg1;

import java.util.Scanner;

public class Exer08Lista021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano, i, quant = 0;
        System.out.println("Digite algo: ");
        ano = Integer.parseInt(sc.nextLine());
        for(i = ano; i <= 2020; i++){
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                quant++;
            }
        }
        System.out.println("Quantidade de anos bissextos: " + quant);
    }
    
}
