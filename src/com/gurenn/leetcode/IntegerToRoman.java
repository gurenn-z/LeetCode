package com.gurenn.leetcode;

import java.util.Scanner;

/**
 * @author gurenn
 * @date 2021/7/12 10:49
 * @description 12. Integer to Roman
 */
public class IntegerToRoman {

    static String[][] roman = {
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            {"", "M", "MM", "MMM"}
    };

    /**
     * 数字 转换为 罗马字
     * I - 1
     * V - 5     ps: IV - 4
     * X - 10    ps: IX - 9
     * L - 50    ps: XL - 40
     * C - 100   ps: XC - 90
     * D - 500   ps: CD - 400
     * M - 1000  ps: CM - 900
     * 1 <= num <= 3999
     **/
    public static String intToRoman(int num) {
        String res = "";

        res += roman[3][num / 1000];
        res += roman[2][num / 100 % 10];
        res += roman[1][num / 10 % 10];
        res += roman[0][num % 10];

        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            int num = input.nextInt();
            System.out.println(intToRoman(num));
        }
    }
}
