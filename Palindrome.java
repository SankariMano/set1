import java.io.*;


public class Palindrome {
	public  static  void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer n=Integer.parseInt(br.readLine());
		
		String x=n.toString();
		int mid=x.length()/2;
		int midd=(x.length()-1)/2;
		String rev,revers;
		
			if(x.length()%2==0)
			{
				rev=	x.substring(0,mid);
				revers=x.substring(mid,x.length());
				
			}
			else
		  {
			rev=	x.substring(0,midd);
			revers=x.substring(midd+1,x.length());
			
		  }
			StringBuffer s=new StringBuffer(revers);
			s.reverse();
	
				if(rev.equals(s.toString()))
				{
					System.out.print("palindrome");
				}
				else
				{
					System.out.print("This is not palindrome");
				}
	}
}
