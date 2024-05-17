package Multi_Threading;

class Display{
	public static synchronized void wish(String name) {
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

class child_Thread14 extends Thread{
	Display d;
		String name;
	
	public child_Thread14(Display d,String name) {
		
		this.d=d;
		this.name=name;			
	}
	public void run() {
		d.wish(name);
	}
	
}
public class static_Syschonised {

	public static void main(String[] args) {
		Display d1=new Display();
		Display d2=new Display();
		child_Thread14 t1 = new child_Thread14(d1,"Jivan");
		child_Thread14 t2= new child_Thread14(d2,"Darshan");
		
		t1.start();
		t2.start();
		
		
	}
}


