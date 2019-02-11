//pract 1 To print the name
import java.io.*;
class PrintName{
    public static void main(String args[])throws IOException{
        String name;
        System.out.println("Enter your name here...");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        name=br.readLine();
        for(int i=1;i<=100;i++){
            System.out.print("#");
            System.out.print(i%10==0?"\n":"");
        }
        System.out.println("Welcome "+name);
    }
}