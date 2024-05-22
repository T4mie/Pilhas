public class Carro {
    private int carro;
    private String placa;

    public Carro (int carro, String placa) {
        this.carro = carro;
        this.placa = placa;
    }
    
    public int getCarro() {
        return carro;
    }
    public void setCarro(int carro) {
        this.carro = carro;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "carro: "+carro + "| placa: "+placa;
    }
}