public class Project{
 protected String name;
 protected String title;
 public Project(String name, String title){
   this.name = name;
   this.title = title;
 }
 public String toString(){
   
  String str = name +", "+title; 
  return str;
 }
}