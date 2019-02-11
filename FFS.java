import java.io.*;
class FFS{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    boolean showMenu() throws IOException{
        System.out.println("\nChoose an Option:\n1.Fatorial\n2.Fibonacci\n3.Square\n");
        int opt=Integer.parseInt(br.readLine());
        switch(opt){
            case 1:
                factorial();break;
            case 2:
                fibonacci();break;
            case 3:
                square();break;
            default:
                System.out.print("GoodBye!");
                return false;
        }
        System.out.println();
        return true;
    }
    void factorial() throws IOException{
        System.out.println("Enter a Number:");
        int saved;
        int num=saved=Integer.parseInt(br.readLine());
        int fact=1;
        while(num!=0){
            fact*=num;
            num--;
        }
        System.out.print(saved+"!="+fact);
    }
    void fibonacci() throws IOException{
        System.out.println("Enter limit for Series:");
        int limit=Integer.parseInt(br.readLine());
        int i=0,j=1;
        while(i<=limit){
            System.out.print(i+" ");
            j=(i+(i=j));
        }
    }
    void square() throws IOException{
        System.out.println("Enter a Number:");
        double num=Double.parseDouble(br.readLine());
        System.out.println(num+"^2="+(num*num));
    }
    public static void main(String array[]){
        FFS obj=new FFS();
        try{
        while(obj.showMenu());
        }
        catch(Exception e){}
    }
}