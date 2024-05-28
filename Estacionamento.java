public class Estacionamento{
    private Pilha<SubCarro> pilha;
    private int capacidade;

    public void Estaciona(int capacidade){
        this.pilha = new Pilha<SubCarro>();
        this.capacidade = capacidade;
    }

    public boolean estacionaCarro(SubCarro carro){
        if(pilha.getTamanho()>=capacidade){
            return false;
        }
        pilha.push(carro);
        System.out.println("Carro "+ carro.getPlaca() + " entrou no estacionamento às "+ carro.getEntrada() +" "+ carro.getManobras()+ " Com o número de identificação de " + carro.getCarro() + ".");
        return true;
    }

    public SubCarro encontraCarro(int id) {
        Pilha<SubCarro> pilhaTemp = new Pilha<>();
        SubCarro carroSai = null;

        while (!pilha.estaVazia()&&carroSai==null) {
            if (pilha.consultaTopo().getCarro()==id) {
                carroSai = pilha.pop();
                
            } 
            else {
                pilha.consultaTopo().adicionaMan();
                pilhaTemp.push(pilha.pop());
            }

        }
        
        guardarCarro(pilha, pilhaTemp);
        return carroSai;

    }
    public void guardarCarro(Pilha<SubCarro> pilhaAtual,Pilha<SubCarro> pilhaTemp){
        while (!pilhaTemp.estaVazia()) {
            pilhaAtual.push(pilhaTemp.pop());
        }
        

    }
}