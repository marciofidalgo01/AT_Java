package exercicio07;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = scanner.nextLine();

        System.out.print("matricula: ");
        aluno.matricula = scanner.nextLine();

        System.out.print("Primeira nota: ");
        aluno.nota1 = scanner.nextDouble();

        System.out.print("Segunda nota: ");
        aluno.nota2 = scanner.nextDouble();

        System.out.print("Terceira nota: ");
        aluno.nota3 = scanner.nextDouble();

        System.out.println("\nAluno: " + aluno.nome);
        System.out.println("Matricula: " + aluno.matricula);
        System.out.println("Media: " + aluno.calcularMedia());
        aluno.verificarAprovacao();

        scanner.close();
    }
}

class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;
    double nota3;

    double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    void verificarAprovacao() {
        if (calcularMedia() >= 7) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}
