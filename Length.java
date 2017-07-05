import java.io.*;

public class Length {
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
Integer n=Integer.parseInt(br.readLine());
String x = n.toString();
Integer y=x.length();
System.out.println(y);
}
}
