public class Lab010_explicit_casting {
    public static void main( String [] arg)
    {
        byte a= 10;

        int b = a; // assigning larger data type to smaller data type
        //int b = (int)a;// widening can be done this way also.
        System.out.println(b);

    }
}
