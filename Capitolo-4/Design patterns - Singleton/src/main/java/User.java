public class User {

    private static User istanza;

    private String nome;
    private int eta;

    private User(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public static User getInstance() {
        if (istanza == null) {
            istanza = new User("Mario Rossi", 30);
        }

        return istanza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void stampa() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
    }

}
