package kata.codewars;

public class BackWardsPrime {

    public static String backwardsPrime(long start, long end) {
        String result = "";
        for (long i = start; i <= end; i++) {
            if (isPrime(i) && isPrime(reverse(i)) && isNotPalindrome(i)) {
                result = result.concat(i + " ");
            }
        }
        return result.trim();
    }

    private static boolean isNotPalindrome(long i) {
        StringBuilder result = new StringBuilder(String.valueOf(i));
        return !result.toString().equals(result.reverse().toString());
    }

    private static long reverse(long val) {
        StringBuilder result = new StringBuilder(String.valueOf(val));
        result.reverse();
        return Long.parseLong(result.toString());
    }

    public static boolean isPrime(long nbr) {
        long reste;
        boolean flag = true;
        for (int i = 2; i <= nbr / 2; i++) {
            reste = nbr % i;
            if (reste == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }


}
