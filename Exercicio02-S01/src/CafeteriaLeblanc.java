public class CafeteriaLeblanc {

    private Menu menu;

    public CafeteriaLeblanc() {
        menu = new Menu();
    }

    public Menu getMenu() {
        return menu;
    }

    public void abrirCafeteria() {
        System.out.println("Bem-vindo ao Leblanc!");
        menu.exibirMenu();
    }
}