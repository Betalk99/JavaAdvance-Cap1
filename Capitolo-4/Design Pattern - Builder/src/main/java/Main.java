public class Main {
    public static void main(String[] args) {

        Peerson p1 = PeersonBuilder.aPeerson()
                .withLastName("Orlandi")
                .withFirstName("Bruno")
                .withAge(24)
                .withAddress("Via Pippo pluto")
                .build();


        System.out.println(p1);


    }
}