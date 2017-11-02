import java.util.*;

public class UpdateRollNumber{
  PutDetails pd = new PutDetails();
  Scanner s = new Scanner(System.in);
  ArrayList<NewStudDetail> al = pd.get();
  void getNewRoll(String str){
    for(NewStudDetail obj:al){
      if(obj.rollno.equals(str)){
        System.out.println("Give New Roll Number: ");
        al.remove(obj);
        obj.rollno = s.nextLine();
        al.add(obj);
        pd.put(al);
      }
    }
  }
}
