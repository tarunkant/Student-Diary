import java.util.*;

public class RegStud{
  public int menu2(){
    Scanner s = new Scanner(System.in);
    while(true){
        int opt=0;
        System.out.println();
        System.out.println("1. Add & Update Courses");
        System.out.println("2. View Courses");
        System.out.println("3. View Course Details");
        System.out.println("4. View Fee Details");
        System.out.println("5. Issued Books");
        System.out.println("6. View Personal info");
        System.out.println("7. Update Personal info");
        System.out.println("8. Due Fine");
        System.out.println("9. View Achievements");
        System.out.println("10. exit");
        System.out.print(">> ");
        opt=s.nextInt();
        System.out.println();
        return opt;
    }
  }
  public void run2(){
    int count=0;
    Scanner s = new Scanner(System.in);
    System.out.println("Give Your Roll no.: ");
    String str = s.nextLine();
    if(str.equals("admin")){
      Admin admin = new Admin();
      admin.run3();
    }
    PutDetails pd = new PutDetails();
    for(NewStudDetail obj:pd.get()){
      if (obj.rollno.equals(str)){
        count = count + 1;
        break;
      }
    }
    if(count==1){
    while(true){
      int opt = menu2();
      switch(opt){
        case 1: AddCourse ac = new AddCourse();
                ac.getCourse(str);
                break;
        case 2: ViewCourse vc = new ViewCourse(str);
                break;
        case 4: ViewFee vfe = new ViewFee();
                vfe.showFee(str);
                break;
        case 6: ViewPersonalInfo vpi = new ViewPersonalInfo();
                vpi.putInfo(str);
                break;
        case 7: UpdatePersonalInfo upi = new UpdatePersonalInfo();
                upi.getInfo(str);
                break;
        case 8: ViewFine vf = new ViewFine();
                vf.showFine(str);
                break;
        case 9: ViewAchievement va = new ViewAchievement();
                va.putAchievement(str);
                break;
        default: System.out.println("Under Construction");
                 break;
      }
    }
  }
  else{
    System.out.println("Please Register first.");
  }
}

}
