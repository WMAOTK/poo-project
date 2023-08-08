import java.util.Scanner;

public abstract class JogadorAbstrato {
    protected static Baralho monte;
    protected Sring nomejogador;

    public JogadorAbstrato(Baralho monte, Sring nomejogador) {
        this.monte = monte;
        this.nomejogador = nomejogador;
    }

    public abstract String escolherAtributo();

    public Carta jogarTurno() {
        // Implemente a lógica do turno do jogador.
        // Escolha o atributo, pegue a carta do topo do monte e retorne-a.
        return null;
    }

    public String getNomejogador() {
        return nomejogador;
    }
    public void setNomejogador(String nomejogador) {
        this.nomejogador = nomejogador;
    }
   
   
    public Baralho getMonte() {
        return monte;
    }

    public void setMonte(Baralho monte) {
        this.monte = monte;
    }

    @Override
    public String toString() {
    return "JogadorAbstrato [nomejogador = " + nomejogador + ", monte = " + monte + "]";
    }
}