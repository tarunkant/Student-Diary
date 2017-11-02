import java.util.*;
import java.io.*;

public class UpdatePersonalInfo{
  PutDetails pd = new PutDetails();
  ArrayList<NewStudDetail> al1 = pd.get();

  void getInfo(String str){
      Scanner s = new Scanner(System.in);
      for(NewStudDetail nsd:al1){
        if(nsd.rollno.equals(str)){

          al1.remove(nsd);

          System.out.println("Branch Name: ");
          nsd.branch = s.next();
          System.out.println();
          System.out.println("Home Address: ");
          nsd.homeaddr = s.next();
          System.out.println();
          System.out.println("Mobile Number: ");
          nsd.mobileno = s.next();


          al1.add(nsd);

          pd.put(al1);
  }
}
}
}
