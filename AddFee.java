import java.util.*;

public class AddFee{
  PutDetails pd = new PutDetails();
  Scanner s = new Scanner(System.in);
  ArrayList<NewStudDetail> al = pd.get();
  void addFee(String str){
    for(NewStudDetail obj:al){
      if(obj.rollno.equals(str)){
        al.remove(obj);
        for(int i=0;i<2;i++){
          if(i==0){
            System.out.println("Give Description: ");
          }
          else{
            System.out.println("How Much Fee: ");
          }
          obj.fee[i] = s.nextLine();
        }
        al.add(obj);
        pd.put(al);
      }
    }
  }

}
