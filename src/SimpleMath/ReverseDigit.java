package src.SimpleMath;

public class ReverseDigit {
    public static void main(String[] args) {
        System.out.println(reverseDigit(256000));
    }

    public static long reverseDigit(long n) {
        long rev = 0;
        while (n > 0) {
            int temp = (int) n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        return rev;
    }
}
