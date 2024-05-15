package composicao;

import java.util.Scanner;

public class Principal_Composicao {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner tc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar carro");
            System.out.println("2. Exibir informações do carro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = tc.nextInt();
            tc.nextLine();
            System.out.println("");

            
            if (opcao == 1) {
                cadastrarCarro(carro, tc);
            } else if (opcao == 2) {
                System.out.println(carro.imprimirDados());
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção Inválida. Tente novamente");
            }
        }

        tc.close();
    }
    
    public static void cadastrarCarro(Carro carro, Scanner tc) {
        System.out.println("Modelo do Carro: ");
        carro.setModelo(tc.nextLine());
        
        System.out.println("Marca do Carro: ");
        carro.setMarca(tc.nextLine());
        
        System.out.println("Placa do Carro: ");
        carro.setPlaca(tc.nextLine());
        
        System.out.println("Velocidade do Carro: ");
        carro.setVelocidade(tc.nextLine());
        
        System.out.println("Ano do Carro: ");
        carro.setAno(tc.nextInt());
        tc.nextLine();
        
        System.out.println("Quantidade de lugares do Carro: ");
        carro.setQtdeLugares(tc.nextInt());
        tc.nextLine();

        System.out.println("Peso do Carro: ");
        carro.setPeso(tc.nextInt());
        tc.nextLine();
        
        System.out.println("Modelo do Motor: ");
        carro.getMotor() .setModelo(tc.nextLine());
        
        System.out.println("Potência do Motor: ");
        carro.getMotor() .setPotencia(tc.nextLine());
        
        System.out.println("Fabricante do Motor: ");
        carro.getMotor() .setFabricante(tc.nextLine());
        
        System.out.println("Quantidade de cilindros do Motor: ");
        carro.getMotor() .setQtde_cilindros(tc.nextLine());
        
        System.out.println("Litragem do Motor: ");
        carro.getMotor() .setVolume(tc.nextLine());
        
        System.out.println("Modelo da Bateria: ");
        carro.getBateria().setModelo(tc.nextLine());
        
        System.out.println("Carga da Bateria: ");
        carro.getBateria().setCarga(tc.nextLine());
        
        System.out.println("Fabricante da Bateria: ");
        carro.getBateria().setFabricante(tc.nextLine());
        
        System.out.println("Ano de fabricação da Bateria: ");
        carro.getBateria().setAno_fabricacao(tc.nextLine());
        
        System.out.println("Quantidade de Portas: ");
        carro.getPortas().setQtde_portas(tc.nextLine());
        
        System.out.println("Fabricante do Pneu: ");
        carro.getPneu().setFabricante(tc.nextLine());
        
        System.out.println("Modelo do Pneu: ");
        carro.getPneu().setModelo(tc.nextLine());
        
        System.out.println("Aro do Pneu: ");
        carro.getPneu().setTamanho(tc.nextLine());
    }
}
