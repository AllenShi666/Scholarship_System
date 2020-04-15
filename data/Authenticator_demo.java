package data;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Authenticator_demo{

	private ArrayList<String> usernames;
	private ArrayList<String> passwords;

	public Authenticator_demo(){
		
		usernames = new ArrayList<String>();
		passwords = new ArrayList<String>();
		int i;

		//read saved un/pw file and save to arraylists
		if (Load() == 1){		//reset to empty ArrayLists if Load failed
			usernames = new ArrayList<String>();
			passwords = new ArrayList<String>();
		}
	}

	public String Authenticate(String username, String password){
		
		int i = -1;

		//search for username in usernames
		for (int j=0; j < usernames.size(); j++){
			if (usernames.get(j).equals(username)){
				i = j;
				break;
			}
		}

		//if not found return 1
		if (i == -1){
			return "Account not found!";
		}

		//if found, check password[n] where n is the address of username in usernames
		if (passwords.get(i).equals(password)){
			return "Account matched!";
		}

		return "Account Found! Password not match!";
		//if valid, return 0, else return 2
	}

	public String CreateAccount(String username, String password){
		
		//check for username in usernames, if found, return 1
		for (int i=0; i < usernames.size(); i++){
			if (usernames.get(i).equals(username)){
				return "Account exist already!";
			}
		}

		//append usernames with username and append passwords with password, return 0
		usernames.add(username);
		passwords.add(password);

		return "Account created!";

	}

	public int Load(){

		try{
			File logins = new File("login.txt");
			if (logins.exists()){
				FileReader fr = new FileReader(logins);
				BufferedReader br = new BufferedReader(fr);

				String line;
				while ((line = br.readLine()) != null){
					usernames.add(line);

					if ((line = br.readLine()) != null){
						passwords.add(line);
					}else{					//if there is no password for this login the login file is invalid
						br.close();
						return 1;
					}
				}
				br.close();
				return 0;
			}else{
				logins.createNewFile();
				return 1;
			}
		}
		catch (Exception E){
			return 1;
		}
	}

	public int Save(){

		try{
			//write passwords and usernames to file, close file
			FileWriter fw = new FileWriter("login.txt");
			PrintWriter pr = new PrintWriter(fw);
			for (int i=0; i < usernames.size(); i++){
				pr.println(usernames.get(i));
				pr.println(passwords.get(i));
			}
			pr.close();
			return 0;
		}
		catch (Exception E){
			return 1;
		}
	}

	public static void main(String[] args){
		Authenticator_demo l = new Authenticator_demo();
		System.out.println(l.Authenticate("dude", "password"));
		System.out.println(l.CreateAccount("dude", "password"));
		System.out.println(l.Authenticate("dude", "wrongpw"));
		System.out.println(l.Authenticate("dude", "password"));
		System.out.println("Creating duplicate account: " + l.CreateAccount("dude", "password"));
		l.Save();
	}
}