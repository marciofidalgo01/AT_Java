package exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salario mensal: ");
        double salarioMensal = scanner.nextDouble();

        double salarioAnual = salarioMensal * 12;
        double aliquota;

        if (salarioAnual <= 22847.76) {
            aliquota = 0.0;
        } else if (salarioAnual <= 33919.80) {
            aliquota = 0.075;
        } else if (salarioAnual <= 45012.60) {
            aliquota = 0.15;
        } else {
            aliquota = 0.275;
        }

        double impostoAnual = salarioAnual * aliquota;
        double salarioLiquidoAnual = salarioAnual - impostoAnual;
        double salarioLiquidoMensal = salarioLiquidoAnual / 12;

        System.out.println("Nome: " + nome);
        System.out.println("Salario Anual: R$ " + salarioAnual);
        System.out.println("Alíquota: "+ aliquota * 100);
        System.out.println("Imposto: R$ "+ impostoAnual);
        System.out.println("Salário liquido anual: R$ "+ salarioLiquidoAnual);
        System.out.println("Salário Mensal Estimado: R$ " + salarioLiquidoMensal);

        scanner.close();
    }
}