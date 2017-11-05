public class ViewCourseDetails{
  PutDetails pd = new PutDetails();
  void putCourseDetails(String str){
    for(NewStudDetail obj:pd.get()){
      if(obj.rollno.equals(str)){
        System.out.println("Course Details are: ");
        System.out.println();
        System.out.println("Sl. No.\t\tCourse Name\t\tCredits");
        System.out.println("-------\t\t-----------\t\t-------");
        int count=1;
        for(int i=0;i<obj.coursedetails.length;i=i+2){
          if(obj.coursedetails[i]!=null){
            System.out.println(count+"\t\t"+obj.coursedetails[i]+"\t\t"+obj.coursedetails[i+1]);
            count = count+1;
          }
        }
      }
    }
}
}
