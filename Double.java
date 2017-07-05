import java.io.*;



public class Power {public static void main(String args[])throws IOException{
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
double n=Double.parseDouble(br.readLine());
double y=Double.parseDouble(br.readLine());
double x=(double)Math.pow(n,y);
System.out.println(x);

}
}
