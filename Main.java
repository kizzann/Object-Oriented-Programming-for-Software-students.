
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many vehicles will be dispatched?");
        int dispatch = input.nextInt();
        input.nextLine();


        Vehicle[] info = new Vehicle[dispatch];
        for (int i = 0; i < dispatch; i++) {

            System.out.println("Vehicle: " + (i + 1));

            System.out.println("\nEnter vehicle number: ");
            String id = input.nextLine();

            System.out.println("Who was issued vehicle: ");
            String issuedTo = input.nextLine();

            System.out.println("Is it operational? If not, what maintenance is needed: ");
            String operational = input.nextLine();

            System.out.println("Who does vehicle belong to: ");
            String owner = input.nextLine();

            System.out.println("Enter section vehicle belongs to: ");
            String section = input.nextLine();

            info[i] = new Vehicle(id, issuedTo, operational, owner, section);
        }
        
        
        for (int i = 0; i < dispatch; i++) {

            info[i].display(info[i]);
        }
    }
}

