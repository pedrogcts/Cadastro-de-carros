package composicao;
public class Motor {
    
    private String modelo;
    private String potencia;
    private String fabricante;
    private String qtde_cilindros;
    private String volume;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getQtde_cilindros() {
        return qtde_cilindros;
    }

    public void setQtde_cilindros(String qtde_cilindros) {
        this.qtde_cilindros = qtde_cilindros;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
    
    public String imprimirDados(){
        return "\n- Motor - \nModelo: " + modelo + "\nPotência: " + potencia + "\nFabricante: " + fabricante + 
                "\nQuantidade de Cilindros: " + qtde_cilindros + "\nVolume(litragem): " + volume + "\n";
        
    }
    
}
