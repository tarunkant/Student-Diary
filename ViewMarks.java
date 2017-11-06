public class ViewMarks{
  PutDetails pd = new PutDetails();
  void putMarks(String str){
    for(NewStudDetail obj:pd.get()){
      if(obj.rollno.equals(str)){
        System.out.println("Sl. No.\t\tCourse Code\t\tMarks");
        System.out.println("-------\t\t-----------\t\t-----");
        for(int i=0;i<obj.arr.length;i++){
          if(obj.arr[i]!=null){
              System.out.println(i+1+"\t\t"+obj.arr[i]+"\t\t"+obj.marks[i]);
          }
        }
      }
    }
  }
}
