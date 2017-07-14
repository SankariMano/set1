import java.io.*;

public class Swap {
	public static void  main(String args[])throws IOException
	
	{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 Integer i;
		 String s=br.readLine();
		 Character arr[]=new Character [s.length()];
		Character arr1[]=new Character[s.length()];
		 for(i=0;i<s.length()-1;i=i+2)
		 {
			 arr[i]=s.charAt(i);
			 arr1[i]=s.charAt(i+1);
		 }
		if(s.length()%2==0)
		{
		 for(i=0;i<s.length()-1;i=i+2)
		 {
			 System.out.print(arr1[i]);
			 System.out.print(arr[i]);
		 }
		 }else
	     {
			 for(int j=0;j<s.length()-2;j=j+2)
			 {  
				 
			 System.out.print(arr1[j]);
			 System.out.print(arr[j]);
			 }
			 System.out.print(s.charAt(s.length()-1));	
		 }
			
	}
}
