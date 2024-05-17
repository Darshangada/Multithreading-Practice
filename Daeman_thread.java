package Multi_Threading;

class child_Thread17 extends Thread{
	public void run() {
		
		for(int i=1;i<=5;i++) {
			//System.out.println("Child_thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Daeman_thread {

	public static void main(String[] args) {
		
		child_Thread17 obj= new child_Thread17();
		obj.setDaemon(true);
		obj.start();
		
		for(int i=1;i<=3;i++) {
			System.out.println("Main_thread");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
