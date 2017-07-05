public class Sum{
public static void main(String args[])throws IOException{
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	Integer max=0;
	Integer x=Integer.parseInt(br.readLine());
	Integer n[]=new Integer[x];
	
	for(int i=0;i<x;i++){
		n[i]=Integer.parseInt(br.readLine());
		max=max+n[i];
		
	}
	System.out.println(max);
}
}
