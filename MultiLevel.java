public class MultiLevel{
    public static void main(String args[]){
        Son kid=new Son();
        kid.showDNAReport();
    }
}
class GrandFather{
    void showTraits(){
        System.out.print("Caring, Polite, ");
    }
}
class Father extends GrandFather{
    void showTraits(){
        super.showTraits();
        System.out.print("Hard Working, Responsible, ");
    }
}
class Son extends Father{
    void showTraits(){
        super.showTraits();
        System.out.println("Fast Learner, Programmer!");
    }
    void showDNAReport(){
        System.out.print("Your son is ");
        showTraits();
    }
}