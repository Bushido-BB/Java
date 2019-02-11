import java.io.*;
import java.util.Scanner;
class FileHandle{
    public static void main(String ar[]) throws IOException{
        FileHandle.insertInterests();
        FileHandle.showInterests();
    }
    static void showInterests(){
        new Thread(){
            public void run(){
                FileInputStream fis=null;
                try{
                    fis=new FileInputStream("Interests.dat");
                    int c;
                    System.out.println("\n\n\nReading From Interests.dat File...");
                    System.out.println("Interests are: ");
                    while((c=fis.read())!=-1){
                        System.out.print((char)c);
                    }
                    fis.close();
                }catch(Exception e){
                    System.out.println("Error:"+e);
                }finally{
                    fis=null;
                }
            }
        }.start();
    }
    static void insertInterests(){
        Scanner scn=new Scanner(System.in);
        FileOutputStream fos=null;
        try{
            fos=new FileOutputStream("Interests.dat");
            System.out.println("Enter your interests. Type 'quit' to exit interface.");
            String str="";
            while((str=scn.nextLine()).equalsIgnoreCase("quit")==false){
                fos.write((str+"\n").getBytes());
            }fos.close();
        }catch(Exception e){
            System.out.println("Error:"+e);
        }finally{
            fos=null;
        }
    }
}