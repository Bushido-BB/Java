package pack;
public class PrimeNumber{
    public boolean prime(int num){
        int counter=0;
        for(int i=1;i<num;i+=2){
            if(num%i==0)counter++;
        }
        return (counter==1?true:false);
    }
}