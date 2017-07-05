import java.io.*;

public class Odd {
	public  static  void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer a=Integer.parseInt(br.readLine());
		Integer b=Integer.parseInt(br.readLine());
		int flag=0;
		for(int i=a;i<=b;i++)
		{
			if(a%2 !=0)
			{
				flag=1;
			}
		}
		if(flag==1)
			System.out.println()
		System.out.println("Interval is odd");
		else
		System.out.println("Interval is not odd");

}
}
