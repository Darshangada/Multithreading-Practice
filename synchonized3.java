package Multi_Threading;

class Display3{
	public static synchronized void m1() {
		for(int i=1;i<=5;i++) {
			System.out.println("Displaying m1 method... ");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static synchronized void m2() {
		for(int i=1;i<=5;i++) {
			System.out.println("Displaying m2 method... ");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void m3() {
		for(int i=1;i<=5;i++) {
			System.out.println("Displaying m3 method... ");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public synchronized void m4() {
		for(int i=1;i<=5;i++) {
			System.out.println("Displaying m4 method... ");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
	
	public  void m5() {
		for(int i=1;i<=5;i++) {
			System.out.println("Displaying m5 method... ");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class child_Thread9 extends Thread{
	Display3 d1;
	public child_Thread9(Display3 d1) {
		this.d1=d1;
	}
	public void run() {
		d1.m1();
		
	}
	
}
class child_Thread5 extends Thread{
	Display3 d1;
	public child_Thread5(Display3 d1) {
		this.d1=d1;
	}
	public void run() {
		d1.m2();
		
	}
	
}
class child_Thread6 extends Thread{
	Display3 d1;
	public child_Thread6(Display3 d1) {
		this.d1=d1;
	}
	public void run() {
		d1.m3();
		
	}
	
}
class child_Thread7 extends Thread{
	Display3 d1;
	public child_Thread7(Display3 d1) {
		this.d1=d1;
	}
	public void run() {
		d1.m4();
		
	}
	
}
class child_Thread8 extends Thread{
	Display3 d1;
	public child_Thread8(Display3 d1) {
		this.d1=d1;
	}
	public void run() {
		d1.m5();
		
	}
	
}
public class synchonized3 {

	public static void main(String[] args) {
		Display3 D=new Display3();
		
		child_Thread9 t1 = new child_Thread9(D);
		child_Thread5 t2 = new child_Thread5(D);
		child_Thread6 t3 = new child_Thread6(D);
		child_Thread7 t4 = new child_Thread7(D);
		child_Thread8 t5 = new child_Thread8(D);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}
