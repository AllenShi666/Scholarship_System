import java.util.ArrayList;

public class ScholarshipList {

    private ArrayList<Scholarship> list;

    ScholarshipList(){
        list = new ArrayList<Scholarship>();
    }


    void addScholarshipToList(Scholarship scholarship){
        list.add(scholarship);
    }

    public Object[] getScholarshipList(){
        return list.toArray();
    }

    public void removeScholarshipFromList(Scholarship scholarship){
        list.remove(scholarship);
    }

}