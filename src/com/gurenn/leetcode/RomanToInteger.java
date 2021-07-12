package com.gurenn.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author gurenn
 * @date 2021/7/12 15:26
 * @description 13. Roman to Integer
 */
public class RomanToInteger {

    static Map<Character, Integer> roman = new HashMap<Character, Integer>(){{
        put('I' , 1);
        put('V' , 5);
        put('X' , 10);
        put('L' , 50);
        put('C' , 100);
        put('D' , 500);
        put('M' , 1000);
    }};

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
    public static int romanToInt(String s) {
        int res = roman.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (roman.get(s.charAt(i)) > roman.get(s.charAt(i - 1))) {
                res += roman.get(s.charAt(i)) - roman.get(s.charAt(i - 1)) * 2;
            } else {
                res += roman.get(s.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            String s = input.nextLine();
            System.out.println(romanToInt(s));
        }
    }
}
