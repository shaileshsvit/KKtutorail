package funinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class c9 {

	public static void main(String[] args) {
	int x=30;
	int y=40;
	doOperate(x, new fi6() {
		
		@Override
		public void m(int n) {
			// TODO Auto-generated method stub
	System.out.println(n+y);	 	
		}
	});
	
	doOperate(x, n->System.out.println(n+y));
		
	}
	
	private static void doOperate(int i,fi6 o) {
		o.m(i);
	}
	}
