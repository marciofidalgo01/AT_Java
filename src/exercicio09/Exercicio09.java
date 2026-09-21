package exercicio09;

public class Exercicio09 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "joao";
        conta1.depositar(100);
        conta1.sacar(50);
        conta1.exibirSaldo();

    }
}

class ContaBancaria{
    public String titular;
    private double saldo;

    public void depositar(double valor){
        saldo = valor + saldo;

        System.out.println("Saldo atual (após depositar): " + saldo);
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Não há saldo suficiente");
        }else{
            saldo -= valor;

            System.out.println("Saldo atual (apos sacar): " + saldo);
        }
    }

    public void exibirSaldo(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
    }
}
