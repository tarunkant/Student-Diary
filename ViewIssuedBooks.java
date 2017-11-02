public class ViewIssuedBooks{
  PutDetails pd = new PutDetails();
  void putIssuedBooks(String str){
    for(NewStudDetail obj:pd.get()){
      if(obj.rollno.equals(str)){
        System.out.println("Issued Books are: ");
        System.out.println();
        System.out.println("Sl. No.\t\tBook ID\t\tBook Name");
        System.out.println("-------\t\t-------\t\t---------");
        int j=1;
        int count=0;
        for(int i=0;i<obj.book.length;i=i+2){
          
          if(obj.book[i]!=null){
              System.out.print(j + " :\t\t");
              System.out.println(obj.book[i] + "\t\t" + obj.book[i+1]);
              j++;
              count = count+1;
        }
      }
      if(count==0){
        System.out.println("You didn't Issued any books!!!");
      }
      }
    }
  }
}
