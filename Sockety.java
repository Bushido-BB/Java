import java.util.Scanner;
import java.io.*;
import java.net.Socket;
import java.util.*;
public class Sockety{
    Socket s;
    public static void main(String args[]){
        Sockety sockety=new Sockety();
        Scanner scn=new Scanner(System.in);
        int p;
        do{
            p=scn.nextInt();
            sockety.readSocket(p);
        }while(p>=0);
    }
    void readSocket(int port){
        try{
            this.s=new Socket("127.0.0.1",port);
            BufferedReader br=new BufferedReader(new InputStreamReader(this.s.getInputStream()));
            System.out.println(br.readLine());
            br=null;
            System.gc();
        }catch(java.net.UnknownHostException e){
            System.out.println(e);
        }catch(java.io.IOException e){
            System.out.println(e);            
        }
    }
}