public final class PeersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    private PeersonBuilder() {
    }

    public static PeersonBuilder aPeerson() {
        return new PeersonBuilder();
    }

    public PeersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PeersonBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PeersonBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PeersonBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public Peerson build() {
        Peerson peerson = new Peerson();
        peerson.setFirstName(firstName);
        peerson.setLastName(lastName);
        peerson.setAge(age);
        peerson.setAddress(address);
        return peerson;
    }
}
