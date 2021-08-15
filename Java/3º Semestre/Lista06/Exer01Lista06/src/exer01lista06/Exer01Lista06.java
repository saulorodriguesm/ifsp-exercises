/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author GABRIEL
 */
public class Exer01Lista06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Container c1 = new Container();
        c1.nome = "Pena";
        c1.peso = 27.5;
        Container c2 = new Container();
        c2.nome = "Leve";
        c2.peso = 32.3;
        Container c3 = new Container();
        c3.nome = "Médio";
        c3.peso = 41.2;
        Container c4 = new Container();
        c4.nome = "Pesado";
        c4.peso = 55;
        
        Queue<Container> porto = new LinkedList<>();
        
        porto.offer(c1);
        porto.forEach((q) -> {
            System.out.print(q.nome);
        });
        System.out.println("");
        
        porto.offer(c2);
        porto.forEach((q) -> {
            System.out.print(q.nome + " ");
        });
        System.out.println("");
        
        porto.offer(c3);
        porto.forEach((q) -> {
            System.out.print(q.nome + " ");
        });
        System.out.println("");
        
        porto.offer(c4);
        porto.forEach((q) -> {
            System.out.print(q.nome + " ");
        });        
        System.out.println("");

        Stack<Container> navioCargueiro = new Stack<>();
        
        porto.forEach((q) -> {
            navioCargueiro.push(q);
        });
        porto.clear();
        
        navioCargueiro.forEach((q) -> {
            System.out.println(q.nome);
        });         
    }
    
}
