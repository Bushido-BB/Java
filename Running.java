public class Running{
    public static void main(String args[]){
        Thread th=new Thread(new Threader());
        th.start();
    }
}
class Threader implements Runnable{
    public void run(){
        for(int i=0;i<=1000;i++){
            System.out.println("I:"+i);
        }
    }
}