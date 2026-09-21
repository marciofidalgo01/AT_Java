package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidadorSenha validador = new ValidadorSenha();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        while (true) {
            System.out.print("\nDigite sua senha: ");
            String senha = scanner.nextLine();

            boolean senhaValida = validador.validar(senha);

            if (senhaValida) {
                System.out.println("\nSenha cadastrada com sucesso");
                System.out.println("Usuario: " + nome);
                break;
            } else {
                System.out.println("tente novamente.");
            }
        }

        scanner.close();
    }
}

class ValidadorSenha {

    public boolean validar(String senha) {
        boolean temTamanho = senha.length() >= 8;
        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        for (int i = 0; i < senha.length(); i++) {
            char letra = senha.charAt(i);

            if (Character.isUpperCase(letra)) {
                temMaiuscula = true;
            } else if (Character.isDigit(letra)) {
                temNumero = true;
            } else if (!Character.isLetterOrDigit(letra)) {
                temEspecial = true;
            }
        }

        if (!temTamanho) {
            System.out.println("Minimo de 8 caracteres.");
        }
        if (!temMaiuscula) {
            System.out.println("faltou letra maiuscula.");
        }
        if (!temNumero) {
            System.out.println("faltou numero.");
        }
        if (!temEspecial) {
            System.out.println("faltou caractere especial.");
        }

        return temTamanho && temMaiuscula && temNumero && temEspecial;
    }
}