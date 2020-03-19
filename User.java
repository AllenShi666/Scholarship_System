
public abstract class User {

    private String username;    //maybe email?
    private String password;
    private String name;


    User(String username, String password, String name) {
        this.username = username;
        this.password = password;
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

