package com.example.codingtest.a07_july.day_28;

/*1. 문자 찾기
주어진 문자열에 문자 하나가 얼마나 들어있는지 출려하세요.(대소문자 구분 하지 않습니다.)
> 함수
 - toUpperCase
 - Character.toUpperCase
 */

import java.util.Scanner;

public class P01_FindString {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        input1 = input1.toUpperCase();
        Character input2 = in.next().charAt(0);
        input2 = Character.toUpperCase(input2);
        Integer result = 0;
        for(int i=0; i<input1.length(); i++ ){
            Character one = input1.charAt(i);
            if(input2.equals(one)){
                result++;
            }
        }
        System.out.println(result);
    }
}
