import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Forno> forno = new HashSet<>();

        Forno pane = new Forno("pane");
        Forno pane1 = new Forno("baguette");
        Forno pane2 = new Forno("panini");
        Forno pane3 = new Forno("cornetti");
        Forno pane4 = new Forno("boh");
        Forno pane5 = new Forno("pippo");
        Forno pane6 = new Forno("pluto");

        forno.add(pane);
        forno.add(pane1);
        forno.add(pane2);
        forno.add(pane3);
        forno.add(pane4);
        forno.add(pane5);
        forno.add(pane6);

        System.out.println(forno);

        Iterator<Forno> iterator = forno.iterator();

        while(iterator.hasNext()){
            String element = iterator.next().getNome();
            System.out.println(element);
            /*if(element == pane.getNome()){
                System.out.println(element + " si trova nel set.");
            } else {
                System.out.println(element + " non si trova nel set.");
            }*/
        }
    }
}