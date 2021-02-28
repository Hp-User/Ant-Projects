
 public class HrManager
 {
   int count;
  public void recruit()throws Exception
   {
     while(true)
    {
       if(count > 5) break;
      System.out.println("\n HrManager is recruiting...");  
       Thread.sleep(2000);
        count++;
    }
     
   }

  public static void main(String args[])throws Exception
   {
        new HrManager().recruit();
   }

} 