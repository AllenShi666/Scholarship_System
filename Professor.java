
public class Professor extends User {

    private String department;

    public Professor(String username, String password, String name, String department) {
        super(username, password, name);
        this.department = department;
    }

    public void nominateStudent() {
        //nominate student for scholarship
    }
}
