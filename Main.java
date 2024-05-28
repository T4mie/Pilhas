import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Estacionamento e = new Estacionamento();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a capacidade maxima do Estacionamento:");
        int capacidade = sc.nextInt();

        while (capacidade !=0) {
            int i = 1;
            e.Estaciona(capacidade);
            while (i <= capacidade) {
                if (e.estacionaCarro(new SubCarro(i, "ABC123" + i, LocalTime.now()))) {
                    System.out.println("O Carro de Placa ABC123" + i + " foi alocado\n");
                } else {
                    System.out.println("Estacionamento cheio, seu abobrinha");
                }

                i++;
            }
            System.out.println("Digite o ID buscado");
            int busca = sc.nextInt();
            while (busca != 0) {
                SubCarro carroProcurado = e.encontraCarro(busca);
                if (carroProcurado == null) {
                    System.out.println("Valor de Id nao encontrado, carro nao esta no estacionamento");
                } else {
                    Duration duracao = e.calcularDuration(carroProcurado);
                    System.out.println("O carro de placa " + carroProcurado.getPlaca() + " foi entregue apos " + duracao
                            + " e foram feitas " + carroProcurado.getManobras() + " manobras com o carro.");

                }
                System.out.println("Digite um novo ID. Digite 0 para sair:");
                busca = sc.nextInt();
            }
            System.out.println("Digite uma nova capacidade maxima do Estacionamento, digite 0 para sair:");
            capacidade = sc.nextInt();
        }
         
        sc.close();
    }
}
