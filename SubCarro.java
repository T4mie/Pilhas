import java.time.Duration;
import java.time.LocalTime;

public class SubCarro extends Carro {

    private LocalTime entrada;
    private LocalTime saida;
    private int manobras;

    public SubCarro(int carro, String placa, LocalTime entrada, LocalTime saida) {
        super(carro, placa);
        this.entrada = entrada;
        this.saida = saida;
        this.manobras = 0;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSaida() {
        return saida;
    }

    public void setSaida(LocalTime saida) {
        this.saida = LocalTime.now();
    }

    public long tempoEstacionado(){
        if (saida != null){
            Duration duracao = Duration.between(saida, entrada);
            return duracao.toMillis();
        }
        return 0;
    }

    public int getManobras() {
        return manobras;
    }

    public void adicionaMan(){
        this.manobras++;
    }
}
