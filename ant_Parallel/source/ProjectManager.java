
 public class ProjectManager
 {
    int count;
  public void implement()throws Exception
   {
     while(true)
    {
       if(count > 6) break;
      System.out.println("\n ProjectManager is implementing the project with programmers...");  
       Thread.sleep(1500);
       count++;
    }
     
   }

public static void main(String args[])throws Exception
   {
        new ProjectManager().implement();
   }

} 