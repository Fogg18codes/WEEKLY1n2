import java.util.Scanner;

class level34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter distance from To Via (km): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance Via to Final City (km): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time From To Via (minutes): ");
        double timeFromToVia = sc.nextDouble();

        System.out.print("Enter time Via To Final City (minutes): ");
        double timeViaToFinalCity = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name 
                + " from " + fromCity + " to " + toCity 
                + " via " + viaCity + " is " + totalDistance 
                + " km and the Total Time taken is " 
                + totalTime + " minutes");
    }
}