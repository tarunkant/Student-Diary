import java.util.*;

public class NewStud{
  public void menu1(){
      NewStudDetail nsd = new NewStudDetail();
      Scanner s = new Scanner(System.in);
      PutDetails pd = new PutDetails();
      System.out.println();
      System.out.println("1. Add Roll Numner: ");
      nsd.rollno = s.nextLine();
      for(NewStudDetail obj:pd.get()){
        if(obj.rollno.equals(nsd.rollno)){
          System.out.println();
          System.out.println("This Roll Number has already Registered");
          Register reg = new Register();
          reg.run();
        }
      }
      System.out.println();
      System.out.println("2. Add Your Name: ");
      nsd.name = s.nextLine();
      System.out.println();
      System.out.println("3. Add Branch: ");
      nsd.branch = s.nextLine();
      System.out.println();
      // System.out.println("3. Add Courses: ");
      // nsd.course = s.nextLine();
      System.out.println("4. Add Home Address: ");
      nsd.homeaddr = s.nextLine();
      System.out.println();
      System.out.println("5. Add Mobile Number: ");
      nsd.mobileno = s.nextLine();
      System.out.println();
      AddNewStud ans = new AddNewStud(nsd);
      //return 1;
  }
}
