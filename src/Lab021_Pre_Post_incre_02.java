public class Lab021_Pre_Post_incre_02 {
    public static void main(String[] args)
    {
        int a=20;
        int b= (++a + ++a);
        /* (A + B)
        A = ++a = 20+1 =21|| now a=21 increment first and then assign
        B = ++a = 21+1 = 22|| as te value of a gets updates to 21 as per row 8
        A + B = 21+22= 43==>b
        A + B = 21+22= 43==>b
        a= 22
        */

        System.out.println(b);
        System.out.println(a)  ;
    }
}
