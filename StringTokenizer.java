package palindrome;
import java.util.*;
public class StringToken {
public static void main(String args[]) {
	int n,sum=0;
	Scanner me=new Scanner(System.in);
	System.out.println("Enter your integers with 1 space gap: ");
	String str= me.nextLine();
	StringTokenizer st = new StringTokenizer(str," ");
	while(st.hasMoreTokens()) {
		String a=st.nextToken();
		n=Integer.parseInt(a);
		System.out.println(n);
		sum+=n;
	}
	System.out.println("Sum is:"+sum);
	me.close();
}
}
