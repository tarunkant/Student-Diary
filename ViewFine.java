public class ViewFine{
  PutDetails pd = new PutDetails();
  public void showFine(String str){
    for(NewStudDetail obj:pd.get()){
      if(obj.rollno.equals(str)){
        if(obj.fine[0]!=null){
        for(int i=0;i<1;i++){
          System.out.println(obj.fine[0]+ " : " + obj.fine[1]);
        }
      }
      else{
        System.out.println("No fine yet!!!");
        System.out.println("Good Work");
      }
      }
    }
  }
}
