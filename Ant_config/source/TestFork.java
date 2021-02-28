
 public class TestFork
 {

  public static void main(String args[])throws Exception
   {
   System.out.println("Starting....");
   //System.exit(0);  
   work();    
   }
 static void work()throws Exception
  {
  System.out.println("\n\nWorking and throwiung the error.....\n"); 
  if(true) 
   throw new Exception("This is Work Error!");
  for(;;)
     {
      System.out.println("Running the loop..."); 
      Thread.sleep(1000);
     }
  }

} 