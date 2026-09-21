package exercicio12;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chat chat = new Chat();

        System.out.print(" Digite o nome do primeiro usuário: ");
        String usuario1 = sc.nextLine();

        System.out.print(" Digite o nome do segundo usuário: ");
        String usuario2 = sc.nextLine();

        for (int contador = 0; contador < 5; contador++) {
            System.out.print(usuario1 + ", digite sua mensagem: ");
            String menssagemUsuario1 = sc.nextLine();

            System.out.print(usuario2 + ", digite sua mensagem: ");
            String menssagemUsuario2 = sc.nextLine();

            chat.registrarMensagem(usuario1, menssagemUsuario1);
            chat.registrarMensagem(usuario2, menssagemUsuario2);
        }

        chat.exibirHistorico();
    }
}


class Chat {
    public String[] lista = new String[10];
    public int indice = 0;

    public void registrarMensagem(String usuario, String mensagem) {
        lista[indice] = usuario + ": " + mensagem;
        indice++;
    }

    public void exibirHistorico() {
        System.out.println("=== Historico de menssagens ===");
        for (String i : lista) {
            System.out.println(i);
        }
        System.out.print("\nObrigado por utilizarem o sistema! Boa sorte para voces");
    }
}

//package exercicio12;
//        import java.util.Scanner;
//        import java.util.List;
//        import java.util.ArrayList;
//public class Exercicio12 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Digite o nome do primeiro usuário: ");
//        String usuario1 = sc.nextLine();
//        System.out.print(" Digite o nome do segundo usuário: ");
//        String usuario2 = sc.nextLine();
//
//        String[] lista = new String[10];
//        int indice = 0;
//        int contador = 0;
//
//        while (true){
//
//            System.out.print(usuario1 + ", digite sua mensagem: ");
//            String menssagemUsuario1 = sc.nextLine();
//
//
//            System.out.print(usuario2 + ", digite sua mensagem: ");
//            String menssagemUsuario2 = sc.nextLine();
//
//            lista[indice] = usuario1 + ": " + menssagemUsuario1;
//            indice++;
//
//            lista[indice] = usuario2 + ": " + menssagemUsuario2;
//            indice++;
//
//            contador++;
//            if (contador == 5){
//                System.out.println("=== Historico de menssagens ===");
//                for(String i : lista){
//                    System.out.println(i);
//                }
//                System.out.print("\nObrigado por utilizarem o sistema! Boa sorte para voces");
//                break;
//            }
//        }
//    }
//}
