package Multi_Threading;

class Display4{
	public void m1(String name) {
		synchronized (this){
		for(int i=1;i<=10;i++) {
			
			
			
			System.out.print("Good Afternoon ");
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
}
class child_Thread10 extends Thread{
	Display4 d1;
	String name;
	
	public child_Thread10(Display4  d1,String name ) {
		this.d1=d1;
		this.name=name;
	}
	public void run() {
		d1.m1(name);
		
	}
	
}
public class Synchonised_block {

	public static void main(String[] args) {
		Display4 d4= new Display4();
		child_Thread10 t1= new child_Thread10(d4,"kunal");
		child_Thread10 t2= new child_Thread10(d4,"Yash");
		
		t1.start();
		t2.start();
	}
}
