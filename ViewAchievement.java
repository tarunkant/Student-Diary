public class ViewAchievement{
  void putAchievement(String str){
    PutDetails pd = new PutDetails();
    for(NewStudDetail obj:pd.get()){
      if(obj.rollno.equals(str)){
        System.out.println("Your Achievements are: ");
        int j=1;
        int count=0;
        for(String i:obj.achievement){
          if(i!=null){
              System.out.print(j + " : ");
              System.out.println(i);
              j++;
              count = count+1;
        }
      }
      if(count==0){
        System.out.println("Sorry, You have No Achievements...Work Hard!!!");
      }
      }
    }
  }
}
