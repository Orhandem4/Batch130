package day37lambda;
public class Utils {
    public static int getLengthSquare(String s){
        return s.length()*s.length();
    }
    public static boolean isNumberEven(int s){
        return s%2==0;
    }
    public static String getLastChar(String s ){
        return s.substring(s.length()-1);
    }
    public static void printInTheSameLineWithSpace(Object obj){
        System.out.println(obj + " ");
    }

    public static int getSumOfDigits(int x){
        int sum = 0;

        while (x!=0){

            sum = sum+x%10;

            x = x/10;
        }
        return sum;
    }
}