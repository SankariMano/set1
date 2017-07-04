package sankari;
import java.io.*;

public class Vowels {

public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
String a[]={"a","e","i","o","u","A","E","I","O","U"};
if(s=="a")
System.out.println("Vowels");
else
System.out.println("alphabets");
}
}


