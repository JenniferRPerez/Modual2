package com.perez;

public class MyString {
    public static StringOperation contains() {
        return (targetStr, searchStr) -> targetStr.contains(searchStr);
    }

    public static StringOperation startsWith() {
        return (targetStr, searchStr) -> targetStr.startsWith(searchStr);
    }

    public static StringOperation equals() {
        return (targetStr, searchStr) -> targetStr.equals(searchStr);
    }

    public static StringOperation endsWith() {
        return (targetStr, searchStr) -> targetStr.endsWith(searchStr);
    }

    public static StringOperation fiveOrLessCharacters() {
        return (targetStr, searchStr) -> targetStr.contains(searchStr) && targetStr.length() <= 5;
    }

    public static StringOperation fiveOrMoreCharacters() {
        return (targetStr, searchStr) -> targetStr.contains(searchStr) && targetStr.length() >= 5;
    }
}
