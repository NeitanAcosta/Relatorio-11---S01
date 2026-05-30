import java.util.HashMap;

public class RegistroOculto {

    private HashMap<String, Entidade> entidades =
            new HashMap<>();

    public void registrarEntidade(
            Entidade entidade) {

        if (entidades.containsKey(
                entidade.getNome())) {

            System.out.println(
                    "Entidade ja registrada!"
            );
            return;
        }

        entidades.put(
                entidade.getNome(),
                entidade
        );
    }

    public void listarEntidades() {

        for (Entidade e : entidades.values()) {

            Rastreavel r = (Rastreavel) e;

            System.out.println(
                    e.getNome()
                            + " -> "
                            + r.obterCoordenadas()
            );
        }
    }
}