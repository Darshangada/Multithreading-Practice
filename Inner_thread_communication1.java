package Multi_Threading;


	class child_thread2 extends Thread{
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

	public class Inner_thread_communication1 {

		public static void main(String[] args) throws InterruptedException {
			child_thread2 t1=new child_thread2();
			t1.start();
			synchronized (t1){
			System.out.println("Main_Thread is calling wait method");
			t1.wait();
			System.out.println("main_thread got Notification");
			System.out.println(t1.total);
			}
		}
	}

		
