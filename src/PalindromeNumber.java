public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        String str = Integer.toString(x);
        String reversed = new StringBuilder(str).reverse().toString();

       return str.equals(reversed);

    }


}
