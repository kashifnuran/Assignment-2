import java.util.Scanner;

public class CLassA {

    public void readAndPrint() {

        Scanner scanner = new Scanner(System.in);

        int lineCount = 0;
        int characterCount = 0;

        System.out.println("Type text line by line. Type 'stop' to finish.");

        while (true) {
            String line = scanner.nextLine();

            // check if user typed STOP
            if (line.equalsIgnoreCase("stop")) {
                break;
            }

            lineCount++;
            characterCount += line.length();
        }

        // print result
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of characters: " + characterCount);
    }
}
