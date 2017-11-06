import java.util.*;

public class AddMarks{
  PutDetails pd = new PutDetails();
  Scanner s = new Scanner(System.in);
  ArrayList<NewStudDetail> al = pd.get();
  void addMarks(String str){
    for(NewStudDetail obj:al){
      if(obj.rollno.equals(str)){
        for(int i=0;i<obj.arr.length;i++){
          if(obj.arr[i]!=null){
            System.out.println();
            System.out.println("Put the marks");
            System.out.println("For:  " + obj.arr[i]);
            System.out.print("marks>  ");
            String a = s.nextLine();
            obj.marks[i] = a;
          }
        }
        pd.put(al);
      }
    }
  }
}
