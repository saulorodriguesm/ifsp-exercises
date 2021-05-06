/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer07lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer07Lista02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double valor, parcela;
        int opcao;
        System.out.println("Digite o valor do produto: ");
        valor = Double.parseDouble(sc.nextLine());
        System.out.println("Escolha uma opção (1 = 'A vista', 2 = '2 vezes', 3 = '3 vezes'): ");
        opcao = Integer.parseInt(sc.nextLine());
        switch(opcao){
            case 1:
                valor = valor - (valor / 10);
                System.out.println("Valor do produto á vista: " + valor);
                break;
            case 2:
                valor = valor + (valor * 5 / 100);
                parcela = valor / 2;
                System.out.println("Valor do produto parcelado em 2 vezes: " + valor + ", o valor de cada parcela é " + df.format(parcela));
                break;
            case 3:
                valor = valor + (valor / 10);
                parcela = valor / 3;
                System.out.println("Valor do produto parcelado em 3 vezes: " + valor + ", o valor de cada parcela é " + df.format(parcela));
                break;
            default:
                System.out.println("Opção errada");
        }
    }
    
}
