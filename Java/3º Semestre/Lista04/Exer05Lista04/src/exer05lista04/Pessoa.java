/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer05lista04;

/**
 *
 * @author GABRIEL
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private String dataNasc;
    public static int totalDePessoas = 0;

    public Pessoa() {
        totalDePessoas++;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public String getDataNasc() {
        return this.dataNasc;
    }
    
    public void mostraPessoa(){
        System.out.println("Nome da Pessoa: " + getNome());   
        System.out.println("Data de Nascimentoda Pessoa: " + getDataNasc());   
        System.out.println("CPF da Pessoa: " + getCpf());   
    }
}
