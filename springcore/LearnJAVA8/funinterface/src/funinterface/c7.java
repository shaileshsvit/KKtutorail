package funinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class c7 {

	public static void main(String[] args) {
	
		List<Employee> list=new ArrayList<>();
		
		list.add( new Employee("shailesh1","a1@gmail.com", 10000));
		list.add(new Employee("bssailesh2","a2@gmail.com", 20000));
		list.add( new Employee("ahailesh3","a3@gmail.com", 30000));
		List<String> personNames=c7.getPersonName(list,Employee::getName);
		personNames.forEach(System.out::println);
	}

	private static List<String> getPersonName(List<Employee> list, Function<Employee , String > f) {
		// TODO Auto-generated method stub
		List<String> result=new ArrayList<>();
		list.forEach(n->result.add(f.apply(n)));
		return result;
	}
}
