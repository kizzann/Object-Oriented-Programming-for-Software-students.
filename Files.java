import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws Exception {
        File file = new File("Exercise12_15.txt");
        if (file.exists()) {
            System.out.print("File " + file + "already exists!");
            System.exit(0);
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < 100; i++) {
                output.print(((int) (Math.random() * 1000) + 1));
                output.print(" ");
            }
        }
        ArrayList<Integer> fileList = new ArrayList<>();
        try (Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                fileList.add(input.nextInt());
            }
        }
        sort(fileList);
        System.out.print(fileList);
    }

    public static void sort(ArrayList<Integer> fileList) {

        for (int i = 0; i < fileList.size(); i++) {
            int currentMin = fileList.get(i);
            int currentIndex = i;
            for (int j = i; j < fileList.size(); j++) {
                if (fileList.get(j) < currentMin) {
                    currentIndex = j;
                    currentMin = fileList.get(j);
                }
            }

            if (currentIndex != i) {
                fileList.set(currentIndex, fileList.get(i));
                fileList.set(i, currentMin);
            }
        }

    }

}
