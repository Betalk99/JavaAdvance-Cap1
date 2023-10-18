import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> forno = new HashSet<>();
        riempiForno(forno);

        System.out.println(forno);

        Forno pane = new Forno("pane");

        Iterator<String> iterator = forno.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            if(element == pane.getNome()){
                iterator.remove();
            }
        }

        System.out.println(forno);

        forno.clear();

        System.out.println(forno);
    }
    public static Set<String> riempiForno(Set<String> forno){
        forno.add("pane");
        forno.add("baguette");
        forno.add("panini");
        forno.add("cornetti");
        forno.add("boh");
        forno.add("pippo");

        return forno;
    }




}