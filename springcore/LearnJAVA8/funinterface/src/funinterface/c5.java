package funinterface;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class c5 {

	public static void main(String[] args) {
	
ExecutorService ex=Executors.newSingleThreadExecutor()	;

Runnable r=c5::run;//()->System.out.println("this si running thread");

ex.execute(r);		
	
	
	}
	
	public static void run() {
		System.out.println("some are running");
	}
}
