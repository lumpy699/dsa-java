/*program to  perform core  operations  on linear queue 
-using Queue interface  that  implement with  linkedlist  class or  arraydeque  class
-program to perform following  operation  on Queue (linear queue ) data structure 

V


/*
Implementation of Priority Queue data structure using java
Implementing Priority queue  data structure using PriorityQueue class And max heap technique
*/


import java.util.Queue;
import java.util.LinkedList;
public class LinearQueueds3
{
   public static void main(String args[])
   {
//1. Creating Linear Queue using LinkedList
     Queue<Integer> q=new LinkedList<Integer>();

//2. add(Object)
// Adding(append) Elements in the Queue
     q.add(10);
     q.add(20);
     q.add(30);
     q.add(40);
     System.out.println("Queue Elements are:");
     System.out.println(q);

//3. offer(Object)
// Adding Elements in the Queue through rear end.
     q.offer(55);
     System.out.println(q);

//4. poll(Object)
// Deleting Element from the Queue through front end.
     q.poll();
     System.out.println(q);
     Integer x=q.poll();
     System.out.println("x= "+x);
     System.out.println(q);

//5. remove()
// Deleting Element from the Queue through front end.
     q.remove();
     System.out.println(q);
     Integer y=q.remove();
     System.out.println("y="+y);
     System.out.println(q);
    
//6. peek()
// Accesing fronth(1st) element from Queue
     System.out.println("Peek Element: "+q.peek());
     Integer z=q.peek();
     System.out.println("z="+z);   
     System.out.println(q);

//7. element()
// Accesing fronth(1st) element from Queue
     System.out.println("Element: "+q.element());
     Integer w=q.element();
     System.out.println("w="+w);
     System.out.println(q);

     System.out.println("Testing:");
     System.out.println("Size=" +q.size());
     System.out.println("isEmpty=" +q.isEmpty());
     q.add(65);
     q.add(75);
     q.add(85);
     System.out.println(q);
  }
}


 