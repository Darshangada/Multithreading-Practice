package Multi_Threading;



class child_thread5 extends Thread{
	int total=0;
	public void run() {
		synchronized(this) {
		
		System.out.println("chilr_thread start claculating.....");
		for(int i=1;i<=50;i++) {
			total=total+i;
			}
		System.out.println("chilr_thread giving notification call");
	
		}
	}
}


public class Inner_thread_communication3 {

	public static void main(String[] args) throws InterruptedException {
		child_thread5 t1=new child_thread5();
		t1.start();
		t1.sleep(10000);
		synchronized (t1){
		 System.out.println("Main_Thread is calling wait method");
		 t1.wait(10000);
		 System.out.println("main_thread got Notification");
		 System.out.println(t1.total);
		}
	}
}
