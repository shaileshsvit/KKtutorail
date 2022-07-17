package funinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class c4 {

	public static void main(String[] args) {
	
		List<Employee> list=new ArrayList<>();
		
		list.add( new Employee("shailesh1","a1@gmail.com", 10000));
		list.add(new Employee("bssailesh2","a2@gmail.com", 20000));
		list.add( new Employee("ahailesh3","a3@gmail.com", 30000));
		
		list.forEach(System.out::println);
		
		//Collections.sort(list,new EmployeeNameSorter());
		
		/*Collections.sort(list,new Comparator<Employee>() {
numbers.forEach(System.out::println);
	numbers.forEach(System.out::println);
	
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});*/
		
		Collections.sort(list,(e1,e2)->e1.getName().compareTo(e2.getName()));
		
		list.forEach(System.out::println);	
		
	}
}
