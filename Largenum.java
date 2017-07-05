
import java.util.*;

public class Largenum {

	public static void main(String[] args) {
	 Scanner s=new Scanner (System.in);
	 Integer a,b,c,max;
	  a=s.nextInt();
	  b=s.nextInt();
	  c=s.nextInt();
	  if(a>b){
		  max=a;
	  }
	  else
	  {
		  max=b;
	  }
	  if(max<c)
	  {
		  max=c;
	  }
	 System.out.println(max);

	}

}
