import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]=new String[] {"11","AA","BB"};
		Stream<String> str=Arrays.stream(arr);
		str.forEach(System.out::println);
		Stream<String> b=Stream.of("B","Bb");
	b.forEach(System.out::println);
	
	List<String> list=new ArrayList<>();
	list.add("sharma");
	list.add("shailesh");
	Stream<String> c=list.stream();
	c.forEach(System.out::println);
	}

}
