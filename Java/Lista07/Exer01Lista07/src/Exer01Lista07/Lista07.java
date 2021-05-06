/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer01Lista07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class Lista07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> listaAluno = new ArrayList<>(); //Utilizei ArrayList por de já ter utilizado em trabalho anteriores
        //e por conter todos métodos que eu precisaria para essa lição.
        int opcao;
        
        do{
            System.out.println("1 - Adicionar aluno na lista");
            System.out.println("2 - Exibir lista de alunos");
            System.out.println("3 - Buscar aluno na lista pelo nome");
            System.out.println("4 - Ordenar lista pela média final");
            System.out.println("5 - Inverter lista");
            System.out.println("6 - SAIR");
            opcao = Integer.parseInt(sc.nextLine());
            switch(opcao){
                case 1:
                    Aluno a = new Aluno();
                    System.out.println("Digite o nome");    
                    a.Nome = sc.nextLine();
                    System.out.println("Digite o prontuário");
                    a.Prontuario = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite a média final");
                    a.MediaFinal = Double.parseDouble(sc.nextLine());
                    listaAluno.add(a);
                    break;
                case 2:
                    System.out.println("");
                    listaAluno.forEach((aluno) -> {
                        System.out.println("Nome: " + aluno.Nome + ", Prontuario: " + aluno.Prontuario + ", Média Final: " + aluno.MediaFinal);
                    });
                    System.out.println("");
                    break;
                case 3:
                    String busca;
                    System.out.println("Digite o nome para a busca");    
                    busca = sc.nextLine();
                    System.out.println("");
                    listaAluno.forEach((aluno) -> {
                        if(aluno.Nome.contains(busca)){
                            System.out.println("Nome: " + aluno.Nome + ", Prontuario: " + aluno.Prontuario + ", Média Final: " + aluno.MediaFinal);
                        }
                    });
                    System.out.println("");
                    break;
                case 4:
                    Collections.sort(listaAluno, new Comparator() {
                        public int compare(Object o1, Object o2) {

                            String n1 = ((Aluno) o1).Nome;
                            String n2 = ((Aluno) o2).Nome;
                            int nomeComp = n1.compareTo(n2);

                            if (nomeComp != 0) {
                               return nomeComp;
                            } 

                            double m1 = ((Aluno) o1).MediaFinal;
                            double m2 = ((Aluno) o2).MediaFinal;

                            if (m1 < m2) {
                                return -1;
                            }
                            if (m1 > m2) {
                                return 1;
                            }
                            return 0;                           
                    }});
                    break;
                case 5:
                    Collections.reverse(listaAluno);
                    break;
                default:
                    System.out.println("Digite apenas números pertencentes ao menu");
                    break;
            }
        }while(opcao != 6);
    }
    
}
