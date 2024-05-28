import java.time.LocalTime;

public class SubCarro extends Carro {

    private LocalTime entrada;
    private int manobras;

    public SubCarro(int carro, String placa, LocalTime entrada) {
        super(carro, placa);
        this.entrada = entrada;
        this.manobras = 0;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public int getManobras() {
        return manobras;
    }

    public void adicionaMan(){
        this.manobras++;
    }
}
