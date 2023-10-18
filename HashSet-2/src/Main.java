import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Set<String> forno = new HashSet<>();

        Forno pane = new Forno("pane");
        Forno pane1 = new Forno("baguette");
        Forno pane2 = new Forno("panini");
        Forno pane3 = new Forno("cornetti");
        Forno pane4 = new Forno("boh");
        Forno pane5 = new Forno("pippo");
        Forno pane6 = new Forno("pluto");

        forno.add(pane.getNome());
        forno.add(pane1.getNome());
        forno.add(pane2.getNome());
        forno.add(pane3.getNome());
        forno.add(pane4.getNome());
        forno.add(pane5.getNome());
        forno.add(pane6.getNome());

        System.out.println(forno);

        for (String i : forno) {
            if (i.contains("pippo")) {
                System.out.println(i + " si trova nel set.");
            } else {
                System.out.println(i + " non si trova nel set.");
            }

        }
    }
}