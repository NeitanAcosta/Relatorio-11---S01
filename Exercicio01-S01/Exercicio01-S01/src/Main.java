import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mago howl = new Mago("Howl", 27);
        howl.apresentar();

        ArrayList<Divisao> lista = new ArrayList<>();

        lista.add(new Divisao("Quarto", "Descanso"));
        lista.add(new Divisao("Laboratorio", "Experimentos"));

        CasteloAnimado castelo = new CasteloAnimado(lista);

        castelo.adicionarDivisao(
                new Divisao("Biblioteca", "Estudos")
        );

        castelo.listarDivisoes();
    }
}