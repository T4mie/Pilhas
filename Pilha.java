public class Pilha<Info> {
    private No<Info> topo;
    private int tamanho = 0;

    //construtor padrão
    public boolean estaVazia () {
        return topo == null;
    }
    public void push (Info info) {
        No<Info> novo = new No<Info>(info);
        if (!estaVazia())
            novo.setProximo(topo);
        topo = novo;
        tamanho++;
    }
    public Info pop () {
        if (estaVazia()) return null;
        Info info = topo.getInfo();
        topo = topo.getProximo();
        tamanho--;
        return info;
    }
    public Info consultaTopo () {
        if (estaVazia()) return null;
        return topo.getInfo();
    }
    public int getTamanho(){
        return tamanho;
    }

    @Override
    public String toString() {
        if (estaVazia())
            return "pilha vazia";
        No<Info> aux = topo;
        String s = "";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getProximo();
        }
        return s;
    }
}
