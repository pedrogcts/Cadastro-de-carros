package composicao;
public class Bateria {
    
    private String modelo;
    private String carga;
    private String fabricante;
    private String ano_fabricacao; 

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(String ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }
    
    public String imprimirDados(){
        return "\n- Bateria - \nModelo: " + modelo + "\nCarga: " + carga + "\nFabricante: " + fabricante + 
                "\nAno de Fabricação: " + ano_fabricacao + "\n";
        
    }
}
