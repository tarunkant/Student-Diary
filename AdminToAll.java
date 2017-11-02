import java.io.*;
import java.util.*;

public class AdminToAll{
  public int menu4(){
    Scanner s = new Scanner(System.in);
    while(true){
        int opt=0;
        System.out.println();
        System.out.println("1. Edit Course Details");
        System.out.println("2. Add Fee");
        System.out.println("3. Add Common Fine");
        System.out.println("4. Back");
        System.out.print(">> ");
        opt=s.nextInt();
        System.out.println();
        return opt;
    }
  }
  public void run4(){
    while(true){
      int opt = menu4();
      switch(opt){
        case 1: System.out.println("Hey");
                break;
        case 2: AddFeeToAll aft = new AddFeeToAll();
                aft.getFeeToAll();
                break;
        case 3: AddCommonFine acf = new AddCommonFine();
                acf.getCommonFine();
                break;
        case 4: Admin ad = new Admin();
                ad.run3();
                break;
        default: System.out.println("Give the numbers which are present!!!");
                break;
      }
    }
  }
}
