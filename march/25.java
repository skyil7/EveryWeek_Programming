/*
 * Copyright (c) 2019. Code By Gio paik
 */


import java.util.HashMap;
import java.util.Scanner;

public class Algorithm {

    /*

    정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오. 팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나 같은 단어를 말합니다. 단, 정수를 문자열로 바꾸면 안됩니다.
    Given an integer, check if it is a palindrome. Without casting integer to string.

    예제)
    ex)

    Input: 12345
    Output: False

    Input: -101
    Output: False

    Input: 11111
    Output: True

    Input: 12421
    ﻿Output: True
     */

    public static void main(String arga[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int leng = (int) Math.log10(n) + 1;

        boolean flag = true;

        if (n < 0) {
            flag = false;
        }

        int t = leng;

        while (flag) {
            int num1 = (int)(n/(Math.pow(10,leng-t))%10);
            int num2 = (int)(n/(Math.pow(10,t-1))%10);
            if (num1 != num2) {//숫자 비교
                flag = false;
            }
            t--;
            if (t == 0) {
                break;
            }
        }

        System.out.println(flag);
    }

}
