public class Area_of_Circle {
    //Globle Variables--------------------------------------------------------------
    static double r = 3.6; //Radius of Circle
    static double Pi = 3.14; //Pi value

    //radius----------------------------------
    public static void radius() {
        System.out.println("Redius of the Circle is " + r + " ");
    }
    //area--------------------------------------------
    public static void area(){
        System.out.println("The area of the Circle is "+(Pi*(r*r))+" ");
    }

    //Main Method============================================================================================
    public static void main(String args[]) {
        radius();
        area();
    }
}