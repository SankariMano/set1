import java.io.*;
public class Sri {

   String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        Integer b=Integer.parseInt(br.readLine());
        Integer mul;
        Fact cs=new Fact();
        mul=cs.fact(b);
        System.out.println(mul);
    }
    int fact (int y)
    {
        if(y>1)
        {
            return y*fact(y-1);
        }
        return 1;
    }
}
