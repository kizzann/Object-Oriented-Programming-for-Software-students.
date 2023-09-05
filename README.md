# Military Vehicle Organization

## Synopsis
This is a program to be able to identify a military vehicle, who owns it, give maintenance reports on it, and go into further details.

## Motivation
I am in the military, and they are severly lacking proper programming to better facilitate their jobs and to better communicate with everyone.

## How to Run
To run, you need to know the vehicle number, who is in charge of the vehicle, what maintenance needs to be done to it(if plausible), who onwns it, and what section the vehicle belongs to.

## Code Example
```
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
```

## Tests
Describe and show how to run the tests with code examples. State that you are using JUnit4 to test.

## Contributors
Contributions
- Skyela Cedotal
- Rick Campbell
- Wendell Campbell
