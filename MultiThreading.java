package palindrome;
import java.util.*;
class Even extends Thread{
	public int a;
	public Even(int n) {
		a=n;
	}
	public void run() {
		System.out.println("The thread "+a+" is EVEN and the square of "+a+" is: "+a*a);
}
	}
class Odd extends Thread{
	public int a;
	public Odd(int n) {
		a=n;
	}public void run() {
		System.out.println("The thread "+a+" is ODD and the cube of "+a+" is: "+a*a*a);
		
	}
}
class RandomNumGenerator extends Thread{
	public void run() {
		int n=0;
		Random r=new Random();
		try {
			for(int i=0;i<5;i++) {
				n=r.nextInt(20);
				System.out.println("Generated Number is "+n);
				if(n%2==0) {
					Thread t1=new Thread(new Even(n));
					t1.start();
				}
				else {
					Thread t2=new Thread(new Odd(n));
					t2.start();
				}
				Thread.sleep(1000);
				System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
			}
		}catch(Throwable e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
public class MultiThreading {
	public static void main(String args[]) {
		RandomNumGenerator r = new RandomNumGenerator();
		r.start();
	}
}
