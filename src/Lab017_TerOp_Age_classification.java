public class Lab017_TerOp_Age_classification {
    public static void main(String[] arg)
    {
        int age = 18;

        String result= age>=18 ?((age>=65)?"Senior":"Adult"):"Minor";
        System.out.println(result);
    }

}
