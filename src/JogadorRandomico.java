
import java.util.Random;

public class JogadorRandomico extends JogadorAbstrato {
    private Random random;
    private String escolhaATR = ("");

    public JogadorRandomico(Baralho baralho, String nomejogador, String escolhaATR) {
        super(baralho, nomejogador);
        random = new Random();
        this.escolhaATR = escolhaATR;
    }

    @Override
    public String escolherAtributo() {

        random.nextInt(4) +1;
        if(random.equals(1)){
            escolhaATR = ("A");
        }
        if(random.equals(2)){
            escolhaATR = ("B");        
        }
        if(random.equals(3)){
            escolhaATR = ("C");        
        }
        if(random.equals(4)){
            escolhaATR = ("D");
        }return escolhaATR;
    
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getescolhaATR() {
        return escolhaATR;
    }

    public void setescolhaATR(String escolhaATR) {
        this.escolhaATR = escolhaATR;
    }

    @Override
    public String toString() {
        return "JogadorRandomico [random = " + random + ", escolhaATR = " + escolhaATR + "]";
    }
}    