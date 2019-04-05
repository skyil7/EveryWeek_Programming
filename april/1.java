/*
 * Copyright (c) 2019. Code By Gio paik
 */


import java.util.HashMap;

public class Algorithm {

    /*

    정수 배열과 타겟 숫자가 주어지면, 합이 타겟값이 되는 두 원소의 인덱스를 찾으시오.

    단, 시간복잡도 O(n) 여야 합니다.

    Given an array of integers and a target integer, find two indexes of the array element that sums to the target number.
    Time complexity must O(n)

    ex)
    예제)

    Input: [2, 5, 6, 1, 10], target 8

    Output: [0, 2] // array[0] + array[2] = 8

     */

    public static void main(String arga[]) {
        int array[] = {2, 5, 6, 1, 10};
        int target = 8;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            int look = target - array[i];
            if (map.containsKey(look)) {
                System.out.printf("[%d, %d]", map.get(look), i);
                break;
            } else {
                map.put(array[i], i);
            }
        }
    }

}
