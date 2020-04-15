package Role;
public class Scholarship {

    private int ID;
	private String name;
    private String faculty;
	private String department;
	private int year;
	private double gpa;
	private int numberAvailable;
	private int amount;
    private int NumberApplied;
    private String WhoGot;
    
    public Scholarship(int ID, String name, String faculty, String department, int year, double gpa, int numberAvailable, int amount, int NumberApplied, String WhoGot) {
    	this.ID = ID;
    	this.name = name;
    	this.faculty = faculty;
    	this.department = department;
    	this.year = year;
    	this.gpa = gpa;
    	this.numberAvailable = numberAvailable;
    	this.amount = amount;
    	this.NumberApplied = NumberApplied;
    	this.WhoGot = WhoGot;
    }

    public Scholarship(String name, double gpa, int numberAvailable, int amount, int NumberApplied) {
    	this.name = name;
    	this.gpa = gpa;
    	this.numberAvailable = numberAvailable;
    	this.amount = amount;
    	this.NumberApplied = NumberApplied;
    }
    
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getNumberAvailable() {
		return numberAvailable;
	}

	public void setNumberAvailable(int numberAvailable) {
		this.numberAvailable = numberAvailable;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getNumberApplied() {
		return NumberApplied;
	}

	public void setNumberApplied(int numberApplied) {
		NumberApplied = numberApplied;
	}

	public String getWhoGot() {
		return WhoGot;
	}

	public void setWhoGot(String whoGot) {
		WhoGot = whoGot;
	}

    


}