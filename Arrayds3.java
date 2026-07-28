
//vector  to  vector array list  collection from  array  list  array
import java.util.ArrayList;
public class Arrayds3 {
    public  static  void  main(String args []){
        //Creating  array using   array  list   collection 
        ArrayList<Integer> v1 =new ArrayList<Integer>();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(600);
        System.out.println("Array v1(arrayList");
        System.out.println(v1);
        //crating  array y from aaraay x
        ArrayList<Integer>v2 =new ArrayList<Integer>(v1);
        System.out.println("Array v2(arrayList");
        System.out.println(v2);

//crating  arraylist array from vector array
     ArrayList<Integer>v2 =new ArrayList<Integer>(v1);
        System.out.println("Array v2(arrayList");
        System.out.println(v2);
   
    }
}
