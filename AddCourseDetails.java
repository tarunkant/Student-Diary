import java.util.*;

public class AddCourseDetails{
  PutDetails pd = new PutDetails();
  Scanner s = new Scanner(System.in);
  Scanner t = new Scanner(System.in);
  ArrayList<NewStudDetail> al = pd.get();
  NewStudDetail nsd = new NewStudDetail();

  void addDetails(){
    System.out.println("How many courses you want to add : ");
    int c = s.nextInt();
    int j=0;
    for(int i=0;i<c;i++){
      System.out.println();
      System.out.print("Course Code >  ");
      nsd.coursedetails[j] = t.nextLine();
      System.out.print("Credits >  ");
      nsd.coursedetails[j+1] = t.nextLine();
      j = j+2;
    }
    for(NewStudDetail obj:al){
      for(int i=0;i<nsd.coursedetails.length;i++){
        obj.coursedetails[i] = nsd.coursedetails[i];
      }
    }
    pd.put(al);
  }
}
