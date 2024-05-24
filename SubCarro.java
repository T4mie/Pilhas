import java.util.Date;

public class SubCarro extends Carro {

    private Date entrada;
    private Date saida;
    private int manobras;

    public SubCarro(int carro, String placa) {
        super(carro, placa);
        this.entrada = entrada;
        this.saida = saida;
        this.manobras = manobras;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public int getManobras() {
        return manobras;
    }

    public void setManobras(int manobras) {
        this.manobras = manobras;
    }
    
    
}
