/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer04lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class Exer04Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#0.00");      
        int quantCigarro, anos;
        double valorGasto;
        System.out.println("Quantos cigarros você fuma em média por ano?");
        quantCigarro = Integer.parseInt(sc.nextLine());
        System.out.println("Há quantos anos você fuma?");
        anos = Integer.parseInt(sc.nextLine());
        valorGasto = anos * quantCigarro * 10.2;
        System.out.println("-------------------------");    
        System.out.println("Você já gastou com cigarro, aproximandamente R$ " + formato.format(valorGasto));    
    }
    
}
