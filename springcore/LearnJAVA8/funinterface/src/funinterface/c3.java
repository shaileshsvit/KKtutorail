package funinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Map<Integer,Employee> map=new HashMap<>();
	map.put(190, new Employee("shailesh1","a1@gmail.com", 10000));
	map.put(190, new Employee("shailesh2","a2@gmail.com", 20000));
	map.put(190, new Employee("shailesh3","a3@gmail.com", 30000));
	
	Set<Entry<Integer,Employee>> entrySet=map.entrySet();
	
	for(Entry<Integer,Employee> entry:entrySet) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	
	System.out.println("-------------------");
	Set<Integer> keys=map.keySet();
	for(Integer key:keys) {
		System.out.println(key);
		System.out.println(map.get(key));
	}
	map.forEach((k,v)->System.out.println(k+"\t"+v));
	}
	
	//map.forEach((k,v))
	//map.forEach((k,v)->System.out.println(k+"\t"+v));
	
}
