/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02lista01;


/**
 *
 * @author SAULO
 */
public class FilaPessoal {   
    int i = 0;
    Node tail;
 
    public void adicionar(int x)
    {
        Node temp = new Node();
        
        temp.ultimoValor = x;
        temp.primeiroValor = tail;
        tail = temp;
    }
    
    public void remover()
    {
        if (isVazia()) {
            System.out.println("Fila já está vazia");
            return;
        }
        
        tail = (tail).primeiroValor;
    }  
    
    public void buscaValores(int x)
    {        
        if (!isVazia()){           
            Node temp = tail;
            i = 0;
            while (temp != null) {
                if (temp.ultimoValor == x) {
                    System.out.println(i);
                }
                temp = temp.primeiroValor;
                i++;
            }
        } else {
            System.out.println("-1");
        }
    }
    
    public void imprimeQuantidade() 
    {
        if (!isVazia()){           
            Node temp = tail;
            i = 0;
            while (temp != null) {
                i++;
                temp = temp.primeiroValor;
            }            
            System.out.println("Quantidade: " + i);
        } else {
            System.out.println("-1");
        }
    }
 
    public boolean isVazia()
    {
        return tail == null;
    }
 
  
    public void todosValores()
    {        
        if (!isVazia()){           
            Node temp = tail;
            i = 0;
            while (temp != null) {
                System.out.println(temp.ultimoValor + " posição " + i);
                temp = temp.primeiroValor;
                i++;
            }
        } else {
            System.out.println("Pilha Vazia");
        }
    }
}

