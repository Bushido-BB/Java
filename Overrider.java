public class Overrider{
    public static void main(String args[]){
        System.out.println("Late for College!!!");
        TwoWheeler myvehicle=new TwoWheeler();
        myvehicle.gotoCollege();
        myvehicle=new FourWheeler();
        myvehicle.gotoCollege();
    }
}
class TwoWheeler{
    int wheels=2;
    TwoWheeler(){
        System.out.println("\nSelf-start");
    }
    void gotoCollege(){
        System.out.println("Going to college on my bike...");
    }
}
class FourWheeler extends TwoWheeler{
    FourWheeler(){
        super();
        System.out.println("Wear seat-belt");
        super.wheels=4;
    }
    void gotoCollege(){
        System.out.println("Going to college in my car...");
    }
}