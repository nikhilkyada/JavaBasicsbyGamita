public class Calculator {

    //static variables or Globle Variable
    static int A =10;
    static int B =5;

    //Addition
    public static void addition(){
        System.out.println("Addition of "+ A +" and "+ B +" = "+(A + B));
    }

    //Subtraction
    public static void sub(){
        System.out.println("Subtraction of "+ A +" and "+ B +" = "+(A - B));
    }

    //Multiplication
    public static void multiplication(){
        System.out.println("Multiplication of "+ A +" and "+ B +" = "+(A * B));
    }
    //Division
    public static void divide(){
        System.out.println("Division of "+ A +" and "+ B +" = "+(A / B));
    }

    //Main method
    public static void main (String[] args){
addition();
addition();
sub();
multiplication();
divide();

    }

}
