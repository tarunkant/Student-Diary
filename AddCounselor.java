import java.util.*;

public class AddCounselor{
    PutDetails pd = new PutDetails();
    Scanner s = new Scanner(System.in);
    ArrayList<NewStudDetail> al = pd.get();

    void setCounselor(String str){
      for(NewStudDetail obj:al){
        if(obj.rollno.equals(str)){
          System.out.println("Give the Counselor Name: ");
          obj.counselor = s.nextLine();
          pd.put(al);
        }
      }
    }
}
