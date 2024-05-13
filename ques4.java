package Question4;

import java.util.ArrayList;
import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        for (int i=0;i<size;i++){
            System.out.println("Enter the Alphabet: ");
            numbers.add(sc.next());
        }
        System.out.println(numbers);

    }
}