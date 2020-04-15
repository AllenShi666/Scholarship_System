package data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import Role.*;

public class LoadToSys {

	private List<Student> student;
	private List<Scholarship> scholarship;
	private List<Professor> professor;
	private FileWriter csvWriter;
	
	public LoadToSys() {
	}
	
	public List<Student> LoadStudent(String fileName){
		
		student = new ArrayList<>();
		Path path = Paths.get(fileName);
		
		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.US_ASCII)){
            br.readLine();
			String line = br.readLine();
            while (line != null) {
            	String[] attributes = line.split(","); 
            	student.add(new Student(Integer.parseInt(attributes[0]),attributes[1],attributes[2],attributes[3],attributes[4],Integer.parseInt(attributes[5]),Double.parseDouble(attributes[6]),attributes[7],attributes[8]));
                line = br.readLine();     
            }                
		} catch (IOException e) {
			try {
				List<List<String>> rows = Arrays.asList(
    			    Arrays.asList("10000000", "student1@ucalgary.ca","student1","Science","Computer Science","4","3.8","1 4","1"),
    			    Arrays.asList("20000000", "student2@ucalgary.ca","student2","Engineering","Software Engineering","2","3.5","3","3"),
    			    Arrays.asList("30000000", "student3@ucalgary.ca","student3","Arts","Economic","3","2.87","2","N/A"));
				csvWriter = new FileWriter("student.csv");
				csvWriter.append("UCID");
    			csvWriter.append(",");
    			csvWriter.append("Email");
    			csvWriter.append(",");
    			csvWriter.append("Name");
    			csvWriter.append(",");
    			csvWriter.append("Faculty");
    			csvWriter.append(",");
    			csvWriter.append("Department");
    			csvWriter.append(",");
    			csvWriter.append("Year");
    			csvWriter.append(",");
    			csvWriter.append("GPA");
    			csvWriter.append(",");
    			csvWriter.append("ScholarshipApplied");
    			csvWriter.append(",");
    			csvWriter.append("ScholarshipGot");
    			csvWriter.append("\n");
    			
    			for (List<String> rowData : rows) {
    			    csvWriter.append(String.join(",", rowData));
    			    csvWriter.append("\n");
    			}
    			csvWriter.flush();
    			csvWriter.close();
    			BufferedReader br = Files.newBufferedReader(path,StandardCharsets.US_ASCII);
                br.readLine();
    			String line = br.readLine();
                while (line != null) {

                	String[] attributes = line.split(",");
                    
                    student.add(new Student(Integer.parseInt(attributes[0]),attributes[1],attributes[2],attributes[3],attributes[4],Integer.parseInt(attributes[5]),Double.parseDouble(attributes[6]),attributes[7],attributes[8]));
                    line = br.readLine();
                }
			}catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("not found");
			}		
		}
		return student;
	}
	
	public List<Professor> LoadProfessor(String fileName){
		
		professor = new ArrayList<>();
		Path path = Paths.get(fileName);
		
		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.US_ASCII)){
            br.readLine();
			String line = br.readLine();
            while (line != null) {
            	String[] attributes = line.split(","); 
                professor.add(new Professor(Integer.parseInt(attributes[0]),attributes[1],attributes[2],attributes[3],attributes[4],attributes[5]));
                line = br.readLine();     
            }                
		} catch (IOException e) {
			try {
				List<List<String>> rows = Arrays.asList(
    			    Arrays.asList("10000001", "professor1@ucalgary.ca","professor1","Science","Computer Science","10000000"),
    			    Arrays.asList("20000002", "professor2@ucalgary.ca","professor2","Engineering","Software Engineering","N/A"),
    			    Arrays.asList("30000003", "professor3@ucalgary.ca","professor3","Arts","Economic","N/A"));
				csvWriter = new FileWriter("professor.csv");
				csvWriter.append("UCID");
    			csvWriter.append(",");
    			csvWriter.append("Email");
    			csvWriter.append(",");
    			csvWriter.append("Name");
    			csvWriter.append(",");
    			csvWriter.append("Faculty");
    			csvWriter.append(",");
    			csvWriter.append("Department");
    			csvWriter.append(",");
    			csvWriter.append("nominateStudentUCID");
    			csvWriter.append("\n");
    			
    			for (List<String> rowData : rows) {
    			    csvWriter.append(String.join(",", rowData));
    			    csvWriter.append("\n");
    			}
    			csvWriter.flush();
    			csvWriter.close();
    			BufferedReader br = Files.newBufferedReader(path,StandardCharsets.US_ASCII);
                br.readLine();
    			String line = br.readLine();
                while (line != null) {

                	String[] attributes = line.split(",");
                    
                	professor.add(new Professor(Integer.parseInt(attributes[0]),attributes[1],attributes[2],attributes[3],attributes[4],attributes[5]));
                    line = br.readLine();
                }
			}catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("not found");
			}		
		}
		return professor;
	}
	
	public List<Scholarship> LoadScholarship(String fileName){
		
		scholarship = new ArrayList<>();
		Path path = Paths.get(fileName);
		
		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.US_ASCII)){
            br.readLine();
			String line = br.readLine();
            while (line != null) {
            	String[] attributes = line.split(","); 
            	scholarship.add(new Scholarship(Integer.parseInt(attributes[0]),attributes[1],attributes[2],attributes[3],Integer.parseInt(attributes[4]),Double.parseDouble(attributes[5]),Integer.parseInt(attributes[6]),Integer.parseInt(attributes[7]),Integer.parseInt(attributes[8]),attributes[9]));
                line = br.readLine();     
            }                
		} catch (IOException e) {
			try {
				List<List<String>> rows = Arrays.asList(
    			    Arrays.asList("1", "scholarship1","Science","Computer Science","4","3.8","1","1000","10","10000000"),
    			    Arrays.asList("2", "scholarship2","Arts","Economic","3","3","10","500","50","N/A"),
    			    Arrays.asList("3", "scholarship3","Engineering","Software Engineering","2","3.3","5","2000","20","20000000"),
    			    Arrays.asList("4", "scholarship4","Science","Computer Science","4","3.9","1","5000","20","N/A"),
    			    Arrays.asList("5", "scholarship5","Science","Math","2","3.5","2","1000","30","N/A"));
				csvWriter = new FileWriter("scholarship.csv");
				csvWriter.append("ID");
    			csvWriter.append(",");
    			csvWriter.append("Name");
    			csvWriter.append(",");
    			csvWriter.append("Faculty");
    			csvWriter.append(",");
    			csvWriter.append("Department");
    			csvWriter.append(",");
    			csvWriter.append("Year");
    			csvWriter.append(",");
    			csvWriter.append("GPA");
    			csvWriter.append(",");
    			csvWriter.append("NumberAvailable");
    			csvWriter.append(",");
    			csvWriter.append("Amount");    			
    			csvWriter.append(",");
    			csvWriter.append("NumberApplied");
    			csvWriter.append(",");
    			csvWriter.append("WhoGot");
    			csvWriter.append("\n");
    			
    			for (List<String> rowData : rows) {
    			    csvWriter.append(String.join(",", rowData));
    			    csvWriter.append("\n");
    			}
    			csvWriter.flush();
    			csvWriter.close();
    			BufferedReader br = Files.newBufferedReader(path,StandardCharsets.US_ASCII);
                br.readLine();
    			String line = br.readLine();
                while (line != null) {

                	String[] attributes = line.split(",");
                    
                	scholarship.add(new Scholarship(Integer.parseInt(attributes[0]),attributes[1],attributes[2],attributes[3],Integer.parseInt(attributes[4]),Double.parseDouble(attributes[5]),Integer.parseInt(attributes[6]),Integer.parseInt(attributes[7]),Integer.parseInt(attributes[8]),attributes[9]));
                    line = br.readLine();
                }
			}catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("not found");
			}		
		}
		return scholarship;
	}
	
	public static void main(String[] args) {
		LoadToSys ld = new LoadToSys();

		List<Student> a = ld.LoadStudent("student.csv");
		System.out.println(a.toString());
		List<Professor> b = ld.LoadProfessor("professor.csv");
		System.out.println(b.toString());
		List<Scholarship> c = ld.LoadScholarship("scholarship.csv");
		System.out.println(c.toString());
	}
}
