import java.util.LinkedList;
import java.util.Stack;
public class linkedlistds4 {
    public static void main(String[] args) {
        //creating  linkedlist
        LinkedList<Integer> ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        ll.add(10);
        ll.add(10);
        System.out.println("Linkedlist element :");
         System.out.println(ll);

         //creating  the   stack  and  push  element  of  likedlist  into  stack
         Stack<Integer> stk =new Stack<Integer>();
         int num;
          //yaha  per  wrong  ho  gaya  he 
        for(int i=0;i<ll.size();i++)    {
                 num=ll.get(i);
        stk.push(num);

        //pop the  iteams from stack  on  display  on  the  screen  , still   stack  is  not  empty
  System.out.println("Linkedlist element in  revese  order (using  stack) :");
         while(!stk.empty())
         {
              System.out.println("stk.pop ()"+\t);
         System.out.println(ll);

         }

 
            } 
          


    
    }
    
}
