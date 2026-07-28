/*program for linkedhashmap  collection class(needed  for graph  implementation )
program to  store course name  and course fees of all corses codected in  pravara  rural collage in  key value paired  format   */
import java.util.LinkedHashMap;
public class linkedhashmapdemo {
public static void main(String[] args) {
    LinkedHashMap<Integer,String> course= new LinkedHashMap<Integer,String>();  //key  is  unic ti  repete hot nehi 

    course.put("FE com",120000);
    course.put("Se IT",21000);
    course.put("SE mach" ,120000);
    course.put("bE it" ,130000);
   
    System.out.println("elements of hashmap(student  data)are  shown below");
    System.out.println(course);

    


}
    
}
