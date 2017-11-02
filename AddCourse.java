import java.io.*;
import java.util.*;

public class AddCourse{
  public void getCourse(String str){
    Scanner s = new Scanner(System.in);
    NewStudDetail nsd = new NewStudDetail();
    PutDetails pd = new PutDetails();
    System.out.println("how many courses do you have?");
    int n = s.nextInt();
    for(int i=0;i<n;i++){
      System.out.print(i+1+": ");
      nsd.arr[i] = s.next();
  }
    ArrayList<NewStudDetail> al1 = pd.get();

    for(NewStudDetail obj:al1){
      if (obj.rollno.equals(str)){

        al1.remove(obj);

        for(int i=0;i<n;i++){
          obj.arr[i] = nsd.arr[i];
        }
        
        al1.add(obj);

        pd.put(al1);
        break;
    }
  }
}

}
