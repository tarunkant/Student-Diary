import java.io.*;
import java.util.*;

public class AdminToParticular{
  public int menu5(){
    Scanner s = new Scanner(System.in);
    while(true){
        int opt=0;
        System.out.println();
        System.out.println("1. Add & Update Fine");
        System.out.println("2. Add & Update Fee");
        System.out.println("3. Issue Books");
        System.out.println("4. Remove Books");
        System.out.println("5. Add Achievement");
        System.out.println("6. Update Roll Number");
        System.out.println("7. Back");
        System.out.print(">> ");
        opt=s.nextInt();
        System.out.println();
        return opt;
    }
  }
  public void run5(){
    int count=0;
    Scanner s = new Scanner(System.in);
    System.out.println("Give Roll no.: ");
    String str = s.nextLine();
    PutDetails pd = new PutDetails();
    for(NewStudDetail obj:pd.get()){
      if (obj.rollno.equals(str)){
        count = count + 1;
        break;
      }
    }
    if(count==0){
      System.out.println("This Roll Number is not Registered!!!");
    }
    if(count==1){
    while(true){
      int opt = menu5();
      switch(opt){
        case 1: AddFine af = new AddFine();
                af.addFine(str);
                break;
        case 2: AddFee afe = new AddFee();
                afe.addFee(str);
                break;
        case 3: BookIssue bi = new BookIssue();
                bi.getBook(str);
                break;
        case 4: RemoveBooks rb = new RemoveBooks();
                rb.removeBooks(str);
                break;
        case 5: AddAchievement aa = new AddAchievement();
                aa.getAchievement(str);
                break;
        case 6: UpdateRollNumber urn = new UpdateRollNumber();
                urn.getNewRoll(str);
                break;
        case 7: Admin ad = new Admin();
                ad.run3();
                break;
        default: System.out.println("Give the numbers which are present!!!");
                 break;
      }
    }
    }
  }
}
