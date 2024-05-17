package Multi_Threading;

class child_thread1 extends Thread{
	int total=0;
	public void run() {
		for(int i=1;i<=50;i++) {
			total=total+i;
		}
	}
}

public class Inner_thread_communication {

	public static void main(String[] args) {
		child_thread1 t1=new child_thread1();
		t1.start();
		System.out.println(t1.total);
	}
}
