package Multi_Threading;

class Display5{
	public void m1(String name) {
		synchronized (Display5.class){
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
class child_Thread11 extends Thread{
	Display5 d1;
	String name;
	
	public child_Thread11(Display5  d1,String name ) {
		this.d1=d1;
		this.name=name;
	}
	public void run() {
		d1.m1(name);
		
	}
	
}
public class Synchonized_block1  {

	public static void main(String[] args) {
		Display5 d4= new Display5();
		child_Thread11 t1= new child_Thread11(d4,"kunal");
		child_Thread11 t2= new child_Thread11(d4,"Yash");
		
		t1.start();
		t2.start();
	}
}


