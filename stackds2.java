import java.util.Stack;
public class stackds2 {
    public static  void  main(String args[]){
        //creating  stack
            // Creating the Stack of String Elements
    Stack <String> stk2= new Stack<String>();

    // Checking whether Stack is Empty or not?
    // Use of Method: empty()
    if(stk2.empty())
       System.out.println("\nYes, Stack is Empty");    
    else
       System.out.println("\nNo, Stack is not Empty");  
    
    // Push(Add) the Elements in Stack
    // Use of Method: push()
    stk2.push("Ram");
    stk2.push("Sham");
    stk2.push("Tom");
    stk2.push("Ganesh");
    stk2.push("Suresh");
    System.out.println("Stack of String Elements:");
    System.out.println(stk2);

    // Peek the Top Element of Stack
    // Use of Method: peek()
    System.out.println("\nTopth Element: "+stk2.peek());    
    String x;
    x=stk2.peek();
    System.out.println("Peek: "+x);    

    // Checking whether Stack is Empty or not?
    // Use of Method: empty()
    if(stk2.empty())
       System.out.println("\nYes, Stack is Empty");    
    else
       System.out.println("\nNo, Stack is not Empty");
    
    

    // Search an Element in Stack
    // Use of Method: search()
    if(stk2.search("Sham") !=-1)
       System.out.println("\nYes, Sham is found/exist in the Stack, at index: "+stk2.search("Sham"));    
    else
       System.out.println("\nNo, Suresh is not found/exist in the Stack");    
    if(stk2.search("Shardul") ==-1)
       System.out.println("\nNo, Shardul is not found/exist in the Stack");    
    else
       System.out.println("\nYes, Shardul is found/exist in the Stack");    



    // Pop(Delete) the Element from Stack
    // Use of Method: pop()
    stk2.pop();
    System.out.println("\nAfter pop, Stack Elements:");
    System.out.println(stk2);

    String y=stk2.pop();
    System.out.println("\nPopped Element: "+y);
    System.out.println("\nAfter pop, Stack Elements:");
    System.out.println(stk2);
     

     




    }
    
}
