package Role;

public class Professor extends User {

	private String faculty;
	private String department;
	private String nominateStudentUCID;

    public Professor(String username, String password) {
    	super(username, password);
    }

    public Professor(int ucid, String username, String name, String faculty, String department, String nominateStudentUCID) {
        super(ucid, username, name);
        this.faculty = faculty;
        this.department = department;
        this.nominateStudentUCID = nominateStudentUCID;
    }

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getNominateStudentUCID() {
		return nominateStudentUCID;
	}

	public void setNominateStudentUCID(String nominateStudentUCID) {
		this.nominateStudentUCID = nominateStudentUCID;
	}
    
    
    
   
}
