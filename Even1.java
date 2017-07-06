import java.io.*;

public class Even1 {
	public  static  void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer x=Integer.parseInt(br.readLine());
		Integer y=Integer.parseInt(br.readLine());
		int flag=0;
		for(int j=x;j<=y;j++)
		{
			if(j%2 ==0)
			{
				System.out.println(j);
				
			}
		}
		
			
		
}
} 
