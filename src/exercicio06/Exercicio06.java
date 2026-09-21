package exercicio06;

public class Exercicio06 {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo();
        veiculo1.placa = "abcd";
        veiculo1.modelo = "Fiat uno";
        veiculo1.anoFabricacao = 2010;
        veiculo1.quilometragem = 1000;
        veiculo1.registrarViagem(200);
        veiculo1.exibirDetalhes();

        Veiculo veiculo2 = new Veiculo();
        veiculo2.placa = "1234";
        veiculo2.modelo = "Chevrolet onix";
        veiculo2.anoFabricacao = 2022;
        veiculo2.quilometragem = 5000;

        veiculo2.registrarViagem(350);
        veiculo2.exibirDetalhes();


    }
}

class Veiculo{
    public String placa;
    public String modelo;
    public int anoFabricacao;

    public double quilometragem;

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("modelo: " + modelo);
        System.out.println("ano de fabrição: " + anoFabricacao);
        System.out.println("quilometragem: " + quilometragem);
    }

    public void registrarViagem(double km){
        quilometragem = quilometragem + km;
    }
}
