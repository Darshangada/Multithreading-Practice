package Multi_Threading;
class child_Thread18 extends Thread{
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("Child_thread");
			try {
				Thread.currentThread() .sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Thread.currentThread().stop();
			//hread.currentThread().resume();
		}
	
	}
}
public class stop_method {

public static void main(String[] args) throws InterruptedException {
		
		child_Thread18 obj= new child_Thread18();
		
		obj.start();
		
		for(int i=1;i<=10;i++) {
			
			
				System.out.println("Main_thread");
				Thread.currentThread().sleep(1000);
				
				if(i==3) {
					obj.suspend();
				}
			} 
			obj.resume();
			
			}
			
			
		
	}

