import java.util.Scanner;

public class Ag2 {
    public int reverse(int x) {
        int min = -2147483648;
        int max = 2147483647;

        int signed = (x < 0) ? -1 : 1;
        x = Math.abs(x);

        int rev_num = 0;
       while(x != 0){
            int d = x % 10;
            rev_num = rev_num*10+ d;
            x = x /10 ;

        }
        rev_num = rev_num * signed;
        if (rev_num < min || rev_num > max) {
            return 0;
        }
        return rev_num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");
        if (scanner.hasNextInt()) {
        int x = scanner.nextInt();

        Ag2 a = new Ag2();

        int reversed =a.reverse(x);
        System.out.println("Reversed integer: " + reversed);}
        else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}