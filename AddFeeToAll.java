import java.io.*;
import java.util.*;

public class AddFeeToAll{
  PutDetails pd = new PutDetails();
  Scanner s = new Scanner(System.in);
  ArrayList<NewStudDetail> al = pd.get();
  void getFeeToAll(){
    System.out.println("Give Description : ");
    String str1 = s.nextLine();
    System.out.println("How Much Fee : ");
    String str2 = s.nextLine();
    for(NewStudDetail obj:al){
      obj.fee[0] = str1;
      obj.fee[1] = str2;
    }
    pd.put(al);
}

  }
