/*program for  hash map  collection class(needed  for graph  implementation )
program to  store  roll number and  name  of student  in  hash  map  collection  in key-value paired FORMATE */
import java.util.HashMap;
public class hashmapdemo {
public static void main(String[] args) {
    HashMap<Integer,String> stud= new HashMap<Integer,String>();  //key  is  unic ti  repete hot nehi 

    stud.put(1,"sanket");
    stud.put(2,"gayatri");
    stud.put(3,"omkar");
    stud.put(4,"shruti");
    stud.put(5,"pranav");
    stud.put(6,"pranit");
    System.out.println("elements of hashmap(student  data)are  shown below");
    System.out.println(stud);

    


}
    
}
