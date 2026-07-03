package others;

/*
Source: docs/lectures/others/data-sturcture-lab-1.pdf (page 16 of 37)
Created by ali_h on 7/3/2026 at 2:41 PM
*/

import java.util.Scanner;

public class PushPopPrintInStack {


    static void push(int[] st, int[] top) {
        Scanner sc = new Scanner(System.in);
        if (top[0] == 5) {
            System.out.println("overflow");
        } else {
            System.out.print("Enter item: ");
            int item = sc.nextInt();

            top[0]++; // increment value
            st[top[0]] = item; // enter the item
        }
    }

    static void pop(int[] st, int[] top) {
        if (top[0] == -1) {
            System.out.println("underflow");
        } else {
            int item = st[top[0]];
            top[0]--;
        }
    }

    static void printST(int[] st, int top) {
        for (int i = top; i >= 0; i--) {
            System.out.println(st[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] st = new int[6];
        int[] top = {-1};
        int x;

        do {
            System.out.println("1-push");
            System.out.println("2-pop");
            System.out.println("3-printst");
            System.out.println("4-exit");
            System.out.print("enter your choice: ");

            x = input.nextInt();

            switch (x) {
                case 1:
                    push(st, top);
                    break;
                case 2:
                    pop(st, top);
                    break;
                case 3:
                    printST(st, top[0]);
                    break;
                case 4:
                    System.out.println("exit...");
                    break;
                default:
                    System.out.println("invalid choice");
            }

        } while (x != 4);
    }

}
