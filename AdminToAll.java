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
        System.out.println("4. exit");
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
        case 1: System.out.println("Hey");;
                break;
        case 2: System.out.println("I");
                break;
        case 3: System.out.println("am");;
                break;
        case 4: System.out.println("Tarun");;
                break;
        default: System.out.println("Under Construction");
                 break;
      }
    }
  }
}
