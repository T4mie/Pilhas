import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Estacionamento e = new Estacionamento();
        Random r = new Random();
        int i = 0;
        e.Estaciona(10);
        while (i <=10) {
            if(e.estacionaCarro(new SubCarro(i,"ABC123"+ i,LocalTime.now()))){
                System.out.println("O Carro de Placa ABC123"+i+" foi alocado" );
            }
            else{
                System.out.println("Estacionamento cheio, seu abobrinha");
            }
            
            i++;
        }
        SubCarro carroProcurado = e.encontraCarro(0);
        LocalTime saida = LocalTime.now();
        Duration duracao = Duration.between(saida, carroProcurado.getEntrada());
        System.out.println("O carro de placa " + carroProcurado.getPlaca() + " foi entregue após " + duracao + " e foram feitas "+ carroProcurado.getManobras() + " manobras com o carro.");
        SubCarro carroProcurado2 = e.encontraCarro(r.nextInt(10));
        LocalTime saida2 = LocalTime.now();
        Duration duracao2 = Duration.between(saida2, carroProcurado2.getEntrada());
        System.out.println("O carro de placa " + carroProcurado2.getPlaca() + " foi entregue após " + duracao2 + " e foram feitas "+ carroProcurado2.getManobras() + " manobras com o carro.");
    
    }
}
