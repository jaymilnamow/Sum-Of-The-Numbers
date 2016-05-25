package SumOfTheNumbers;

import java.util.Scanner;

import static com.sun.tools.doclint.Entity.sum;

/**
 * Created by jaymilnamow on 5/23/16.
 */

public class SumOfTheNumbers {


    public static void main(String[] args) {
        SumOfTheNumbers sumOfTheNumbers = new SumOfTheNumbers();

        sumOfTheNumbers.sumOfLesserValues();

    }

    Scanner input = new Scanner(System.in);

    public int sumValue;

    public int sumOfLesserValues() {
        System.out.println("I'll do that simple math for you. Enter a number:");

        int numberValue = input.nextInt();

        for (int i = 0; i <= numberValue; i++) {
            sumValue += i;
        }
        System.out.println(sumValue);
        return sumValue;
    }
}
