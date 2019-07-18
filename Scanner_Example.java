import java.util.Scanner;
 import java.util.Locale; // see below
public class Scanner_Example {
public static void main(String[] args) {

         // If locale is Polish, floating point numbers
         // have to be entered with c o m m a as the
        // decimal separator. Locale can be changed to,
         // e.g., American, by uncommenting the line below:
         // Locale.setDefault(Locale.US);
        // (then the dot is is used as decimal separator).
        // When reading data, any nonempty sequence of
         // white characters is treated as a separator.

         Locale.setDefault(Locale.US);
         Scanner scan = new Scanner(System.in);

        System.out.println("Enter an int, a string " +
                 "and two double's");
         int k = scan.nextInt();
         String s = scan.next();
         double x = scan.nextDouble();
         double y = scan.nextDouble();
         String burak = "text";
         String mustafa = "text2";

        System.out.println("\nEntered data:\n\nint = " +
                k + "\nString = " + s + "\ndouble1 = " +
                x + "\ndouble2 = " + y + "\n" + burak+" "+mustafa);
        scan.close();
        }
}