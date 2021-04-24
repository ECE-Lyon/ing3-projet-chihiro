public class Membre extends Customer {

    public enum FidelityCard {
        ENFANT,
        ETUDIANT,
        ADULTE,
        SENIOR,
    }

    private String name;

    private String firstName;

    private String email;

    private String password;

    private FidelityCard fidelityCard;

    public Membre(String name, String firstName, String email, String password){
        this.name=name;
        this.firstName=firstName;
        this.email=email;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public FidelityCard getFidelityCard() {
        return fidelityCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFidelityCard(FidelityCard fidelityCard) {
        this.fidelityCard = fidelityCard;
    }
}
