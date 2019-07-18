package Tasks01;

import java.util.Scanner;

public class Create_Triangle {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Number 1");
         a = input.nextInt();
        System.out.println("Number 2");
        b = input.nextInt();
        System.out.println("Number 3");
         c = input.nextInt();



            if(a+b>c && a+c>b && b+c>a)
            {
                System.out.print("OK");
            }
            else {
                System.out.println("NOT OK");
            }



    }
}
