public class Lab016_TerOp_max_in_3 {
    public static void main(String[] arg)
    {
        int n1=20, n2=10,n3=30;
        int max = (n1>=n2)? ((n1>=n3)?n1:n3): ((n2>=n3)?n2:n3);
//20>10

        System.out.println(max);

    }
}
