public class Youkai extends Entidade
        implements Rastreavel {

    private Poder poder;

    public Youkai(String nome) {
        super(nome);
        poder = new Poder("Ilusao", 75);
    }

    @Override
    public String obterCoordenadas() {
        return "Floresta Encantada";
    }
}