package funinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students=new ArrayList<>();
		students.add(new Student("shailesh",88));

		students.add(new Student("kaiilesh",22));
		students.add(new Student("paililesh",33));
	
	students.forEach((s)->System.out.println(s));
	students.forEach(System.out::println);
	}

}
class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}
