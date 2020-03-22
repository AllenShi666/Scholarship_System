public class Scholarship {

    private String name;
    private String department;
    private String[] requirements;

    Scholarship(String name, String department, String[] requirements){
        this.name = name;
        this.department = department;
        this.requirements = requirements;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String[] getRequirements(){
        return requirements;
    }

    public void setRequirements(String[] requirements){
        this.requirements = requirements;
    }


}