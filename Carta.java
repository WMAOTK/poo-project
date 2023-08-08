
	import java.util.List;

	public class Carta {
	    private String nome;
	    private String codigo;
	    private List<String> curiosidades;
	    private List<Atributo> atributos;

	    public Carta(String nome, String codigo, List<String> curiosidades, List<Atributo> atributos) {
	        this.nome = nome;
	        this.codigo = codigo;
	        this.curiosidades = curiosidades;
	        this.atributos = atributos;
	    }

	    // Getters and Setters
	    
	    public String getNome() {
	        return nome;
	    }

	    public String getCodigo() {
	        return codigo;
	    }

	    public List<String> getCuriosidades() {
	        return curiosidades;
	    }

	    public List<Atributo> getAtributos() {
	        return atributos;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Nome: ").append(nome).append("\n");
	        sb.append("Código: ").append(codigo).append("\n");
	        sb.append("Curiosidades:\n");
	        for (String curiosidade : curiosidades) {
	            sb.append("- ").append(curiosidade).append("\n");
	        }
	        sb.append("Atributos:\n");
	        for (Atributo atributo : atributos) {
	            sb.append("- ").append(atributo).append("\n");
	        }
	        return sb.toString();
	    }
	}


