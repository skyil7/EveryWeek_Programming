import java.util.Arrays;
import java.util.HashSet;

public class test {

/*

    정렬되지 않은 정수 배열과 정수 S가 주어졌을 때, 합이 S가 되는 정수 배열 내의 두 수를 찾으시오.(단, 시간복잡도 O(n)로)
    Given an unaligned integer array and an integer S, find two numbers in the integer array whose sum is S.(The time complexity must O(n))

    Input : [8,7,2,5,3,1], S= 10
    Output : 8 + 2 7 + 3

 */

    public static void main(String args[]) {
        int array[] = {8, 7, 2, 5, 3, 1};
        int S = 10;

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {//HashSet.contains() method's time complexity is 1
                System.out.printf("%d + %d\t", S - array[i], array[i]);
            } else {
                set.add(S - array[i]);
            }
        }
    }
}
