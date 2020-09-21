package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10 ; i++) {
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < 9 ; i++) {
            if(list.get(i+1).length() < list.get(i).length()){
                System.out.println(i+1);
                break;
            }
        }
        scanner.close();
    }
}
