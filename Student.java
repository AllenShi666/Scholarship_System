
public class Student extends User {

    private String department;
    private int id;
    private String program;
    private int gpa;

    public Student(String username, String password, String name, String department, int id, String program, int gpa) {
        super(username, password, name);
        this.department = department;
        this.id = id;
        this.program = program;
        this.gpa = gpa;
    }

    public void applyScholarship() {

        //checks availability(time frame) of scholarship
        //checks GPA of student

    }

}
