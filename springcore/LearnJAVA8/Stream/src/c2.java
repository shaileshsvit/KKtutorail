import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student> list=new ArrayList<>();

list.add(new Student("shaile",80));

list.add(new Student("shaile2",280));

list.add(new Student("shaile4",180));

list.add(new Student("shail3e",440));
	
	Stream<Student> parallelStream=list.parallelStream();
	parallelStream.forEach(s->doProcess(s));
	
	}

	private static void doProcess(Student s) {
		// TODO Auto-generated method stub

	System.out.println(s);
	}
	

}
