public class Main {
    public static void main(String[] args) {
        Pilha<Carro> e = new Pilha<>();
        System.out.println(e);

        Carro c1 = new Carro(1, "NCJ-4796");
        e.push(c1);

        Carro c2 = new Carro(2, "NCJ-4796");
        e.push(c2);
    }
}
