package Ex01;
import java.util.Scanner;

// Create an algorithm that reads the values of A, B, C and then prints the
// sum between A and B on the screen and shows whether the sum is less than C.

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of A: ");
        float A = scan.nextFloat();
        System.out.println("Enter the value of B: ");
        float B = scan.nextFloat();
        System.out.println("Enter the value of C: ");
        float C = scan.nextFloat();

        float sum = A + B;
        if(sum > C){
            System.out.printf("The result of A + B is %.2f", sum);
        } else if(sum < C){
            System.out.printf("The result of A + B is %.2f and it's less than C", sum);
        } else {
            System.out.printf("The result of A + B is %.2f and it's equal to C", sum);
        }
    }
}