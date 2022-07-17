package funinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class c6 {

	public static void main(String[] args) {
	
List<Integer> numbers=Arrays.asList(4,8,55,100);
numbers.forEach(System.out::println);
	
List<Double> result=c6.findsq(numbers,Integer::new);
result.forEach(System.out::println);

	}
	
	public static List<Double> findsq(List<Integer> nums,Function<Integer,Integer> f) {
		List<Double> results=new ArrayList<>();
     nums.forEach(x->results.add(Math.sqrt(f.apply(x))));
	return results;
	}
}
