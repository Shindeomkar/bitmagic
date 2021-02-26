package bitmagic;

import java.util.Scanner;


public class PowerOfTwo {
    static boolean powerOfTwo(int num)
    {
        if (num==0)
            return false;

        return ((num&(num-1))==0);

    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        num = sc.nextInt();
        if(powerOfTwo(num))
            System.out.println("is power of two");
        else
            System.out.println("is not power of two");
}
}
