
public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(3,5);
        Punto p2 = new Punto(3,6);

        //stampa p1
        System.out.println("P1 : " +p1);
        //stampa se p1 è uguale a p2
        System.out.println("P1 è uguale a P2 : " + p1.equals(p2));
        //stampare x per p1
        System.out.println("x di p1 : " +p1.x());
        //stampare y per p2
        System.out.println("y di p2 : " +p2.y());

    }
}