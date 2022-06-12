package pl.camp.it.client.register.model;

public class Client {
    private String name;
    private String surname;
    private String street;
    private long pesel;

    public Client(String name, String surname, String street, long pesel) {
        this.name = name;
        this.surname = surname;
        this.street = street;
        this.pesel = pesel;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }
}
