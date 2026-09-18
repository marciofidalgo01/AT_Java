package exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Digite o valor do emprestimo: ");
        double emprestimo = scanner.nextDouble();

        int parcelas;
        while (true) {
            System.out.print("Digite quantas parcelas deseja pagar: ");
            parcelas = scanner.nextInt();

            if (parcelas < 6 || parcelas > 48) {
                System.out.println("Mínimo 6, máximo 48");
            } else {
                break;
            }
        }

        double juros = emprestimo * (0.03 * parcelas);
        double valorTotal = emprestimo + juros;
        double valorParcela = valorTotal / parcelas;

        System.out.println("Cliente: " + cliente);
        System.out.println("Valor total pago: R$ " + valorTotal);
        System.out.println("Valor da parcela mensal: R$ " + valorParcela);

        scanner.close();
    }
}