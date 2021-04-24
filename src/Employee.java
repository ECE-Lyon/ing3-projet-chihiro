public class Employee extends User {

    private String name;

    private String firstName;

    public Employee(String name, String firstName){
        this.name=name;
        this.firstName=firstName;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
