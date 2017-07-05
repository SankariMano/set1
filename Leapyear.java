import java.util.*;
public class Leapyear {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	Integer n=s.nextInt();
	if(n%4==0||n%400==0||n%100==0)
	{
		System.out.println("Leap year");
	}
	else 
		System.out.println(n+" is not a Leap year");
}
}
