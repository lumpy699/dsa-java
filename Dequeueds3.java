/* Program No.2
Implementation of Deque Datastructure using deque interface that implements with LinkedList class
----------------------------------------------------------------------------------------------
Java Program to perform following operations on Deque:
1. Create the Deque 
2. Add (append) elements in Deque 
(Using add() and offer() methods)
3. Add elements in the beginning of Deque
(Using addFirst(), offerFirst(), push() methods)
4. Add elements at the end of Deque
(Using addLast() and offerLast() methods)
5. Remove first element from Deque
(Using removeFirst(), poll(), pollFirst() methods)
6. Remove last element from Deque
(Using removeLast() and pollLast() methods)
7. Get/Peek the first element of Deque
(Using getFirst(), peek(), peekFirst() methods)
8. Get/Peek the last element of Deque
(Using getLast() and peekLast() methods)
9. Display the Deque
*/
import java.util.Deque;
import java.util.LinkedList;
public class Dequeueds3
{
   public static void main(String args[])
   {
     //1. Creating Deque using Deque Interface with LinkedList class
     Deque<Integer> dq=new LinkedList<Integer>();
/*
      We can also create the Deque using ArrayDeque as:
      Deque<Integer> dq=new ArrayDeque<Integer>();
*/ 
     // 2. Use of Method: add(Object)
     // Add(append) Elements in the Deque
     dq.add(10);
     dq.add(20);
     dq.add(30);
     dq.add(40);
     dq.add(50);
     System.out.println("Deque Elements are:");
     System.out.println(dq);

     //3. Use of Method: addFirst(Object)
     //4. Use of Method: addLast(Object)
     // Adding new element at first position(at beginning) and at last position(at the end). 
     dq.addFirst(33);
     dq.addLast(44);
     System.out.println("\nAfter addFirst() & addLast(), Deque Elements are:");
     System.out.println(dq);

     //5. Use of Method: offer(Object)
     //6. Use of Method: offerFirst(Object)
     //7. Use of Method: offerLast(Object)
     // Adding new element at first position(at beginning) and at last position(at the end). 
     dq.offer(99);
     dq.offerFirst(22);
     dq.offerLast(77);
     System.out.println("\nAfter offer, Deque Elements are:");
     System.out.println(dq);

     //8. Use of Method: push(Object)
     // Push(add) element in Deque in the beginning
     dq.push(88);
     System.out.println("\nAfter push, Deque Elements are:");
     System.out.println(dq);

     //9. Use of Method: Object removeFirst()
     //10. Use of Method: Object removeLast()
     // Remove first element and remove last element from Deque
     dq.removeFirst();
     dq.removeLast();
     System.out.println("\nAfter remove, Deque Elements are:");
     System.out.println(dq);

     Integer x=dq.removeFirst();
     System.out.println("Removed First Element: "+x);
     Integer y=dq.removeLast();
     System.out.println("Removed Last Element: "+y);
     System.out.println("After remove, Deque Elements are:");
     System.out.println(dq);

     dq.addLast(55);
     dq.addLast(66);
     dq.addLast(77);
     System.out.println("\nCurrent Deque Elements are:");
     System.out.println(dq);

     //11. Use of Method: Object poll()
     // Deleting first element from Deque
     // Does not throw exception, returns null if Deque is empty.
     dq.poll();
     System.out.println("\nAfter poll, Deque Elements are:");
     System.out.println(dq);
     Integer p=dq.poll();     
     System.out.println("Polled Element: "+p);
     System.out.println("After poll, Deque Elements are:");
     System.out.println(dq);

     //12. Use of Method: Object pollFirst()
     //13. Use of Method: Object pollLast()
     // Deleting first element & last element from Deque
     dq.pollFirst();
     dq.pollLast();
     System.out.println("\nAfter pollFirst() & pollLast(), Deque Elements are:");
     System.out.println(dq);
     Integer q=dq.pollFirst();     
     Integer r=dq.pollLast();     
     System.out.println("pollFirst Element: "+q);
     System.out.println("pollLast Element: "+r);
     System.out.println("After pollFirst() & pollLast(), Deque Elements are:");
     System.out.println(dq);

     //14. Use of Method: Object getFirst()
     //15. Use of Method: Object getLast()
     // Get/Read/Access first element and last element from Deque
     // Throws exception is Deque is empty
     System.out.println("\nGet First Element: "+dq.getFirst());
     System.out.println("Get Last Element: "+dq.getLast());
     Integer n1=dq.getFirst();
     Integer n2=dq.getLast();
     System.out.println("Get First Element (n1): "+n1);
     System.out.println("Get Last Element (n2): "+n2);
     System.out.println("After get, Deque Elements are:");
     System.out.println(dq);

     //16. Use of Method: Object peek()
     //17. Use of Method: Object peekFirst()
     //18. Use of Method: Object peekLast()
     // Peek/Read first element and last element from Deque
     // Does not throws any exception even if Deque is empty
     System.out.println("\nPeek Element: "+dq.peek());
     System.out.println("Peek First Element: "+dq.peekFirst());
     System.out.println("Peek Last Element: "+dq.peekLast());
     Integer k1=dq.peek();
     Integer k2=dq.peekFirst();
     Integer k3=dq.peekLast();
     System.out.println("Peek Element (k1): "+k1);
     System.out.println("Peek First Element (k2): "+k2);
     System.out.println("Peek Last Element(k3) : "+k3);
     System.out.println("After peek, Deque Elements are:");
     System.out.println(dq);
  }
}