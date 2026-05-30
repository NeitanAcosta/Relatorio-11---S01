public class Divisao {
    private String nome;
    private String funcao;

    public Divisao(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return nome + " - " + funcao;
    }
}