import java.util.Scanner;
class Assignment2{
    public static void main(String args[]){
        Threader th1=new Threader("First");
        Threader th2=new Threader("Second");
        th1.start();
        th2.start();
    }
}
class Threader extends Thread{
    static int x;
    static int y;
    Threader(String name){
        this.setName(name);
    }
    int sum(){
        return x+y;
    }
    public void run(){
        System.out.println("Thread "+this.getName()+" is running...");
        if(this.getName().equals("First")){
            x=new Scanner(System.in).nextInt();
        }
        else if(this.getName().equals("Second")){
            y=new Scanner(System.in).nextInt();
            System.out.println("Sum is :"+sum());
        }
    }
}