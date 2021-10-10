package hue2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Moritz Leuchtenmüller
 */
public class NumberTester {

    File fileName;
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;

    public NumberTester(File fileName) {
        this.fileName = fileName;
        setOddEvenTester((int n) -> {
            return (n % 2) == 0;
        });
        setPrimeTester((int n) -> {
            return (n == 2 || n == 3 || n % 2 != 0 || n % 3 != 0);
        });
        setPalindromeTester((int n) -> {
            Integer intn = n;
            return (new StringBuilder(intn.toString()).reverse()).toString() == intn.toString();
        });
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(fileName);
        int quantityOfNumbers = Integer.parseInt(scanner.nextLine());
        int[][] numbers = new int[3][quantityOfNumbers];
        for (int i = 0; i < quantityOfNumbers; i++) {                                       //i Muss eventuell geändert werden
            String[] split = scanner.nextLine().split(" ");
            switch (Integer.parseInt(split[0])) {
                case 1:
                    if (oddTester.testNumber(Integer.parseInt(split[1]))) {
                        System.out.println("EVEN");
                    } else {
                        System.out.println("ODD");
                    }
                    break;
                case 2:
                    if (!primeTester.testNumber(Integer.parseInt(split[1]))) {
                        System.out.println("PRIME");
                    }
                    if (primeTester.testNumber(Integer.parseInt(split[1]))) {
                        System.out.println("NO PRIME");
                    }
                    break;
                case 3:
                    if (palindromeTester.testNumber(Integer.parseInt(split[1]))) {
                        System.out.println("PALINDROME");
                    } else {
                        System.out.println("NO PALINDROME");
                    }
                    break;
            }
        }

    }
}
