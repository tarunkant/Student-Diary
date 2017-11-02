import java.util.*;

public class Admin{
  public int menu3(){
    Scanner s = new Scanner(System.in);
        int opt=0;
        System.out.println();
        System.out.println("1. Make Changes in all Students");
        System.out.println("2. Make Changes in particular Student");
        System.out.println("3. Back");
        System.out.print(">> ");
        opt=s.nextInt();
        System.out.println();
        return opt;
  }
  public int run3(){
    int opt=menu3();
    switch(opt){
      case 1: AdminToAll ata = new AdminToAll();
              ata.run4();
              break;
      case 2: AdminToParticular atp = new AdminToParticular();
              atp.run5();
              break;
      case 3: Register reg = new Register();
              reg.run();
  }
    return 0;
}
}
