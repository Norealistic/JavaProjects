package ru.mephi.lab1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class words {
    public static void main(String[] args){
        System.out.println("Enther the string");
        Scanner in = new Scanner(System.in);
        String[] string = in.nextLine().split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String syl: string){
            Object value = map.get(syl);
            map.put(syl, (value==null) ? 1 : ((int)value+1));
            
        }
    }
}
