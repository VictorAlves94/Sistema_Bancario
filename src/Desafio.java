import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeDoCliente = "Doutor Estranho";
        String tipoConta = "Corrente";
        double saldoAtual = 1599.99;
        int opcao = 0;

        System.out.println("*******************************************");
        System.out.println("\nNome do cliente : " + nomeDoCliente);
        System.out.println("Tipo de conta : " + tipoConta);
        System.out.println("Saldo atual da conta : " + saldoAtual);
        System.out.println("\n*******************************************");

        String menu = """
                ******Digite a opção desejada :
                1- Consultar Saldo.
                2- Transferir Valor.
                3- Receber Valor.
                4- Sair.
                """;


        while (opcao != 4){
            System.out.println(menu);
            opcao = teclado.nextInt();

            if(opcao == 1){
                System.out.println("Seu saudo atual é de: " + saldoAtual +" reais.");

            } else if (opcao == 2) {
                System.out.println("digite o valor que voce deseja transferir: ");
                double valor = teclado.nextInt();
                if (saldoAtual < valor){
                    System.out.println("Saldo insuficiente para realizar a transferencia. ");
                }else {
                    System.out.println("Transferencia concluida com sucesso!");
                    saldoAtual = saldoAtual - valor;
                    System.out.println("Seu saldo atual é de: " + saldoAtual);
            }
        } else if (opcao == 3) {
                System.out.println("digite o valor que voce deseja receber: ");
                double valor = teclado.nextInt();
                saldoAtual = saldoAtual + valor;
                System.out.println("Seu saldo atual agora é de: " + saldoAtual + "reais.");
            }else if(opcao != 4){
                System.out.println("Opção invalida.");
            }

            }
        }


}
