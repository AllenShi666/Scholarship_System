package Role;

public abstract class User {

    private String username;    //maybe email?
    private String password;
    private String name;
    private int ucid;


    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    User(int ucid, String username, String name) {
        this.ucid = ucid;
    	this.username = username;
        this.name = name;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUcid() {
        return ucid;
    }

    public void setUcid(int ucid) {
        this.ucid = ucid;
    }
    
    public void login() {
        //login?
    }

    public void resetPassword() {
        //input original password
        //if correct, setPassword(new_password)
        //else, error message
    }

    public void specifyRole() {
        //specify role
        //either student, coordinator, or professor
    }

    public void viewScholarship() {
        //view a pdf or smthn?
    }

}

