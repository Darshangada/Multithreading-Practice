package Multi_Threading;

class Display2{
	public synchronized void star() {
		for(int i=1;i<=5;i++) {
			System.out.println("Displaying star... ");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void moon() {
		for(int i=1;i<=5;i++) {
			System.out.println("Displaying moon... ");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public  void sun() {
		for(int i=1;i<=5;i++) {
			System.out.println("Displaying sun... ");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class child_Thread2 extends Thread{
	Display2 d;
	
	public child_Thread2(Display2 d2) {
		
		this.d=d2;
	
	}
	public void run() {
		d.star();
		
	}
	
}

class child_Thread3 extends Thread{
	Display2 d;
	
	public child_Thread3(Display2 d2) {
		
		this.d=d2;
	
	}
	public void run() {
		d.moon();
		
	}
	
}

class child_Thread4 extends Thread{
	Display2 d;
	
	public child_Thread4(Display2 d2) {
		
		this.d=d2;
	
	}
	public void run() {
		d.sun();
		
	}
	
}


public class Synchonized2 {

	public static void main(String[] args) {
		Display2 d= new Display2();
		
		child_Thread2 t1= new child_Thread2(d); 
		child_Thread3 t2= new child_Thread3(d); 
		child_Thread4 t3= new child_Thread4(d); 
		t1.start();
		t2.start();
		t3.start();
	}
	
}
