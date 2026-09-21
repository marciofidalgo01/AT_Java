package exercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sorteio sorteio = new Sorteio();

        List<Integer> listaAleatorios = sorteio.gerarAleatorios();
        List<Integer> listaNumeros = sorteio.lerNumerosUsuario(sc);

        int acertos = sorteio.contarAcertos(listaAleatorios, listaNumeros);

        System.out.println("Quantidade de acertos: " + acertos);
        System.out.println("Numeros aleatorios: " + listaAleatorios);
        System.out.println("Numeros do usuario: " + listaNumeros);
    }
}

class Sorteio {

    public List<Integer> gerarAleatorios() {
        Random random = new Random();

        int aleatorio1 = random.nextInt(1, 61);
        int aleatorio2 = random.nextInt(1, 61);
        int aleatorio3 = random.nextInt(1, 61);
        int aleatorio4 = random.nextInt(1, 61);
        int aleatorio5 = random.nextInt(1, 61);
        int aleatorio6 = random.nextInt(1, 61);

        List<Integer> listaAleatorios = new ArrayList<>(List.of(aleatorio1, aleatorio2, aleatorio3, aleatorio4, aleatorio5, aleatorio6));
        return listaAleatorios;
    }
    public List<Integer> lerNumerosUsuario(Scanner sc) {
        System.out.print("\n Digite o numero 1: ");
        int numero1 = sc.nextInt();
        System.out.print("\n Digite o numero 2: ");
        int numero2 = sc.nextInt();
        System.out.print("\n Digite o numero 3: ");
        int numero3 = sc.nextInt();
        System.out.print("\n Digite o numero 4: ");
        int numero4 = sc.nextInt();
        System.out.print("\n Digite o numero 5: ");
        int numero5 = sc.nextInt();
        System.out.print("\n Digite o numero 6: ");
        int numero6 = sc.nextInt();

        List<Integer> listaNumeros = new ArrayList<>(List.of(numero1,numero2,numero3,numero4,numero5,numero6));

        return listaNumeros;
    }

    public int contarAcertos(List<Integer> aleatorios, List<Integer> usuario) {
        int acertos = 0;
        for (int i : usuario) {
            if (aleatorios.contains(i)) {
                acertos++;
            }
        }
        return acertos;
    }
}