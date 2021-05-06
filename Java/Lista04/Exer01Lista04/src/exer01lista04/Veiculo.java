package exer01lista04;

public class Veiculo {
    private String modelo;
    private String fabricante;
    private int ano;
    private int nPortas;
    private int nRodas;
    private String cor;
    private int nMarchas;
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getFabricante() {
        return this.fabricante;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }
    
    public int getnPortas() {
        return this.nPortas;
    }
    
    public void setnRodas(int nRodas) {
        this.nRodas = nRodas;
    }
    
    public int getnRodas() {
        return this.nRodas;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setnMarchas(int nMarchas) {
        this.nMarchas = nMarchas;
    }
    
    public int getnMarchas() {
        return this.nMarchas;
    }
    
    public void mostraVeiculo(){
        System.out.println("Ano do Veículo: " + getAno());   
        System.out.println("Cor do Veículo: " + getCor());   
        System.out.println("Fabricante do Veículo: " + getFabricante());   
        System.out.println("Modelo do Veículo: " + getModelo());   
        System.out.println("Nº Marchas do Veículo: " + getnMarchas());   
        System.out.println("Nº Portas do Veículo: " + getnPortas());   
        System.out.println("Nº Rodas do Veículo: " + getnRodas());   
    }
}
