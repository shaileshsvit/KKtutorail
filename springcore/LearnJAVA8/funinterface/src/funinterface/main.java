package funinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class main {
 public static void main(String[] args) {
	
List<String> list=new ArrayList<>();
list.add("shailesh");
list.add("Andrew");
list.add("billy");
//list.forEach((name)-> 		System.out.println(name ));
	list.forEach(System.out::println); 
	//extracted();
	//funcLambda();
	

 }

private static void funcLambda() {
	// TODO Auto-generated method stub
	Runnable r=()->{
		System.out.println("this is lambda expr");
	};
	Thread th=new Thread();
	th.start();
}

private static void extracted() {
	Runnable r=new Runnable() {
		
		@Override
		public void run() {
			System.out.println("this is run method");
		}
	};
Thread th=new Thread(r);
th.start();

}

 
}
