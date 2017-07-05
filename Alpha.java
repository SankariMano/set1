

import java.io.*;

public class Alpha {
	public static void main (String args[])throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		char d=(char)br.read();
		
		if((d>=65&&d<=90)||(d>=97&&d<=122))
				{
			System.out.println("Alphabet");
				}else
		System.out.println("This is not Alphabet");
	
	}
}
