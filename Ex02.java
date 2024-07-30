import java.util.Scanner;

// Create an algorithm to receive any number and print on the
// screen whether the number is even or odd, positive or negative.

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        float number = scan.nextFloat();

        if(number %2 == 0 && number > 0){
            System.out.printf("%.2f is even and positive", number);
        } else if(number %2 == 0 && number < 0){
            System.out.printf("%.2f is even and negative", number);
        } else if(number %2 != 0 && number > 0){
            System.out.printf("%.2f is odd and positive", number);
        } else if(number %2 != 0 && number < 0){
            System.out.printf("%.2f is odd and negative", number);
        } else {
            System.out.println("Enter a valid value");
        }
    }
}
