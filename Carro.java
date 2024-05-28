public class Carro {
    private int id;
    private String placa;

    public Carro (int id, String placa) {
        this.id = id;
        this.placa = placa;
    }
    
    public int getCarro() {
        return id;
    }
    public void setCarro(int carro) {
        this.id = carro;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "carro: "+id + "| placa: "+placa;
    }
}