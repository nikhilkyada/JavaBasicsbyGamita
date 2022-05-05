public class Marks {
    //Static variables-----------------------------
    static int maths = 40;
    static int english = 60;
    static int hindi = 80;
    static int out = 100; //Subject Obtained
    static int all = 3 * out; //All Subject Total

    //Maths------------------------------------------------------------
    public static void maths() {

        System.out.println("Maths      =" + maths + "/" + out);
    }

    //English----------------------------------------------------------
    public static void english() {

        System.out.println("Eng.       =" + english + "/" + out);
    }

    //Hindi-----------------------------------------------------------------
    public static void hindi() {

        System.out.println("Hindi      =" + hindi + "/" + out);
    }

    //Total------------------------------------------------------------------
    public static void total() {

        System.out.println("Total      =" + (maths + english + hindi) + "/" + all);
    }

    //Percentage---------------------------------------------------------------
    public static void percentage() {

        System.out.println("Percentage =" + ((maths + english + hindi) / 3) + "%");
    }


    //Main Method======================================================================================================
    public static void main(String[] args) {
        maths();
        english();
        hindi();
        total();
        percentage();

    }

}