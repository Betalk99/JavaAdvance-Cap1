public class Main {
    public static void main(String[] args) {

        User.getInstance().stampa();

        User.getInstance().setNome("Lucia Verdi");
        User.getInstance().setEta(40);

        User.getInstance().stampa();
    }
}