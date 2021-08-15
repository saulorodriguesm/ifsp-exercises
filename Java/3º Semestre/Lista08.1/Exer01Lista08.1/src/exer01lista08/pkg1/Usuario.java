/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista08.pkg1;

/**
 *
 * @author GABRIEL
 */
public class Usuario {
    private int RA;
    private String Nome;
    private String Endereco;
    private String Email;
       
    public int getRA() { return RA; }

    public String getNome() { return Nome; }
    
    public String getEndereco() { return Endereco; }

    public String getEmail() { return Email; }

    public void setRA(int RA) { this.RA = RA; }

    public void setNome(String Nome) { this.Nome = Nome; }
    
    public void setEndereco(String Endereco) { this.Endereco = Endereco; }

    public void setEmail(String Email) { this.Email = Email; }
}
