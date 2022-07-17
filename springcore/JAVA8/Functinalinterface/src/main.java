
public class main {
public static void main(String[] args) {
	extracted();
}

private static void extracted() {
	Runnable r=new Runnable() {
		@Override
		public void run() {
			System.out.println("this is runnablemethod");
		}
	};
	
	Thread th=new Thread(r);
	th.start();
}
}
