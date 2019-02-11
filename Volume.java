import java.util.Scanner;
class Volume{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the Length:");
        int l=scn.nextInt();
        System.out.print("Enter the Width:");
        int b=scn.nextInt();
        System.out.print("Enter the Height:");
        int h=scn.nextInt();
        Box box=new Box(l,b,h);
        System.out.print("Volume is "+box.getVolume()+" cb units");
    }
}
class Box{
    int width=0;
    int height=0;
    int length=0;
    Box(int x,int y,int z){
        length=x;
        width=y;
        height=z;
    }
    int getVolume(){
        return (length*width*height);
    }
}