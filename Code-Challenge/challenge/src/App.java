
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        challenge5();

    }

    public static void challenge1() {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int deposito = scanner.nextInt();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    int saque = scanner.nextInt();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    public static void challenge2() {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.nextLine();

            // TODO: Chamar o método que veritica se o número da conta é valido
            verificarNumeroConta(numeroConta);
            // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // TODO: Informar que o número de conta é inválido e exibir a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // Lançar uma IllegalArgumentException com a seguinte mensagem:
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
            // "Numero de conta invalido. Digite exatamente 8 digitos."
        }
    }

    public static void challenge3() {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        // TODO: Verificar se a idade do cliente
        // TODO: Se >= 18, imprimir "Voce esta elegivel para criar uma conta bancaria."
        if (idade >= 18) {
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        } else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }
        // TODO: Caso contrário, imprimir "Voce nao esta elegivel para criar uma conta
        // bancaria."

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }

    public static void challenge4() {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transacao realizada com sucesso.");
        } else if (saque <= limiteChequeEspecial + saldo) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }

    public static void challenge5() {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1;; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f%n", limiteDiario);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}