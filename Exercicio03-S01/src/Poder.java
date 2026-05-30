public class Poder {

    private String nome;
    private int intensidade;

    public Poder(String nome, int intensidade) {
        this.nome = nome;
        this.intensidade = intensidade;
    }

    @Override
    public String toString() {
        return nome + " (" + intensidade + ")";
    }
}