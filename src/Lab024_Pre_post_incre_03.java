public class Lab024_Pre_post_incre_03 {
    public static void main(String[] args) {
        {
            int a = 10;
            System.out.println(++a + a++ + a++);// 34
            /* A = ++a ==> 10+1 =11==>a =11 || a = 11
             B =a++ ==> a+1=> 11+ 1==> 12=  || a = 11 then increment assign a=12
             C = a++ ==> 12==> 12+1==> a =13
             ++a = 11
             a++ = 11
             a++ = 12
             11+ 11+ 12=

            */
            System.out.println(a);//13
        }
    }
}
