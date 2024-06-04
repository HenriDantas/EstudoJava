package primeiraAplicacao.ProjetoFinal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        String nomeUsuario = "Henri Dantas Santos";
        String tipoConta = "Corrente";
        double saldo = 2000;

        System.out.println("==================================");
        System.out.println("         Conta corrente          \n");
        System.out.println("    Nome: %s".formatted(nomeUsuario));
        System.out.println("    Tipo da conta: %s".formatted(tipoConta));
        System.out.println("    Saldo atual: %.2f".formatted(saldo));
        System.out.println("==================================\n\n");

        String menu = """ 
                            Operações

                        1 - Consultar saldo
                        2 - Transferir valor
                        3 - Receber valor 
                        4 - Sair
                """;
        //possivel fazer com do while tbm 

        while (opcao != 4) {    
            System.out.println(menu);
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual é de %.2f\n".formatted(saldo));
                    break;
                case 2:
                    System.out.println("Qual valor deseja transferir? ");
                    double valorTranferir = ler.nextDouble();
                    if (valorTranferir > saldo){
                        System.out.println("Valor insuficiente\n");
                        break;
                    } else {
                        // System.out.println("Deseja mesmo transferir esse valor?\n Seu saldo restante será %.2f".formatted(saldo - valorTranferir));
                        // String confirmar = ler.nextLine();
                        // if ( confirmar.toLowerCase() == "sim" || confirmar.toLowerCase() == "s" ){
                        //     saldo -= valorTranferir;
                        //     System.out.println("Valor Transferido\n");
                        // } else if ( confirmar.toLowerCase() == "nao" || confirmar.toLowerCase() == "n" || confirmar.toLowerCase() == "não" || confirmar.toLowerCase() == "ñ" ) {
                        //     System.out.println("Operação cancelada\n");
                        // }
                        saldo -= valorTranferir;
                        System.out.println("Valor Transferido\n");
                        System.out.println("Valor atual: %.2f".formatted(saldo));
                    }
                    break;
                case 3:
                    System.out.println("Qual valor irá receber? ");
                    double valorReceber = ler.nextDouble();
                    saldo += valorReceber;
                    System.out.println("Valor recebido");
                    System.out.println("Valor atual: %.2f".formatted(saldo));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        }
    }
}
