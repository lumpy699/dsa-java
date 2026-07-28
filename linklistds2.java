
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class linklistds2 {
    public static void main(String[] args) {
        
      // Creating Linked List of Integer Elements(Nodes)
     LinkedList <Integer> mylist=new LinkedList<Integer>();
     // Add(append) Elements/Nodes in the Linked List
     //1.Use of Method: add(E Element)
     mylist.add(10);
     mylist.add(20);
     mylist.add(30);
     mylist.add(40);
     mylist.add(50);
     // Display the Linked List
     System.out.println("Linked List Elements:");
     System.out.println(mylist);     

     // Add new Element in the beginning & in the last of LinkedList
     // 2.Use of Method: addFirst(E Element)
     // 3.Use of Method: addLast(E Element)
     mylist.addFirst(77);
     mylist.addLast(99);
     System.out.println("\nAfter addFirst, addLast: Linked List Elements:");
     System.out.println(mylist);


     // Insert new Element in LinkedList
     // 4.Use of Method: add(int index,E Element)
     mylist.add(4,33);
     mylist.add(2,15);
     System.out.println("\nAfter insert: Linked List Elements:");
     System.out.println(mylist);     

     // Read/get First, Last & Particular Element from Linked List
     // 5.Use of Method: getFirst()
     // 6.Use of Method: getLast()
     // 7.Use of Method: get(int index)
     System.out.println("\nGet First Element: "+mylist.getFirst());
     int n1=mylist.getFirst();
     System.out.println("Get First Element: "+n1);
     System.out.println("Get Last Element: "+mylist.getLast());
     int n2=mylist.getLast();
     System.out.println("Get Last Element: "+n2);
     System.out.println("Get Fifth Element of Index 4: "+mylist.get(4));
     int n3=mylist.get(4);
     System.out.println("Get Fifth Element of Index 4: "+n3);

     System.out.println("\nCurrent Linked List Elements:");
     System.out.println(mylist);
     
      // Remove First Element & Last Element from LinkedList
     // 8.Use of Method: removeFirst()
     // 9.Use of Method: removeLast()
     mylist.removeFirst();
     mylist.removeLast();
     System.out.println("\nAfter removeFirst, removeLast: Linked List Elements:");
     System.out.println(mylist);     
     int num1=mylist.removeFirst();
     int num2=mylist.removeLast();
     System.out.println("Deleted First Element="+num1);
     System.out.println("Deleted Last Element="+num2);
     System.out.println("Latest Linked List Elements:");
     System.out.println(mylist);     

     // Remove Particular Element from LinkedList
     // 10.Use of Method: remove(int index)
     mylist.remove(3);
     System.out.println("\nAfter remove, Linked List Elements:");
     System.out.println(mylist);     
     int num3=mylist.remove(1);
     System.out.println("Deleted Element of Index 1 is:"+num3);     

     System.out.println("Present Linked List Elements:");
     System.out.println(mylist);     

     // Add element in the First & Last of Linked List
     // Add(append) element in the Linked List using offer() method
     // 11.Use of Method: offerFirst(E Element)
     // 12.Use of Method: offerLast(E Element)
     // 13.Use of Method: offer(E Element)
     mylist.offerFirst(10);
     mylist.offerLast(60);
     mylist.offer(70);
     System.out.println("\nAfter offer, Linked List Elements:");
     System.out.println(mylist);     

     // Peek/get the First & Last element of Linked List
     // Peek/get the first element in the Linked List using peek() method      
     // 14.Use of Method: peekFirst()
     // 15.Use of Method: peekLast()
     // 16.Use of Method: peek()
     System.out.println("\nPeek element: "+mylist.peek());
     int num11=mylist.peek();
     System.out.println("Peek element: "+num11);
     System.out.println("Peek First element: "+mylist.peekFirst());
     int num12=mylist.peekFirst();
     System.out.println("Peek First element: "+num12);
     System.out.println("Peek Last element: "+mylist.peekLast());
     int num13=mylist.peekLast();
    System.out.println("Peek Last element: "+num13);
  
     System.out.println("Present Linked List Elements:");
     System.out.println(mylist);     

     // Poll/Remove the First and Last elements from Linked List
     // Poll/Delete First Element using poll() method 
     // 17.Use of Method: pollFirst()
     // 18.Use of Method: pollLast()
     // 19.Use of Method: poll()
     int num21=mylist.pollFirst();
     int num22=mylist.pollLast();
     int num23=mylist.poll();
     System.out.println("\nPoll First Element: "+num21);
     System.out.println("Poll Last Element: "+num22);
     System.out.println("Poll Element: "+num23);
     System.out.println("After poll, Linked List Elements:");
     System.out.println(mylist); 
     // Push (Add) element in the Linked List in the beginning
     // Pop (Delete) the first element from Linked List 
     // 20.Use of Method: push(E Element)
     // 21.Use of Method: pop()
     mylist.push(22);
     mylist.push(11);
     System.out.println("\nAfter push, Linked List Elements:");
     System.out.println(mylist);     
     int num31=mylist.pop();
     System.out.println("Pop Element: "+num31);     
     System.out.println("After pop, Linked List Elements:");
     System.out.println(mylist);     

     mylist.add(22);
     mylist.add(30);
     mylist.add(70);
     mylist.add(22);
     mylist.add(80);
     System.out.println("\nPresent Linked List Elements:");
     System.out.println(mylist); 

     // Remove First & Last Occurrence of Particular Element from Linked List
     // 22.Use of Method: removeFirstOccurrence(E Element)
     // 23.Use of Method: removeLastOccurrence(E Element)
     mylist.removeFirstOccurrence(30);    
     mylist.removeLastOccurrence(22);    
     System.out.println("\nAfter removeOccurrence, Linked List Elements:");
     System.out.println(mylist); 

     // Reverse the Linked List     
     // 24.Use of Method: Collections.reverse(list)
     Collections.reverse(mylist);
     System.out.println("\nAfter reverse, Linked List Elements:");
     System.out.println(mylist); 

     // Sort the elements of Linked List     
     // 25.Use of Method: Collections.sort(list)
     Collections.sort(mylist);
     System.out.println("\nAfter sort, Linked List Elements:");
     System.out.println(mylist); 

     // Sort the elements of Linked List in descending order    
     // 26.Use of Method: Collections.sort(list,Collections.reverseOrder())
     Collections.sort(mylist,Collections.reverseOrder());
     System.out.println("\nAfter descending Sort, Linked List Elements:");
     System.out.println(mylist); 

     // Creating Sub List of Linked List
     // 27.Use of Method: subList(int startIndex,int endIndex)
     System.out.println("\nSub List: "+mylist.subList(1,4));
     List<Integer> sub=mylist.subList(2,6);
     System.out.println("Sub List(2,6): "+sub);    

    }
    
}
