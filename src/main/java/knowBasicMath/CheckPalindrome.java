package knowBasicMath;

public class CheckPalindrome {

    public static void main(String[] args) {
        System.out.println(palindromeNumber(123));
        System.out.println(palindromeNumber(121));
    }

    public static boolean palindromeNumber(int n){
        // Write your code here.
        //String reverseNumber = new StringBuffer(((Integer)n).toString()).reverse().toString();
        if(n == Integer.parseInt(new StringBuffer(((Integer)n).toString()).reverse().toString())) {
            return true;
        } else{
            return false;
        }
    }
}
