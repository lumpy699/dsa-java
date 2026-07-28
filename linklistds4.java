import java.util.LinkedList;
public class linklistds4 {
    public static void main(String[] args) {
         

        //creating  frist linkedlist
        LinkedList <String> xlist=new LinkedList<String>();
      xlist.add("Anita");
        xlist.add("sunita");
        
       xlist .add("kavata");
        
      xlist.add("nikita");
        
      xlist.add("babita");
        
   xlist.add("dipika ");



            System.out.println("frist linkedlist element are:)");
        for(int i=xlist.size(-1); i>=0; i--)
        {
         System.out.print(+xlist.get());   


          //creating  second linkedlist
        LinkedList <String> ylist=new LinkedList<String>();
      ylist.add("mukesh");
        xlist.add("ram");
        
       ylist .add("shysm");
        
      ylist.add("tom");
        
      ylist.add("ganesh");
        
   ylist.add("suresh ");



            System.out.println("\n second linkedlist element are:)");
        for(int i=ylist.size(-1); i>=0; i--)
        {
         System.out.print(ylist.get());
         
         //code  for  to merge  second  linkedlist  into  frist  linkedlist

         for(int i=0;i<ylist.size();i++)
         {
            xlist.add(ylist(i));

            //print merged linklist(frist linkedlist  after  add)
             System.out.println("\nresult of  merging  two  linkedlist:");
        for(int i=xlist.size(-1); i>=0; i--)
        {
         System.out.print(+xlist.get());   
         }
        }
       
    }
    
}

    
}
