package composicao;
public class Porta {
    
    private String qtde_portas;

    public String getQtde_portas() {
        return qtde_portas;
    }

    public void setQtde_portas(String qtde_portas) {
        this.qtde_portas = qtde_portas;
    }
    
    public String imprimirDados(){
        return "\n- Portas - \nQuantidade de portas: " + qtde_portas + "\n";  
    }
}
