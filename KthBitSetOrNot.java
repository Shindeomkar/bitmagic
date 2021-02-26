package bitmagic;

import java.util.Scanner;

public class KthBitSetOrNot {
    static boolean isSet(int num,int k)
    {
       num= num>>(k-1);
        if((num&1)==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int num,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        num=sc.nextInt();
        System.out.println("enter k");
        k= sc.nextInt();
        if(isSet(num,k))
            System.out.println("kth bit is set");
        else
            System.out.println("kth bit is not set");
    }
}
