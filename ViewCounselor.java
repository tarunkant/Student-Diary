public class ViewCounselor{
  PutDetails pd = new PutDetails();
  void putCounselor(String str){
    for(NewStudDetail obj:pd.get()){
      if(obj.rollno.equals(str)){
        System.out.print("Counselor Name is:\t\t");
        if(obj.counselor!=null){
          System.out.println(obj.counselor);
        }
        else{
          System.out.println("Counselor is not assigned yet!!!");
        }
      }
    }
}
}
