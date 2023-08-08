import java.util.Scanner;

public class JogadorReal extends JogadorAbstrato {
    private Scanner scanner;

    public JogadorReal(Baralho baralho, String nomejogador, Scanner scanner) {
        super(baralho, nomejogador);
        scanner = new Scanner(System.in);
    }

    @Override
    public String escolherAtributo() {
        System.out.println("Eis vossa carta: " + carta.toString());
        System.out.printf("Dentre os atributos dela, escolha um a ser usado, onde (de cima para baixo)");
        System.out.println("temos: A como o primeiro, B como o segundo, C como o terceiro e D como o último.");
        
        String escolhaATR= scanner.nextLine();
        return escolhaATR;
    }
}