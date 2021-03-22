
import java.util.Arrays;
import java.util.*;

public class RemoveParticularStringInParagraph {
	public static void main(String[] args) {
	String str = "raji is wonder raji sweety is  raji ";
	String[] splitted = str.split(" ");
    List<String> numberList2 = Arrays.asList(splitted);
    numberList2.stream().filter(nn -> !"raji".equals(nn)).forEach(System.out::println);
}
}
