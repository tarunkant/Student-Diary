import java.io.*;
import java.util.*;

public class AddCommonFine{
  PutDetails pd = new PutDetails();
  Scanner s = new Scanner(System.in);
  ArrayList<NewStudDetail> al = pd.get();
  void getCommonFine(){
      System.out.println("Give Description : ");
      String str1 = s.nextLine();
      System.out.println("How Much Fine : ");
      String str2 = s.nextLine();
      for(NewStudDetail obj:al){
        obj.fine[0] = str1;
        obj.fine[1] = str2;
      }
      pd.put(al);
  }
}
