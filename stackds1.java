//progarm for stack  data  structure
//using  Stack collection  class 
import java.util.Stack;

public class stackds1 {
    public static void main(String[] args) {
        //creatindg stack  to  store  integer  number
        Stack<Integer> stk1=new Stack<Integer>();
        //push (add)element  in  stack
        stk1.push(10);
        stk1.push(20);
        stk1.push(30);
        stk1.push(40);
        stk1.push(50);
        //display  the  stack
        System.out.println("stack  element  are  shon below");
        System.out.println(stk1);

         //creatindg stack  to  store  strings
        Stack<String> stk2=new Stack<String>();
        //push (add)element  in  stack
        stk2.push("sanket");
        stk2.push("apeksha ");
        stk2.push("gayatri");
        stk2.push("sanika");
        stk2.push("tejaswi");
        //display  the  stack
        System.out.println("stack  element  are  shown below");
        System.out.println(stk2);




    }
    
}
