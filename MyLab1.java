import java.util.Scanner;
public class MyLab1 {

    public static void main(String[] args) {
        String input = " ";
        System.out.println("Enter a word");
        Scanner scan = new Scanner (System.in);
        input = scan.nextLine();

        int length = input.length();
        System.out.println("The length of "+ input + " is " +length);

    }
}
