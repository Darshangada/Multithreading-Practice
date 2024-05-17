package Multi_Threading;

class A{
	public synchronized void Begin(B ob) throws InterruptedException
	{
		System.out.println(" Main Thread  calling begin method: ");
		Thread.sleep(2000);
		System.out.println(" Main Thread calling stop method: ");
		ob.stop();
		
	}
	
	public synchronized void stop() {
		System.out.println(" Main Thread  calling stop method");
	}
}

class B{
	public synchronized void Begin(A ob) throws InterruptedException
	{
		System.out.println(" child Thread  calling begin method: ");
		Thread.sleep(2000);
		System.out.println(" child Thread  calling stop method: ");
		ob.stop();
		
	}
	
	public synchronized void stop() {
		System.out.println(" child Thread  calling stop method");
	}
}

public class Dead_lock extends Thread{
	A obj1=new A();
	B obj2=new B();
	
	public void m1() {
		this.start();
		try {
			obj1.Begin(obj2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void run() {
		try {
			obj2.Begin(obj1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Dead_lock t1= new Dead_lock();
		t1.m1();
	}
}