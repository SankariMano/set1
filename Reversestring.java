import java.io.*;
public class Reversestring {
public static void main(String args[]) throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	StringBuffer sr=new StringBuffer(s);
	sr.reverse();
	System.out.println(sr);
}
}
