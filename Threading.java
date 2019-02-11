public class Threading{
    public static void main(String args[]){
        Threader th=new Threader();
        th.start();
    }
}
class Threader extends Thread{
    public void run(){
        for(int i=0;i<=1000;i++){
            System.out.println("I:"+i);
        }
    }
}