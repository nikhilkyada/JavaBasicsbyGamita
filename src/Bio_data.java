public class Bio_data {

    //Static variables

    static String a = "Nikhil kyada"; //Name
    static String b = "25";          //Age
    static String c = "012345677890"; //Number
    static String d = "9 Manadeville Road Northolt London , UB55HE"; //Address
    static String e = "Single/Married"; //Status

    //Name-----------------------------------------------------
    public static void name() {

        System.out.println("My name is " + a + "");
    }

    //Age--------------------------------------------------
    public static void age() {
        System.out.println("I am " + b + " years old");
    }

    //Number---------------------------------------------------
    public static void number() {
        System.out.println("My Number is " + c + "");
    }

    //Address----------------------------------------------------
    public static void address() {
        System.out.println("My Home Address is " + d + "");
    }

    //Status--------------------------------------------------------
    public static void status() {
        System.out.println("I am " + e + "");
    }

    //Main Method====================================================================================================
    public static void main(String args[]) {
//        String name = "Nikhil Kyada";
//        String age = "25";
//        String number = "1234567890";
//        String status = "Signal/Married";
//
//        System.out.println("My name is " + name);
//        System.out.println("I am " + age + " years old");
//        System.out.println("My phone number is " + number);
//        System.out.println("I am " + status);}
        name();
        age();
        number();
        address();
        status();
    }


}