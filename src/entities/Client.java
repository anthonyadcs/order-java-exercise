package entities;

import java.util.Date;

public class Client {
    private String name;
    private String email;
    private final Date birthDate;

    public Client(String name, String email, Date birthDate){
        setName(name);
        setEmail(email);
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
