import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class exercise7 {
	public static List<Integer> number = Arrays.asList();;
    public static Stream<Integer> square = number.stream();
	
	
	public static void main(String[] args) {
	    
	    
	    square.iterate(0, n -> n + 1)
        .limit(100)
        .forEach(x -> square.add(x));
	}

}
