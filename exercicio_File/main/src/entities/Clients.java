package entities;

public class Clients {
    private String name, email, numTel;

    public Clients (String name, String email, String numTel) {
        this.name = name;
        this.email = email;
        this.numTel = numTel;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getNumTel() {
        return numTel;
    }
}
