import java.io.*;

public class Prime {
	public  static  void main(String args[]) throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Integer n=Integer.parseInt(br.readLine());
	int flag=0;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
	System.out.println(n+" is not a prime num");	
	}else
	{
		System.out.println(n+" is  a prime num");	
	}

}
}
