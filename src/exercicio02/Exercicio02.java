package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        while (true) {

            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            boolean temTamanho = senha.length() >= 8;
            boolean temMaiuscula = false;
            boolean temNumero = false;
            boolean temEspecial = false;

            for (int i = 0; i < senha.length(); i++) {

                char letra = senha.charAt(i);

                if (Character.isUpperCase(letra)) {
                    temMaiuscula = true;
                }

                if (Character.isDigit(letra)) {
                    temNumero = true;
                }

                if (!Character.isLetterOrDigit(letra)) {
                    temEspecial = true;
                }
            }

            if (!temTamanho) {
                System.out.println("Erro: mínimo de 8 caracteres.");
            }

            if (!temMaiuscula) {
                System.out.println("Erro: faltou letra maiúscula.");
            }

            if (!temNumero) {
                System.out.println("Erro: faltou número.");
            }

            if (!temEspecial) {
                System.out.println("Erro: faltou caractere especial.");
            }

            if (temTamanho && temMaiuscula && temNumero && temEspecial) {

                System.out.println("Senha cadastrada com sucesso!");
                System.out.println("Usuário: " + nome);

                break;
            }
        }

        scanner.close();
    }
}