package palindrome;
import java.util.*;
class Table {
	public void printTable(int n) {
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				System.out.println(n+"*"+i+"="+(n*i));
				try{
					Thread.sleep(400);
				}catch(Throwable e) {
					System.out.println(e);
				}
			}
		}
		
	}
}
class Mythread extends Thread{
	Table t;
	int n;
	Mythread(Table t){
		this.t=t;
	}public void run() {
		t.printTable(n);
	}
}
class Mythread1 extends Thread{
	Table t;
	int n;
	Mythread1(Table t){
		this.t=t;
	}public void run() {
		t.printTable(n);
	}
}
public class ThreadSynchronization {
public static void main(String args[]) {
	Table obj=new Table();
	Scanner sc=new Scanner(System.in);
	Mythread t1=new Mythread(obj);
	Mythread1 t2=new Mythread1(obj);
	System.out.println("Enter the number whose table you want to run by thread 1:");
	t1.n=sc.nextInt();
	System.out.println("Enter the number whose table you want to run by thread 2:");
	t2.n=sc.nextInt();
	t1.start();
	t2.start();
}
}
