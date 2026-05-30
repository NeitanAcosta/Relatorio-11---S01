public class Alien extends Entidade
        implements Rastreavel {

    private Poder poder;

    public Alien(String nome) {
        super(nome);
        poder = new Poder("Laser", 90);
    }

    @Override
    public String obterCoordenadas() {
        return "Setor X-51";
    }
}