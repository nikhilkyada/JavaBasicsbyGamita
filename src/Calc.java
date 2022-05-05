public class Calc {

    static Calc calc = new Calc();

    public void add(int a,int b) //with perameters
    {
        System.out.println("Addition of "+a+ " and "+b+ " is = " +(a+b));
    }
    public static void main (String arg[])
    {
//    Calc calc=new Calc();
        calc.add(5,10);
        calc.add(10,20);
        calc.add(2,2);

    }
}
