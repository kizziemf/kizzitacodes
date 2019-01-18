import java.util.Scanner;
import java.lang.Math;
public class CirCum {
    public static void main(String[] args) {

        //String input="";
        System.out.println("Enter a radius");
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();


        //double radius = scan.nextDouble();
        double area = (Math.PI * (radius*radius));
        area = Math.round(area*100.0)/100.0;
        System.out.println("The area is " + area);

        double circum = Math.PI * 2*radius;
        circum = Math.round(circum*100.0)/100.0;
        System.out.println("The circumference is " + circum);

    }

}
