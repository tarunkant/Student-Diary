import java.util.*;

public class AddAchievement{
  PutDetails pd = new PutDetails();
  Scanner s = new Scanner(System.in);
  String[] temp = new String[20];
  ArrayList<NewStudDetail> al = pd.get();
  public void getAchievement(String str){
    for(NewStudDetail obj:al){
      if(obj.rollno.equals(str)){
        // for(int i=0;i<obj.achievement.length;i++){
        //   temp[i] = obj.achievement[i];
        // }
        al.remove(obj);
        System.out.println("Add Achievement : ");
        String ach = s.nextLine();
        for(int i=0;i<obj.achievement.length;i++){
          if(obj.achievement[i]==null){
            obj.achievement[i] = ach;
            break;
          }
        }
        al.add(obj);
        pd.put(al);
      }
    }

  }
}
