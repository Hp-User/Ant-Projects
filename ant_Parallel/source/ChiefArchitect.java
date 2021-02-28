
 public class ChiefArchitect
 {
    int count;
  public void anlyze()throws Exception
   {
     while(true)
    {
       if(count > 5) break;
       System.out.println("\n ChiefArchitect is analyzing the functional requirements...");  
       Thread.sleep(1500);
       count++;
    }
     
   }

public static void main(String args[])throws Exception
   {
        new ChiefArchitect().anlyze();
   }

} 