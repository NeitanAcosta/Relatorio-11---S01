public class Tempero {

    private String nome;
    private String quantidade;

    public Tempero(String nome,
                   String quantidade) {

        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome + " - " + quantidade;
    }
}