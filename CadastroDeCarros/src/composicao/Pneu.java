package composicao;

public class Pneu {

private String fabricante;
private String modelo;
private String tamanho;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String imprimirDados(){
        return "\n- Pneu - \nFabricante: " + fabricante + "\nModelo: " + modelo + "\nTamanho: " + tamanho + "\n";
        
    }
}
