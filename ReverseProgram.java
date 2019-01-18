import java.util.Scanner;
public class ReverseProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a string here");
        String input = scan.nextLine();
        String[] splitString = input.split(" ");
        String ReversedWord = "";

        for (int i = 0; i < splitString.length; i++) {
            String word = splitString[i];
            String newWord = "";
            //String reversed = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                newWord += word.charAt(j);
            }
            ReversedWord += newWord + " ";


        }
        System.out.println(ReversedWord);


        //ReverseString(input);
        //}

        /**public static void ReverseString(String input){
         String[] splitString = input.split("");
         String ReversedWord = "";

         for(int i = 0 ; i >= splitString.length-1; i++){
         String word = splitString[i];
         String newWord = "";
         String reversed = "";
         for (int j =word.length()-1; j>=0; j--)
         newWord += word.charAt(j);
         //reversed = reversed.charAt(j) + reversed+ "";
         // ReversedWord= ReversedWord + reversed;
         System.out.println(reversed);

         }

         }**/

    }
}
