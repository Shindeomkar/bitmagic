package bitmagic;

import java.util.Scanner;

public class CountSetBits {
    static int countSetBits(int num) {
        int count = 0;
        for (int i = 1; i < 32; i++) {
            if ((num & 1) == 1)
                count++;
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        num = sc.nextInt();
        int result = countSetBits(num);
        System.out.println("no of set bits=" + result);
    }
}