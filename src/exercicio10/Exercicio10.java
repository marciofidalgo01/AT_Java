package exercicio10;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        GerenciadorCompras gerenciador = new GerenciadorCompras();

        gerenciador.salvarProdutos(sc);

        gerenciador.ler();

        sc.close();
    }
}

class GerenciadorCompras {

    void salvarProdutos(Scanner sc) throws Exception {
        FileWriter escritor = new FileWriter("compras.txt");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Nome do produto: ");
            String produto = sc.next();

            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            escritor.write("Produto: " + produto + "  Quantidade: " + qtd + " / R$ " + preco + "\n");
        }

        escritor.close();
    }

    void ler() throws Exception {
        Scanner leitor = new Scanner(new File("compras.txt"));

        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            System.out.println(linha);
        }
        leitor.close();
    }
}