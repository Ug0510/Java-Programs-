#Java Program to Print an Integer (Entered by the User)
  
import java.util.Scanner;

class FirstProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered "+num);
    }
}
