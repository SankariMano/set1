import java.io.*;

public class Even {
	public  static  void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer a=Integer.parseInt(br.readLine());
		Integer b=Integer.parseInt(br.readLine());
		int flag=0;
		for(int i=a;i<=b;i++)
		{
			if(i%2 ==0)
			{
				System.out.println(i);
				flag=1;
			}
		}
		
			
		
}
}
