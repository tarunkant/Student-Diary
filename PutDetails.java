import java.util.*;
import java.io.*;

public class PutDetails{
  public ArrayList<NewStudDetail> get(NewStudDetail nsd){
    ArrayList<NewStudDetail> list=new ArrayList<NewStudDetail>();
    try{
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("Details.ser"));
      while(true){
        list.add((NewStudDetail)in.readObject());
        list.add(nsd);
      }
    }
    catch(EOFException e){
      list.add(nsd);
      return list;
    }
    catch(IOException e){
      System.out.print("An Error Occured While Reading the Files.");
      list.add(nsd);
      return list;
    }
    catch(ClassNotFoundException e){
      System.out.println("See if all files are complied");
      list.add(nsd);
      return list;
    }
  }

  public ArrayList<NewStudDetail> get(){
    ArrayList<NewStudDetail> list=new ArrayList<NewStudDetail>();
    try{
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("Details.ser"));
      while(true){
        list.add((NewStudDetail)in.readObject());
      }
    }
    catch(EOFException e){
      return list;
    }
    catch(IOException e){
      System.out.print("An Error Occured While Reading the Files.");
      System.out.println();
      return list;
    }
    catch(ClassNotFoundException e){
      System.out.println("See if all files are complied");
      System.out.println();
      return list;
    }
  }

  public void put(ArrayList<NewStudDetail> list){
    try {
         FileOutputStream fileOut =
         new FileOutputStream("Details.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         for(NewStudDetail obj:list){
            out.writeObject(obj);
          }
         out.close();
         fileOut.close();
         System.out.println();
      } catch (IOException i) {
         System.out.println("Problem with Internal Server");
      }
  }


}
