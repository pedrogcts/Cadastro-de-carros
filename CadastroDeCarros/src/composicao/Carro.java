package composicao;

import java.util.Scanner;

public class Carro {

    private String modelo;
    private String marca;  
    private String placa;
    private String velocidade;
    private int ano;
    private int qtdeLugares;
    private int peso;
    
    private Motor motor;
    private Bateria bateria;
    private Porta portas;
    private Pneu pneu;
    
    public Carro(){
        
        this.motor = new Motor();
        this.bateria = new Bateria();
        this.portas = new Porta();
        this.pneu = new Pneu();
    }
    
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Porta getPortas() {
        return portas;
    }

    public void setPortas(Porta portas) {
        this.portas = portas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtdeLugares() {
        return qtdeLugares;
    }

    public void setQtdeLugares(int qtdeLugares) {
        this.qtdeLugares = qtdeLugares;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public Pneu getPneu() {
        return pneu;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }
    
    public String imprimirDados(){
        return "\n- Carro - \nModelo: " + modelo + "\nMarca: " + marca + "\nPlaca: " + placa + "\nVelocidade final: " + velocidade + 
                "\nAno de Fabricação: " + ano + "\nQuantidade de Lugares: " + qtdeLugares + "\nPeso: " + peso + "\n" 
                + motor.imprimirDados() + "\n" + bateria.imprimirDados() + "\n" + portas.imprimirDados() + "\n" + pneu.imprimirDados();
        
    }
}
