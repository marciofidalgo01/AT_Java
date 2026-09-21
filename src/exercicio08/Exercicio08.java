package exercicio08;

public class Exercicio08 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.nome = "Joao";
        gerente.salarioBase = 5000.0;

        Estagiario estagiario = new Estagiario();
        estagiario.nome = "Ana";
        estagiario.salarioBase = 1500.0;

        System.out.println("Gerente: " + gerente.nome + " / Salario Final: R$ " + gerente.calcularSalario());
        System.out.println("estagiario: " + estagiario.nome + " / Salario Final: R$ " + estagiario.calcularSalario());
    }
}
class Funcionario {
    String nome;
    double salarioBase;

    double calcularSalario() {

        return salarioBase;
    }
}

class Gerente extends Funcionario {
    @Override
    double calcularSalario() {
        return salarioBase * 1.20;
    }
}

class Estagiario extends Funcionario {
    @Override
    double calcularSalario() {
        return salarioBase * 0.90;
    }
}