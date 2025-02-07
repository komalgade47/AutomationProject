public class Lab013_Nested_ternary_grade_cal {
   public static void main( String [] arg )
   {
       float a =80;
       String output= (a<= 100 && a > 89) ? "A Grade" : ((a<= 89 && a > 79) ? "B Grade" : ((a<=79 && a > 69) ? "C Grade" : ((a<=69 && a > 59) ? "D Grade" : ((a<= 59 && a > 0) ? "Fail" : "Invalid Input"))));
       System.out.println(output);
   }
}
