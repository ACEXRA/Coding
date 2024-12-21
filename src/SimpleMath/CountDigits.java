package src.SimpleMath;

//Given a number N. Count the number of digits in N which evenly divide N.
//
//Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
public class CountDigits {
    public static void main(String[] args) {
        System.out.println(evenlyDivide(1223));
    }

    public static int evenlyDivide(int N) {
        int temp = N;
        int count = 0;
        while (temp > 0) {
            int num = temp % 10;
            if (N % num == 0) count++;
            temp /= 10;
        }
        return count;
    }
}
