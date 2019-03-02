import java.util.ArrayList;
public class Employee {
 protected String name;
 protected String company;
 protected ArrayList<Project> projects;
 
 public Employee(String name, String company) {  
  this.name = name;
  this.company = company;
  projects = new ArrayList<Project> ();
 }
 
 public String  toString() {
  String str = "name: "+name + ", Company: " + company ;
  if(projects.size() != 0){
   str = str + ", Projects : " ;
   for(int i = 0; i<projects.size(); i++){
    str = str + "[ " +  projects.get(i).toString() + " ] ";
   }
  }   
  return str;
 }

 public static Employee create(String line) {
  line = line.trim();
  String[] words = line.split("\\s+");
  return new Employee(words[0], words[1]);
 }

}
