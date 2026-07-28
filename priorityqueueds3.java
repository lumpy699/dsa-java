/* Program No.2
Implementation of Priority Queue Datastructure (Using Max-Heap Technique)
-------------------------------------------------------------------------------------------------------------------
When Priority Queue is created using Max-Heap Technique:
Added all elements in Priority Queue are stored as: highest element is set as head (first element) and remaining all elements are in natural order.

In Min-Heap technique: Lowest element is set as head. Priority of elements is in ascending order.
In Max-Heap technique: Highest element is set as head. Priority of elements is in descending order.

Java Program to implement PriorityQueue Datastructure using Max-Heap Technique
Java Program to create the PriorityQueue (using Max-Heap Technique), to add elements in PriorityQueue, to display the PriorityQueue.
Java Program to perform following operations on Priority Queue(by applying Max-Heap technique):-
1. Create Priority Queue(using Max-Heap)
2. Add Elements in Priority Queue
(Use of add() & offer() methods) 
3. Peek the Head/First Element of Priority Queue
(Use of peek() & element() methods) 
4. Delete(Remove) the Element from Priority Queue
(Use of poll() & remove() methods)
5. Display the Priority Queue Elements in Natural Order 
6. Display the Priority Queue Elements as per Priority 
Additional Operations:
7. Count no. of elements in Priority Queue
(Use of size() method)
8. Checking whether Priority Queue is empty?
(Use of isEmpty() method)
9. Remove all elements from Priority Queue
(Use of clear() method)
10. Search an element in Priority Queue
(Use of contains() method)
*/
import java.util.PriorityQueue;
import java.util.Collections;
public class priorityqueueds3
{
    public static void main(String args[])
    {
      // 1. Creating Priority Queue of Integer Elements
      // Using Max-Heap technique (specify Collections.reverseOrder())
      PriorityQueue<Integer> pq=new PriorityQueue<Integer>(11, Collections.reverseOrder());
/*
      In Max-Heap Technique: Highest Element has Highest Priority whereas, Lowest Element has lowest Priority
      In Max-Heap: Priority is in decreasing/descending order basis.
*/

      // Adding elements in Priority Queue
      // 2. Use of Method: add()
      pq.add(40);
      pq.add(20);
      pq.add(50);
      pq.add(10);
      pq.add(30);
/*
      By default, above all elements are added in natural order.
      It means that: Highest Element is set as head(first) element and order of other elements can vary.
*/
      System.out.println("Priority Queue Elements (in Natural Order):");
      System.out.println(pq);
/*
      In above Output: Highest Element 50 appears first and then remaining elements are in natural order(order can vary) */   
       // Count number of elements in Priority Queue(Finding Queue Size)
       // 3. Use of Method: size()
       System.out.println("Number of Elements in Priority Queue: "+pq.size());

       // Checking whether Priority Queue is empty or not
       // 4. Use of Method: isEmpty()
       System.out.println("Checking Priority Queue Empty: "+pq.isEmpty()); 

      // Adding elements in Priority Queue
      // 5. Use of Method: offer()
      pq.offer(35);
      pq.offer(5);
      pq.offer(65);
      System.out.println("\nAfter offer, Priority Queue Elements (in Natural Order):");
      System.out.println(pq);
      System.out.println("Number of Elements in Priority Queue: "+pq.size());

      // Poll (Delete) Highest Priority of Element from Priority Queue
      // 6. Use of Method: poll()
      System.out.println("\nHighest Priority Element: "+pq.poll());
      int n1=pq.poll();
      System.out.println("Second Highest Priority Element: "+n1);
      System.out.println("\nAfter poll, Priority Queue Elements (in Natural Order):");
      System.out.println(pq);
      System.out.println("Number of Elements in Priority Queue: "+pq.size());

      // Remove (Delete) Highest Priority of Element from Priority Queue
      // 7. Use of Method: remove()
      System.out.println("Third Highest Priority Element: "+pq.remove());
      int n2=pq.remove();
      System.out.println("Fourth Highest Priority Element: "+n2);
      System.out.println("\nAfter remove, Priority Queue Elements (in Natural Order):");
      System.out.println(pq);
      System.out.println("Number of Elements in Priority Queue: "+pq.size());

      // Delete All Elements from Priority Queue
      // 8. Use of Method: clear()
      pq.clear();
      System.out.println("\nAfter clear, Priority Queue Elements (in Natural Order):");
      System.out.println(pq);
      System.out.println("Number of Elements in Priority Queue: "+pq.size());
      if(pq.isEmpty())
           System.out.println("Yes, Priority Queue is Empty");
      else
           System.out.println("No, Priority Queue is not Empty");

      pq.add(35);
      pq.add(55);
      pq.add(25);
      pq.add(15);
      pq.add(65);
      pq.add(45);
      System.out.println("\nCurrent Priority Queue Elements (in Natural Order):");
      System.out.println(pq);

      // Peek(Read) First Element from Priority Queue
      // 9.Use of Method: peek()
      // 10.Use of Method: element()
      System.out.println("\nPeek Element: "+pq.peek());
      System.out.println("Head Element: "+pq.element());
      int n11=pq.peek();
      int n12=pq.element();
      System.out.println("Peek Element (n11): "+n11);
      System.out.println("Head Element (n12): "+n12);

      // Search an Element in Priority Queue
      // 11. Use of Method: contains()
      System.out.println("\nSearch Element 25: "+pq.contains(25));
      System.out.println("Search Element 22: "+pq.contains(22));

/*
      To display the elements of Priority Queue on Priority Basis, we have to poll(remove) all the elements (and show) from PriorityQueue and display them.
      So use while loop till PriorityQueue is not empty.
*/
      System.out.println("\nPriority Queue Elements (According to Internal Priority of Elements):");
      while(!pq.isEmpty())
      {
         System.out.print(pq.poll()+"\t");
       }
    }
}