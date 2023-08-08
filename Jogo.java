
public class Jogo {
    private Baralho baralho;
    private JogadorAbstrato jogadorReal;
    private JogadorAbstrato jogadorRandomico;

    public Jogo(String tema) {
        baralho = new Baralho();
        baralho.carregarCartas();
        baralho.embaralhar();

        jogadorReal = new JogadorReal(baralho, new Scanner(System.in));
        jogadorRandomico = new JogadorRandomico(baralho);
    }

    public void jogar() {
        // Implemente a lógica do jogo aqui.
    }

    public void mostrarVencedor() {
        // Implemente a lógica para mostrar o vencedor do jogo.
    }

    public void mostrarStatus() {
        // Implemente a lógica para mostrar o status atual do jogo (quantas cartas cada jogador tem).
    }
}

