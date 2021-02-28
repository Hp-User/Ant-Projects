
 public class MarketingManager
 {
   int count;
  public void getBusiness()throws Exception
   {
     while(true)
    {
       if(count > 5) break;
        System.out.println("\n MarketingManager is buiding he business...");  
       Thread.sleep(1500);
       count++;
    }
     
   }

public static void main(String args[])throws Exception
   {
        new MarketingManager().getBusiness();
   }

} 