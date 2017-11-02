import java.io.*;

public class AddNewStud{

  public AddNewStud(NewStudDetail nsd){

    PutDetails pd = new PutDetails();

    pd.put(pd.get(nsd));
    System.out.printf("You are now added, Go to the Regular and add your courses");
    System.out.println();
    Register reg = new Register();
    reg.run();
  }

}
