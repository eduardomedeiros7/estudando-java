package phone.entities;

public class User {
    private String name;
    private String email;

    private Phone phone;


    public User(String name, String email, Phone phone) {
        this.name = name;
        this.email = email;

        
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "User Details:\n" +
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Device: " + phone;
    }
}
