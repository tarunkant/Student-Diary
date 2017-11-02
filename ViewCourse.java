public class ViewCourse{

  public ViewCourse(String str){
  int count=0;
  PutDetails pd = new PutDetails();
  for(NewStudDetail obj:pd.get()){
    if (obj.rollno.equals(str)){
      System.out.println("Sl.No.\t\tCourse Code\t");
      System.out.println("------\t\t-----------\t");
      int j = 1;
      for(String i:obj.arr){
        if(i!=null){
            System.out.print(j+"\t\t");
            System.out.println(i);
            count = count+1;
            j = j+1;
          }
      }
      if(count==0)
          System.out.println("First Add the Courses");
      break;
    }
  }
}
}
