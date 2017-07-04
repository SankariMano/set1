import java.io.*;
import java.util.*;
public class Positive{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    Integer n=Integer.parseInt(br.readLine());
    if(n==0)
    System.out.println("Zero");
    else if(n>0)
    System.out.println("Positive");

  else 
  System.out.println("Negative"); 
}
}
