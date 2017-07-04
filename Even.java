
import java.io.*;
public class Even {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer n=Integer.parseInt(br.readLine());
		if(n%2==0)
		System.out.println("even");
		else
		System.out.println("odd");
		

	}

}
