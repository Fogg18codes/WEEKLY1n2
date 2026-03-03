import java.util.Scanner;

class level26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int age1 = sc.nextInt();
        double h1 = sc.nextDouble();

        System.out.print("Enter Akbar's age and height: ");
        int age2 = sc.nextInt();
        double h2 = sc.nextDouble();

        System.out.print("Enter Anthony's age and height: ");
        int age3 = sc.nextInt();
        double h3 = sc.nextDouble();

        int minAge = Math.min(age1, Math.min(age2, age3));
        double maxHeight = Math.max(h1, Math.max(h2, h3));

        System.out.println("Youngest age is " + minAge);
        System.out.println("Tallest height is " + maxHeight);
    }
}