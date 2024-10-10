package palindrome;
import java.util.*;
import java.io.*;
public class ReadWrite {
	public static void main(String args[]) {
		try {
			Scanner me=new Scanner(System.in);
			File obj= new File("Register1.txt");
			obj.createNewFile();
			System.out.println("Register1.txt created \n");
			FileWriter fw=new FileWriter("Register1.txt");
			System.out.println("Enter your KEAM Rank:");
			int n=me.nextInt();
			fw.write(n+"\n");
			fw.close();
			System.out.println("Data Added");
			FileReader fr=new FileReader("Register1.txt");
			BufferedReader br=new BufferedReader(fr);
			String str;
			System.out.println("Content of Register1.txt is:");
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
			me.close();
			fr.close();
		}catch(IOException e) {
			System.out.println("Error:"+e.getMessage());
		}
	}

}