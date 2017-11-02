public class ViewFee{
  PutDetails pd = new PutDetails();
  public void showFee(String str){
    for(NewStudDetail obj:pd.get()){
      if(obj.rollno.equals(str)){
        for(int i=0;i<1;i++){
          System.out.println(obj.fee[0]+ " : " + obj.fee[1]);
        }
      }
    }
  }
}
