package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fio = new FileInputStream(reader.readLine());
        reader.close();
        int max = fio.read();
        while (fio.available() > 0)
        {
            int data = fio.read();
            if (data > max)
                max = data;
        }
        fio.close();
        System.out.println(max);
    }
}
