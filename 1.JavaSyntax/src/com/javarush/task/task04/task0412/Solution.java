package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num =0;
        num = Integer.parseInt(reader.readLine());
        reader.close();
        if(num >0){
            num = num*2;
        }
        else if(num < 0){
            num++;
        }
        System.out.println(num);

    }

}