import java.util.Date;
public class Thread1{
    public static void main(String args[]){
        new Thread(){
            public void run(){
                Threader t[]=new Threader[10];
                t[0]=new Threader("First");
                t[1]=new Threader("Second");
                t[0].setDaemon(true);
                t[1].setDaemon(true);
                t[0].start();
                t[1].start();
                do{
                    //System.out.println("First:"+t[0].getState()+"  Second:"+t[1].getState());
                    if(t[0].getState().toString().equals("RUNNABLE"))
                        t[0].setPriority(Math.min(10,t[0].getPriority()+1));
                    if(t[1].getState().toString().equals("RUNNABLE"))
                        t[1].setPriority(Math.min(10,t[1].getPriority()+1));
                    //else 
                    //    System.out.println("############");
                }while(t[0].isAlive() || t[1].isAlive());
            }
        }.start();
    }
}
class Threader extends Thread{
    static int x=1;
    Threader(String a){
        this.setName(a);
    }
    public void run(){
        for(int i=1;i<=100;i++){
            Date d=new Date();
            System.out.println(x++ +":"+this.getName()+" "+i+"% "+this.getPriority()   +" >"+d.getTime());
            this.setPriority(Math.max(1,this.getPriority()-1));
        }
    }
}