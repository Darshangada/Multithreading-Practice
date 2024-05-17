package Multi_Threading;

class Display1{
	public synchronized void wish(String name) {
		for(int i=1;i<=5;i++) {
			System.out.print(" Good Moring ");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name);
		}
	}
}

class child_Thread1 extends Thread{
	Display1 d;
		String name;
	
	public child_Thread1(Display1 d2,String name) {
		
		this.d=d2;
		this.name=name;			
	}
	public void run() {
		d.wish(name);
	}
	
}
public class synchonised {

	public static void main(String[] args) {
		Display1 d=new Display1();
		child_Thread1 t1 = new child_Thread1(d,"Darshan");
		child_Thread1 t2= new child_Thread1(d,"Gadakh");
		
		t1.start();
		t2.start();
		
		
	}
}

