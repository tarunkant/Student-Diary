import java.util.*;

public class UpdateMarks{
  PutDetails pd = new PutDetails();
  Scanner s = new Scanner(System.in);
  ArrayList<NewStudDetail> al = pd.get();
  void updateMarks(String str){
    for(NewStudDetail obj:al){
      if(obj.rollno.equals(str)){
        System.out.print("Give Course Code:   ");
        String temp = s.nextLine();
        for(String i:obj.arr){
          if(i!=null){
            if(i.equals(temp)){
              int a = Arrays.asList(obj.arr).indexOf(i);
              System.out.print("marks >   ");
              obj.marks[a] = s.nextLine();
            }
        }
        }
      }
      pd.put(al);
    }
  }
}
