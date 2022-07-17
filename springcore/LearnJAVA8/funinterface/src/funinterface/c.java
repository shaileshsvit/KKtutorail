package funinterface;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		fi my1=()->{System.out.println("hello how ");};
		
	fi my=	new fi() {

			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("inside the method");
			}
			
		};
		
		my1.m1();
		my.m1();
		
		
		fi2 m1=s->System.out.println(s);
		m1.m("shailesh");
		
		fi3 m2=	(name,age)->{System.out.println(name +"\t"+age);
		System.out.println(""+age);
		};
		m2.m("shailesh", 22);
	  
		
		fi4 m3=(n1,n2)->{return n1*n2; };
		System.out.println(m3.m(67,33));
		System.out.println(m3.m(30,40));

		
	
	}

}
