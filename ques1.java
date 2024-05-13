package ques1;

import java.util.ArrayList;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of number: ");
        int size = sc.nextInt();

        for (int i=0;i<size;i++){
            System.out.println("Enter the numbers: ");
            numbers.add(sc.nextInt());
        }
        System.out.println(numbers);

        int count = 0;
        System.out.println("Enter the number to be searched: ");
        int value = sc.nextInt();

        for(int num : numbers)
            if( num == value) {
                count++;
            }

        System.out.println("Count :" + count);
    }

}