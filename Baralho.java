import java.util.LinkedList;
import java.util.List;

public class Baralho {
    private LinkedList<Carta> cartas;

    public Baralho() {
        cartas = new LinkedList<>();
    }

    public void carregarCartas() {
        // Aqui você carregará as cartas com as informações desejadas.
        // Você pode criar manualmente as instâncias de Carta ou ler de um arquivo.
        // Exemplo: Carta carta1 = new Carta("Tiranossauro Rex", "1A", curiosidades, atributos);
        // cartas.add(carta1);
    }

    public void embaralhar() {
        // Implemente o algoritmo de embaralhamento das cartas.
    }

    public Carta pegarCartaDoTopo() {
        // Implemente a lógica para pegar a carta do topo do baralho.
        // Remova a carta da lista após pegá-la.
        return null;
    }
}
