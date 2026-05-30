public class Prato {

    private String nome;
    private Monstro monstro;
    private Tempero tempero;

    public Prato(String nome,
                 Monstro monstro) {

        this.nome = nome;
        this.monstro = monstro;

        tempero = new Tempero(
                "Sal",
                "10g"
        );
    }

    public void servir() {

        System.out.println(
                "\nPrato: " + nome
        );

        monstro.virarPrato();

        System.out.println(
                "Tempero: "
                        + tempero
        );
    }
}