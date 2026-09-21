package exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
       CGI cgi = new CGI();
        cgi.exibir();
    }
}

class CGI {
    void exibir() {
        System.out.println("Content-Type: text/html");
        System.out.println();

        System.out.println("<html>");
        System.out.println("<head><title>Saudação CGI</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Olá, Terráqueos!</h1>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}