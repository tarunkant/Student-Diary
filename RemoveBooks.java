import java.util.*;

public class RemoveBooks{
  PutDetails pd = new PutDetails();
  ArrayList<NewStudDetail> al = pd.get();
  Scanner s = new Scanner(System.in);
  void removeBooks(String str){
    System.out.println("Give the Book ID");
    String id = s.nextLine();
    for(NewStudDetail obj:al){
      if(obj.rollno.equals(str)){
        for(int i=0;i<obj.book.length;i=i+2){
          if(obj.book[i]!=null){
            if(obj.book[i].equals(id)){
              obj.book[i]=null;
          }
        }
      }
        pd.put(al);
      }
    }
  }
}
