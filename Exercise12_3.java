import java.util.Scanner;
public class Exercise12_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] random = randomArray();

        System.out.print("Enter the array index");

        try {
            System.out.print("The element value is " + random[input.nextInt()]);
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Input is out of bounds!");
        }
    }
    public static int[] randomArray() {
        int[] random = new int[100];
        for(int i = 0; i < random.length; i++) {
            random[i] = (int)(Math.random() * 100) + 1;
        }
        return random;
    }
}
