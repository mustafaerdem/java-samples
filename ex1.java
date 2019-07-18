package Tasks04;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 1, remaining = 0, total =0 , last_total = 0,last_number=0;
        while(number>0) {
            System.out.print("enter a natural number= ");
            number = input.nextInt();

            if(number==0)
                break;
            last_number=number;
            while (number > 0) {

            remaining = number % 10;
            number = number / 10;
            total += remaining;
        }

        if (total > last_total) {
            last_total = total;

            total = 0;
            number=1;
            remaining = 0;

        } else if (total < last_total || total==last_total) {
            remaining = 0;
            total=0;
            last_number=0;
            number=1;
        }
    }
        System.out.println("Max sum of digits was "+last_total+" for "+last_number);

    }
    }


