public class ViewPersonalInfo{
  PutDetails pd = new PutDetails();
  void putInfo(String str){
    for(NewStudDetail obj:pd.get()){
        if(obj.rollno.equals(str)){
          System.out.println("Branch\t\tHome Address\t\tMobile No\t");
          System.out.println("------\t\t------------\t\t----------\t");
          System.out.println(obj.branch+"\t\t"+obj.homeaddr+"\t\t\t"+obj.mobileno+"\t");
          break;
        }
    }

  }
}
