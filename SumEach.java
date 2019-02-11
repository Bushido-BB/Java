class SumEach{
    public static void main(String args[]){
        Double sum=0d;
        for(String x:args){
            sum+=Double.parseDouble(x);
        }
        System.out.println("Sum of numbers is "+sum);
    }
}