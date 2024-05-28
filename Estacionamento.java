import java.time.Duration;
import java.time.LocalTime;

public class Estacionamento{
    private Pilha<SubCarro> pilha;
    private int capacidade;

    public void Estaciona(int capacidade){
        this.pilha = new Pilha<SubCarro>();
        this.capacidade = capacidade;
    }

    public boolean estacionaCarro(SubCarro carro){
        if(pilha.getTamanho()>=capacidade){
            System.out.println("Estacionamento cheio, seu abobrinha");
            return false;
        }
        pilha.push(carro);
        System.out.println("Carro "+ carro.getPlaca() + " entrou no estacionamento às "+ carro.getEntrada() +" "+ carro.getManobras()+ " Com o número de identificação de " + carro.getCarro() + ".");
        return true;
    }

    public boolean removeCarro(SubCarro carro){
        Pilha<SubCarro> pilhaTemp = new Pilha<>();
        boolean encontrouCarro = false;

        if(pilha.estaVazia()){
            return false;
        }
        else{
            while(encontrouCarro != true && !pilha.estaVazia()){
                SubCarro carroatual = (SubCarro) pilha.consultaTopo();
                if(carro == carroatual){
                    LocalTime entrada = carroatual.getEntrada();
                    LocalTime saida = LocalTime.now();
                    Duration duracao = Duration.between(saida, entrada);
                    System.out.println("O carro " + carroatual + "  foi encontrado\n" + " a duração de estadia foi de " + duracao + "\nO número de manobras foi de" + carroatual.getManobras());
                    pilha.pop();
                    encontrouCarro=true;
                    
                }
                else{
                    carroatual.adicionaMan();
                    pilhaTemp.push(carroatual);
                    pilha.pop();
                }
    
            }
            if(encontrouCarro == true){
               
            }
            else{

            }
            return false;
        }

        
        
    }
}