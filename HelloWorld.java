import java.util.*;
import java.util.stream.Collectors;


public class HelloWorld{
 
      public static void main(String []args){
         
    String input = "BANNANA";
    String result ="";
    for (int i = 0; i < input.length(); i++) {
        if(!result.contains(String.valueOf(input.charAt(i)))) {
            result += String.valueOf(input.charAt(i));
        }
    }
        System.out.println(result);
        
        
        
        String noDuplicates = "";
        String myString = "BANNANA";
        
        noDuplicates = Arrays.asList(myString.split(""))
                     .stream()
                     .distinct()
                     .collect(Collectors.joining());
                     
                     System.out.println(noDuplicates);
        
        
        
     }
}
