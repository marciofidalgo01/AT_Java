package exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Digite o valor do emprestimo: ");
        double emprestimo = scanner.nextDouble();

        int parcelas;
        while (true) {
            System.out.print("Digite quantas parcelas deseja pagar (6 a 48): ");
            parcelas = scanner.nextInt();

            if (parcelas < 6 || parcelas > 48) {
                System.out.println("Minimo 6, maximo 48 parcelas.");
            } else {
                break;
            }
        }

        CalculadoraEmprestimo calc = new CalculadoraEmprestimo();
        calc.calcular(emprestimo, parcelas);

        System.out.println("Cliente: " + cliente);
        System.out.println("Valor total pago: R$ " + calc.valorTotal);
        System.out.println("Valor da parcela mensal: R$ " + calc.valorParcela);

        scanner.close();
    }
}

class
CalculadoraEmprestimo {
    double valorTotal;
    double valorParcela;

    void calcular(double emprestimo, int parcelas) {
        double juros = emprestimo * (0.03 * parcelas);
        valorTotal = emprestimo + juros;
        valorParcela = valorTotal / parcelas;
    }
}