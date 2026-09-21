package exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salario mensal: ");
        double salarioMensal = scanner.nextDouble();

        CalculadoraImposto calcular = new CalculadoraImposto();
        calcular.metodoCalcular(salarioMensal);

        System.out.println("Nome: " + nome);
        System.out.println("Salario anual: R$ " + calcular.salarioAnual);
        System.out.println("aliquota: " + (calcular.aliquota * 100) + "%");
        System.out.println("Imposto Anual: R$ " + calcular.impostoAnual);
        System.out.println("Salario liquido anual: R$ " + calcular.salarioLiquidoAnual);
        System.out.println("Salario liquido mensal: R$ " + calcular.salarioLiquidoMensal);

    }
}

class CalculadoraImposto {
    double salarioAnual;
    double aliquota;
    double impostoAnual;
    double salarioLiquidoAnual;
    double salarioLiquidoMensal;

    void metodoCalcular(double salarioMensal) {
        salarioAnual = salarioMensal * 12;

        if (salarioAnual <= 22847.76) {
            aliquota = 0.0;
        } else if (salarioAnual <= 33919.80) {
            aliquota = 0.075;
        } else if (salarioAnual <= 45012.60) {
            aliquota = 0.15;
        } else {
            aliquota = 0.275;
        }

        impostoAnual = salarioAnual * aliquota;

        salarioLiquidoAnual = salarioAnual - impostoAnual;

        salarioLiquidoMensal = salarioLiquidoAnual / 12;
    }
}

//package exercicio03;
//
//import java.util.Scanner;
//
//public class Exercicio03 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite seu nome: ");
//        String nome = scanner.nextLine();
//
//        System.out.print("Digite seu salario mensal: ");
//        double salarioMensal = scanner.nextDouble();
//
//        double salarioAnual = salarioMensal * 12;
//        double aliquota;
//
//        if (salarioAnual <= 22847.76) {
//            aliquota = 0.0;
//        } else if (salarioAnual <= 33919.80) {
//            aliquota = 0.075;
//        } else if (salarioAnual <= 45012.60) {
//            aliquota = 0.15;
//        } else {
//            aliquota = 0.275;
//        }
//
//        double impostoAnual = salarioAnual * aliquota;
//        double salarioLiquidoAnual = salarioAnual - impostoAnual;
//        double salarioLiquidoMensal = salarioLiquidoAnual / 12;
//
//        System.out.println("Nome: " + nome);
//        System.out.println("Salario Anual: R$ " + salarioAnual);
//        System.out.println("Alíquota: "+ aliquota * 100);
//        System.out.println("Imposto: R$ "+ impostoAnual);
//        System.out.println("Salário liquido anual: R$ "+ salarioLiquidoAnual);
//        System.out.println("Salário Mensal Estimado: R$ " + salarioLiquidoMensal);
//
//        scanner.close();
//    }
//}