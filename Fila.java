public class Fila <Info> {
    private No<Info> primeiro;
    private No<Info> ultimo;

    public boolean estaVazia() {
        return primeiro == null;
    }
    public void enfileira (Info i) {
        No<Info> novo = new No<>(i);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public Info desenfileira () {
        if (estaVazia()) return null;
        Info temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) //esvaziou
            ultimo = null;
        return temp;
    }
    @Override
    public String toString () {
        if (estaVazia()) return "fila vazia";
        String s = "";
        No<Info> aux = primeiro;
        while (aux != ultimo) {
            s = s + aux + " - ";
            aux = aux.getProximo();
        }
        s += aux;
        return s;
    }
}