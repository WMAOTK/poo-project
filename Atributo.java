public class Atributo {
	
    private String nome;
    private double valor;
    private String unidadeMedida;

    public Atributo(String nome, double valor, String unidadeMedida) {
        this.nome = nome;
        this.valor = valor;
        this.unidadeMedida = unidadeMedida;
    }
   
   
    
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    @Override
    public String toString() {
        return nome + ": " + valor + " " + unidadeMedida;
    }
}
