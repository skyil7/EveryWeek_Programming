import java.util.Scanner;

public class test {

/*
피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다. 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.

Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers.
Given an integer N, find the sum of all even fibonacci numbers.

Ex)

Input: N = 12

Output: 10 // 0, 1, 2, 3, 5, 8 So, 2 + 8 = 10.

Input: N = 35

Output: // 0, 1, 2, 3, 5, 8, 13, 21, 34 So, 2 + 8 + 34 = 44

 */

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N = ");
        int N = scan.nextInt();

        int fibonacci[] = new int[100];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        int i = 1;
        while (fibonacci[i] < N) {
            fibonacci[i + 1] = fibonacci[i - 1] + fibonacci[i];
            i++;
        }

        int sum = 0;

        for (int j = 2; j < i; j++) {
            if (fibonacci[j] % 2 == 0)
                sum += fibonacci[j];
        }

        System.out.println(sum);
    }

}
