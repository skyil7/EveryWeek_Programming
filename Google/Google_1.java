public class test {

    /*
    정렬되지 않은 정수 배열과 정수 S가 주어졌을 때, 합이 S가 되는 정수 배열 내의 두 수를 찾으시오.
    Given an unaligned integer array and an integer S, find two numbers in the integer array whose sum is S.

    Input : [8,7,2,5,3,1], S= 10
    Output : Index 0 and 2 (8+2) or Index 1 and 4 (7+3)

    Google's Answer : https://youtu.be/XKu_SEDAykw

     */

    public static void main(String args[]) {
        int array[] = {8, 7, 2, 5, 3, 1};
        int S = 10;
        int flag = 0;
        String print = "";

        for (int i = 0; i < array.length; i++) {
            int looking = 10 - array[i];
            for (int g = i + 1; g < array.length; g++) {
                if (array[g] == looking) {
                    if (flag == 0)
                        print = "Index " + i + " and " + g + " (" + array[i] + "+" + array[g] + ")";
                    else
                        print = print + " or Index " + i + " and " + g + " (" + array[i] + "+" + array[g] + ")";
                    flag++;
                }
            }
        }
        System.out.println(print);
    }

}
