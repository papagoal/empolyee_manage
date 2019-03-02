import java.util.ArrayList;
import java.io.*;
public class A4Q2V4{
  public static void main(String[] args)throws IOException{
  process();
  }
    public static void process()throws IOException{
     ArrayList<Employee> employees;
     
     employees = loadEmployees();
     printEmployees(employees);
     loadEmployeeProjects(employees);
     printEmployees(employees); 
       
    }
    public static ArrayList<Employee> loadEmployees()throws IOException{
      Employee a = new Employee("","");
      ArrayList<Employee> employees = new ArrayList<Employee>();
      FileReader fr = new FileReader("A4Q2in1.txt");
      BufferedReader br = new BufferedReader(fr);
      String line=br.readLine();
      while(line != null){
        employees.add(a.create(line));
        line = br.readLine();
      }
      br.close();   
      return employees;
    }
    public static void printEmployees(ArrayList<Employee> employees){
      for(int i = 0;i<employees.size();i++){
        System.out.println(employees.get(i).toString());
      }
    }
     
 public static void loadEmployeeProjects(ArrayList<Employee> employees)throws IOException {
   String proName;
   String proTitle;
   FileReader fr = new FileReader("A4Q2in2.txt");
   BufferedReader br = new BufferedReader(fr);
   String line = br.readLine();
   Employee emp = new Employee("","");
             
   while(line != null) {
     if(line.indexOf("-")==0){
       line = br.readLine();
     }
     else if(line.indexOf("P")==0){
       String[] words = line.split("\\s+");
       proName = words[0];
       proTitle = words[1];
       Project project = new Project(proName, proTitle); 
       emp.projects.add(project);
       line = br.readLine();
     }
     else if(line.indexOf("-")!=0&&line.indexOf("P")!=0){      
       for(int i = 0; i < employees.size(); i++){
         line = line.trim();
         if(line.equals(employees.get(i).name)){
           emp = employees.get(i);
         }
       }  
       line = br.readLine();
     }
   }  
   br.close();            
 }        
 
}