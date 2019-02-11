class Static//Order of Execution: static finalize constructor etc
{
    public static void main(String a[])
    {
        System.out.println("Object Declaration");
        Static t;
        System.out.println("Object Initialization");
        t=new Static();
        System.out.println("After Completion");
        t=null;
        System.gc();
    }
    Static()
    {
        System.out.println("Constructor");
    }
    protected void finalize()
    {   
        System.out.println("Finalize");
    }
    static
    {
        System.out.println("Static Block");
    }
}