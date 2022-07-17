package funinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class c10 {

	public static void main(String[] args) {
	
		int b=90;
	
		c10.doOperate(b,new fi6() {

			@Override
			public void m(int n) {

				
				System.out.println(b+n  );
				System.out.println(this);
			}
			
			
		}
		);
		c10.doOperate(b, x->{
			System.out.println(b+x);
		});
	}

	private static void doOperate(int i, fi6 o) {
		// TODO Auto-generated method stub
	o.m(i);	
	}
	
	
	
	}
