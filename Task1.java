package HW2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для проверки, является ли она палиндромом: ");
        String s = scan.next();
        System.out.print(isPalindrom(s));
    }

    static boolean isPalindrom(String s) {
        s = s.toLowerCase();
        int sLen = s.length();
        int forward = 0;
        int backward = sLen - 1;
        while (backward > forward) {
            char forwardChar = s.charAt(forward++);
            char backwardChar = s.charAt(backward--);
            if (forwardChar != backwardChar) return false;
        }
        return true;
    }
}
