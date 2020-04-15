package Role;

public class Coordinator extends User {

    private ScholarshipList list;

    public Coordinator(String username, String password) {
        super(username, password);
        this.list = new ScholarshipList();
    }

//    public void addScholarship(String name, String department, String[] requirements) {
//        //add a new scholarship
//
//        Scholarship newScholarship = new Scholarship(name, department, requirements);
//        list.addScholarshipToList(newScholarship);
//    }

    public void editScholarship(Scholarship scholarship) {
        //edit scholarship

    }

    public void setTimeScholarship() {
        //set time frame for scholarship availability
    }
    
}
