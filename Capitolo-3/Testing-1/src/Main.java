public class Main {
    public static void main(String[] args) {

        Rettangolo rett = new Rettangolo(3,5, TipoForma.rettangolo);
        Triangolo triangolo = new Triangolo(3,5, TipoForma.triangolo);


        System.out.println("L'area del rettangolo : " + rett.calcolaArea());
        System.out.println("Rettangolo : " + rett);
        System.out.println("L'area del triangolo : " + triangolo.calcolaArea());
        System.out.println("Triangolo : " + triangolo);




    }
}