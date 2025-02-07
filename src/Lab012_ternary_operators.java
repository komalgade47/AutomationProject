public class Lab012_ternary_operators {
    public static void main ( String [] arg)
    {
        int a = 10;
        int b = 20;
        String result = a>b ? "10 is greater than 20":"20 is greater than 10";
        // a> b is condition here
        // "10 is greater than 20" is expected output when condition is true
        // "20 is greater than 10" is expected output when condition is false
        System.out.println(result);
    }
}
