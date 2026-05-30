public class Main {

    public static void main(String[] args) {

        CafeteriaLeblanc cafeteria =
                new CafeteriaLeblanc();

        cafeteria.getMenu().adicionarCafe(
                new Cafe("Expresso", 5.0)
        );

        cafeteria.getMenu().adicionarCafe(
                new Cafe("Capuccino", 8.0)
        );

        cafeteria.getMenu().adicionarCafe(
                new CafeGourmet(
                        "Cafe Especial",
                        10.0,
                        3.0
                )
        );

        cafeteria.abrirCafeteria();
    }
}