/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer03lista01;

import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class Exer03Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String produto;
        double valor, valorVista, valorParcela;
        System.out.println("Nome do Produto:");    
        produto = sc.nextLine();
        System.out.println("Valor do Produto:");    
        valor = Double.parseDouble(sc.nextLine());
        valorVista = valor - (valor * 0.1);
        valorParcela = (valor + (valor * 0.05))/3;
        System.out.println("-------------------------");    
        System.out.println("Nome do Produto: " + produto);    
        System.out.println("Valor à vista: " + valorVista);    
        System.out.println("Valor de cada uma das 3 parcelas: " + valorParcela);    
    }
    
}
