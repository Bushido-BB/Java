import java.io.*;
class cw_buddy_pairs{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.println(buddy(381,4318));
    }
    public static String buddy(long start, long limit) {
        for(long n=start;n<=limit;n++)
        {
          long sn=0;
          for(long i=1;i<n;i++)
          {
            if(n%i==0){sn+=i;}
          }
          long m=sn-1; 
          if(m>n){
              long sm=0;
              for(long i=1;i<m;i++)
              {
                if(i%m==0){sm+=i;}
              }
              System.out.println("Sn:"+sn+" n:"+n+"   Sm:"+sm+" m:"+m);
              if(sm==n+1)
              {
                return ("["+n+", "+m+"]");
              }
          }
        }
        return "Nothing";
    }
}