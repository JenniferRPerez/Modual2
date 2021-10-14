package com.perez;

public class Main {

    public static void main(String[] args) {
        String[] strList = {"humor", "monkey", "mo", "hello", "famous", "clamor", "limo", "diamond", "tomorrow", "mom", "alamo", "heat"};
        String searchFor = "mo";
        System.out.println("Searching for: " + searchFor);

        for (String str : strList) {
            if (MyString.startsWith().analyze(str, searchFor)) {
                System.out.println("Match: " + str);
            }
        }
    }
}
