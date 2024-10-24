package palindrome;
import java.util.*;
public class Quicksort {
static int Partition(int A[],int lb, int ub) {
		int pivot=A[ub];
		int i=lb-1;
		for(int j=lb;j<ub;j++) {
			if(A[j]<=pivot) {
				i++;
				int temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}}
		int temp=A[i+1];
		A[i+1]=A[ub];
		A[ub]=temp;
		return(i+1);
			}
	static void quicksort(int A[],int lb,int ub) {

		if(lb<ub) {
			int loc=Partition(A,lb,ub);
			quicksort(A,lb,loc-1);
			quicksort(A,loc+1,ub);
		}
	}
 public static void main(String args[]) {
	 int n;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number of elements in array");
	 n=sc.nextInt();
	 System.out.println("Enter elements of array");
	 int A[]=new int[n];
	 for(int i=0;i<n;i++) {
		 A[i]=sc.nextInt();
	 }
	 System.out.println("Unsorted array:");
	 	for(int i=0;i<n;i++) {
	 		System.out.println(A[i]+"");
		}
		System.out.println("\n");
		quicksort(A,0,n-1);
	System.out.println("Sorted array:");
		for(int i=0;i<n;i++) {
			System.out.println(A[i]+"");

		}
		}
 }

