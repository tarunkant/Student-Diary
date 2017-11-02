import java.util.*;
public class Register{
  Scanner s = new Scanner(System.in);
  public int menu(){
      int opt=0;
      System.out.println();
      System.out.println("1. New Student");
      System.out.println("2. Regular Student");
      System.out.println("3. exit");
      System.out.print(">> ");
      opt=s.nextInt();
      System.out.println();
      return opt;
  }

public int run(){
    int opt=menu();
    switch(opt){
      case 1: NewStud ns = new NewStud();
              ns.menu1();
              break;
      case 2: RegStud rs = new RegStud();
              rs.run2();
              break;
      case 3: return 1;
  }
    return 0;
}
}
