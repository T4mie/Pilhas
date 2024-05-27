public class Estacionamento{
    private Pilha pilha;
    private int capacidade;

    public Estaciona(int capacidade){
        this.pilha = new Pilha();
        this.capacidade = capacidade;
    }

    public boolean estacionaCarro(SubCarro carro){
        if(pilha.getTamanho()>=capacidade){
            System.out.println("Estacionamento cheio, seu abobrinha");
            return false;
        }
        pilha.push(carro);
        System.out.println("Carro "+ carro.getPlaca() + " entrou no estacionamento às "+ carro.getEntrada() + ".");
        return true;
    }

    public boolean
}