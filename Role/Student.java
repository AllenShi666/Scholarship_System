package Role;

public class Student extends User {

	private String faculty;
	private String department;
    private int year;
    private double gpa;
    private String scholarshipApplied;
    private String scholarshipGot;
 
    public Student(int ucid, String username, String name, String faculty, String department, int year, double gpa, String scholarshipApplied, String scholarshipGot) {
        super(ucid, username, name);
        this.faculty = faculty;
        this.department = department;
        this.year = year;
        this.gpa = gpa;
        this.scholarshipApplied = scholarshipApplied;
        this.scholarshipGot = scholarshipGot;
    }
    
    public Student(String username, String password) {
    	super(username, password);
    }

	public String getFaculty() {
		return faculty;
	}

	public String getDepartment() {
		return department;
	}

	public int getYear() {
		return year;
	}

	public double getGpa() {
		return gpa;
	}

	public String getScholarshipApplied() {
		return scholarshipApplied;
	}

	public String getScholarshipGot() {
		return scholarshipGot;
	}

	public void applyScholarship() {

        //checks availability(time frame) of scholarship
        //checks GPA of student

    }

}
