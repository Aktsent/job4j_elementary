package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        for (char i = 0; i < word.length -1; i++) {
            for (char i1 = 0; i1 < pref.length -1; i1++) {
                if (word[1] != pref[1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
