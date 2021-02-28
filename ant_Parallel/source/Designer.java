
 public class Designer
 {
    int count;
  public void designLayout()throws Exception
   {
     while(true)
    {
       if(count > 3) break;
       System.out.println("\n Designer is designing the layout...");  
       Thread.sleep(1500);
       count++;
    }
     
   }

public static void main(String args[])throws Exception
   {
        new Designer().designLayout();
   }

} 