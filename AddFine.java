import java.util.*;
import java.io.*;

public class AddFine{
  PutDetails pd = new PutDetails();
  //  NewStudDetail nsd = new NewStudDetail();
  Scanner s = new Scanner(System.in);
  ArrayList<NewStudDetail> al = pd.get();
  void addFine(String str){
    for(NewStudDetail obj:al){
      if(obj.rollno.equals(str)){
        al.remove(obj);
        for(int i=0;i<2;i++){
          if(i==0){
            System.out.println("Give Description: ");
          }
          else{
            System.out.println("How Much Fine: ");
          }
          obj.fine[i] = s.nextLine();
        }
        al.add(obj);
        pd.put(al);
      }
    }
  }
}
