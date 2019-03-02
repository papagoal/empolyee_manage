import java.util.ArrayList;
import java.io.*;
public class A4Q1V5{
  public static void main(String[] args)throws IOException{
    
    processValue();
  }//main
  public static void processValue()throws IOException{
    ArrayList<Integer> list;
    list = loadValues();
    printValue(list);
    deletDuplicateValues(list);
    printValue(list);
    
  }
  public static ArrayList<Integer> loadValues()throws IOException{
    ArrayList<Integer> list = new ArrayList<Integer>();
    FileReader fr = new FileReader("A4Q1in.txt");
    BufferedReader br = new BufferedReader(fr);
    String line=br.readLine();;
    int num;
    while(line != null){
      num = Integer.parseInt(line);
      list.add(num);
      line = br.readLine();
    }
    br.close();
    
    return list;
  }
  public static void printValue(ArrayList<Integer> list){
    System.out.print("{");
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i));
      if(i!=list.size()-1){
        System.out.print(", "); 
      }
    }
    System.out.println("}");
  }
  
  public static void deletDuplicateValues(ArrayList<Integer> list){
    for(int i=0; i<list.size()-1;i++){
      for(int j=i+1; j<list.size();j++){
        if(list.get(i)-list.get(j)==0){
          list.remove(j);
          j--;       
        }
      }  
    }
  
  }
  
  
}
                  
                  