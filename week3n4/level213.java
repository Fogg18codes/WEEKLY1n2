import java.util.Scanner;

class level213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number less than 100: ");
        int number = sc.nextInt();

        int counter = number - 1;

        while (counter > 0) {
            if (counter % number == 0)
                System.out.println(counter);
            counter--;
        }
    }
}