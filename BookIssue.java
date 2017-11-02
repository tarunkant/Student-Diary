import java.util.*;
import java.io.*;

public class BookIssue{
  PutDetails pd = new PutDetails();
  Scanner s = new Scanner(System.in);
  ArrayList<NewStudDetail> al = pd.get();
  int count=0;
  void getBook(String str){
    for(NewStudDetail obj:al){
      if(obj.rollno.equals(str)){
        for(int i=0;i<obj.book.length;i=i+2){
          if(obj.book[i]==null){
            if(count<1){
              for(int j=i;j<i+2;j++){
                if(j==i){
                  System.out.println("Give Book ID: ");
                }
                else{
                  System.out.println("Give Book Name: ");
                }
                obj.book[j] = s.nextLine();
                count++;
            }
        }

        }
          pd.put(al);
      }
    }
    }
  }
}
