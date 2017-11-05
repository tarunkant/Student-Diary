public class ViewCourse{

  public ViewCourse(String str){
  int count=0;
  int flag2=0;
  PutDetails pd = new PutDetails();
  for(NewStudDetail obj:pd.get()){
    if (obj.rollno.equals(str)){
      System.out.println("Sl.No.\t\tCourse Code\t\tCredits");
      System.out.println("------\t\t-----------\t\t-------");
      int j = 1;
      for(int i=0;i<obj.arr.length;i++){
        int flag=0;
        if(obj.arr[i]!=null){
          for(int k=0;k<obj.coursedetails.length;k=k+2){
            if(obj.coursedetails[k]!=null){
              if(obj.arr[i].equals(obj.coursedetails[k])){
                System.out.println(j+"\t\t"+obj.arr[i]+"\t\t"+obj.coursedetails[k+1]);
                count = count+1;
                flag=1;
                j = j+1;
              }

          }

        }
        if(flag==0){
          System.out.println("\t\t"+obj.arr[i]+"\t\tThis Course Code is not in the list!!!");
          flag2+=1;
        }
          }




      }
      if(flag2!=0){
        System.out.println();
        System.out.println("Please see the course details and change Course code.");
      }
      if(count==0)
          System.out.println("First Add the Courses");
      break;
    }
  }
}
}
