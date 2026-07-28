import java.util.LinkedList;
public class linklistds1 {
    public static void main(String[] args) {
        //creatingt linklist of integer number
        LinkedList<Integer> ll1=new LinkedList<Integer>();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(50);
        ll1.add(60);
        System.out.println("linkedlist  of integer value : ");
        System.out.println(ll1);



        //creatingt linklist of Float number
        LinkedList<Float> ll2=new LinkedList<Float>();
        ll2.add(5.3);
        ll2.add(4.4);
        ll2.add(3.9);
        ll2.add(40);
        ll2.add(50);
        ll2.add(60);
        System.out.println("linkedlist  of float value : ");
        System.out.println(ll2);
         
       
        //creatingt linklist of singal characters number
        LinkedList<Character> ll3=new LinkedList<Character>();
        ll3.add('a');
        ll3.add('Q');
        ll3.add('3');
        ll3.add('*');
        ll3.add('A');
        ll3.add('b');
        System.out.println("linkedlist  of character value : ");
        System.out.println(ll3);

        //creatingt linklist of  decimal(double)
        LinkedList<Double> ll4=new LinkedList<Double>();
        ll4.add(10.5);
        ll4.add(20.5);
        ll4.add(30.7);
        ll4.add(40.6);
        ll4.add(50.5);
        ll4.add(60.9);
        System.out.println("linkedlist  of integer value : ");
        System.out.println(ll4);

        //creatingt linklist of integer number
        LinkedList<String> ll5=new LinkedList<String>();
        ll5.add("yoga");
        ll5.add("sanket");
        ll5.add("SANKET");
        ll5.add("don");
        ll5.add("chota");
        ll5.add("chota");
        System.out.println("linkedlist  of String  : ");
        System.out.println(ll5);


        //creatingt linklist of  mixed   value
        LinkedList<Object> ll6=new LinkedList<Object>();
        ll6.add(25);
        ll6.add(new Integer(35));
        ll6.add(Integer obj1=new Integer ());
        ll6.add(obj1);
        ll6.add(5.3f);
        ll6.add('A');
        ll6.add(character );

        obj6.add(ll6)
             obj6.add(99.6)
             ll6.add(new Double(67.65));
             Double obj3=new Double (200.25);
             obj6.add();
             ll6.add("SAnket");
             String obj4=new String("computer enggineer");
             ll6.add();
          
        System.out.println("\r\n" + //
                        "             LinkedList of Object(mixed type  of  value): ");
        System.out.println(ll6);

    }
    
}
