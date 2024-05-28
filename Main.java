import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
        Estacionamento e = new Estacionamento();

        e.Estaciona(2);
        SubCarro c1 = new SubCarro(0,"JYN7A26",LocalTime.now());
        e.estacionaCarro(c1);
        SubCarro c2 = new SubCarro(1,"RTB4C06",LocalTime.now());
        e.estacionaCarro(c2);

        e.removeCarro(c2);
    
    }
}
