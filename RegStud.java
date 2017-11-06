import java.util.*;

public class RegStud{
  public int menu2(){
    Scanner s = new Scanner(System.in);
    while(true){
        int opt=0;
        System.out.println();
        System.out.println("1.  View Full Courses Details");
        System.out.println("2.  Add & Update Courses");
        System.out.println("3.  View Courses");
        System.out.println("4.  View Marks");
        System.out.println("5.  View Your Conselor");
        System.out.println("6.  View Fee Details");
        System.out.println("7.  Issued Books");
        System.out.println("8.  View Personal info");
        System.out.println("9.  Update Personal info");
        System.out.println("10. Due Fine");
        System.out.println("11. View Achievements");
        System.out.println("12. Back");
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
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("Hey " + obj.name +  " Welcome to Your Account");
        System.out.println("----------------------------------------------");
        break;
      }
    }
    if(count==1){
    while(true){
      int opt = menu2();
      switch(opt){
        case 1: ViewCourseDetails vcd = new ViewCourseDetails();
                vcd.putCourseDetails(str);
                break;
        case 2: AddCourse ac = new AddCourse();
                ac.getCourse(str);
                break;
        case 3: ViewCourse vc = new ViewCourse(str);
                break;
        case 4: ViewMarks vm = new ViewMarks();
                vm.putMarks(str);
                break;
        case 5: ViewCounselor vcl = new ViewCounselor();
                vcl.putCounselor(str);
                break;
        case 6: ViewFee vfe = new ViewFee();
                vfe.showFee(str);
                break;
        case 7: ViewIssuedBooks vib = new ViewIssuedBooks();
                vib.putIssuedBooks(str);
                break;
        case 8: ViewPersonalInfo vpi = new ViewPersonalInfo();
                vpi.putInfo(str);
                break;
        case 9: UpdatePersonalInfo upi = new UpdatePersonalInfo();
                upi.getInfo(str);
                break;
        case 10: ViewFine vf = new ViewFine();
                vf.showFine(str);
                break;
        case 11: ViewAchievement va = new ViewAchievement();
                va.putAchievement(str);
                break;
        case 12: Register reg = new Register();
                reg.run();
        default: System.out.println("Give the numbers which are present!!!");
                break;
      }
    }
  }
  else{
    System.out.println("Please Register first.");
  }
}

}
