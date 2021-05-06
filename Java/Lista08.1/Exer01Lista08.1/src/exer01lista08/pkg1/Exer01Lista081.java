/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista08.pkg1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class Exer01Lista081 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, Usuario> Cadastro = new Hashtable<>();
        int opcao, i = 0;

        do{
            System.out.println("");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Verificar se usuário já está cadastrado pelo RA");
            System.out.println("3 - Retornar dados do usuário");
            System.out.println("4 - Listar os dados principais do usuário");
            System.out.println("5 - Pesquisar usuários pelo nome");
            System.out.println("6 - Remover usuário");
            System.out.println("7 - Mostrar o total de usuários cadastrados");
            System.out.println("8 - SAIR");
            System.out.println("");
            opcao = Integer.parseInt(sc.nextLine());
            switch(opcao){
                case 1:
                    Usuario u = new Usuario();
                    System.out.println("Digite o nome");    
                    u.setNome(sc.nextLine());
                    System.out.println("Digite o RA");
                    u.setRA(Integer.parseInt(sc.nextLine()));
                    System.out.println("Digite o endereço");
                    u.setEndereco(sc.nextLine());
                    System.out.println("Digite o e-mail");
                    u.setEmail(sc.nextLine());
                    i++;
                    Cadastro.put(i, u);
                    break;
                case 2:
                    int pesquisaRA;
                    System.out.println("Digite o RA");    
                    pesquisaRA = Integer.parseInt(sc.nextLine());
                    for(int j = 1; j <= Cadastro.size(); j++) {
                        if(Cadastro.get(j).getRA() == pesquisaRA){
                            System.out.println("Usuário já cadastrado");
                        } else {
                            System.out.println("Usuário não cadastrado");
                        }
                    }                        
                    break;   
                case 3:
                    int pesquisaKey;
                    System.out.println("Digite o número do usuário"); 
                    pesquisaKey = Integer.parseInt(sc.nextLine());
                    if(Cadastro.containsKey(pesquisaKey)){
                        System.out.println("Nome: " + Cadastro.get(pesquisaKey).getNome());
                        System.out.println("RA: " + Cadastro.get(pesquisaKey).getRA());
                        System.out.println("Endereço: " + Cadastro.get(pesquisaKey).getEndereco());
                        System.out.println("E-mail: " + Cadastro.get(pesquisaKey).getEmail());
                    }else{
                        System.out.println("Usuário não cadastrado");
                    }
                    break;
                case 4:
                    System.out.println(Cadastro.keySet());
                    break;
                case 5:
                    String pesquisaNome;
                    System.out.println("Digite o Nome");    
                    pesquisaNome = sc.nextLine();
                    for(int j = 1; j <= Cadastro.size(); j++) {
                        if(Cadastro.get(j).getNome().startsWith(pesquisaNome)){
                            System.out.println("Chave: " + j);
                            System.out.println("Nome: " + Cadastro.get(j).getNome());
                            System.out.println("RA: " + Cadastro.get(j).getRA());
                            System.out.println("Endereço: " + Cadastro.get(j).getEndereco());
                            System.out.println("E-mail: " + Cadastro.get(j).getEmail());
                            System.out.println("");
                        }
                    }                        
                    break;
                case 6:
                    int excluiKey;
                    System.out.println("Digite o número do usuário"); 
                    excluiKey = Integer.parseInt(sc.nextLine());
                    Cadastro.remove(excluiKey);
                    break;
                case 7:
                    System.out.println("Quantidade de usuários cadastrados: " + Cadastro.size());
                    break;
                default:
                    System.out.println("Digite apenas números pertencentes ao menu");
                    break;
            }
        }while(opcao != 8);
    }
    
}
