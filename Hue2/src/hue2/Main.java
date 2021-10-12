package hue2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Moritz Leuchtenmüller
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Choose calculator:");
        System.out.println("1 - Relational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Test file");
        System.out.println("5 - Exit program");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        RationalCalculator relationalCalc = new RationalCalculator(
                (x, y) -> {
                    Number result = new Number();
                    result.setA((x.getA() * y.getB()) + (x.getB() * y.getA()));
                    result.setB(x.getB() * y.getB());
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();
                    result.setA((x.getA() * y.getB()) - (x.getB() * y.getA()));
                    result.setB((x.getB() * y.getB()));
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() * y.getA());
                    result.setB(x.getB() * y.getB());
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() * y.getB());
                    result.setB(x.getB() * y.getA());
                    return result;
                }
        );
        VectorCalculator vectorCalc = new VectorCalculator(
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() + y.getA());
                    result.setB(x.getB() + y.getB());
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() - y.getA());
                    result.setB(x.getB() - y.getB());
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() * y.getA());
                    result.setB(x.getB() * y.getB());
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() / y.getA());
                    result.setB(x.getB() / y.getB());
                    return result;
                }
        );

        ComplexCalculator complexCalc = new ComplexCalculator(
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() + y.getA());
                    result.setB(x.getB() + y.getB());
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() + y.getA());
                    result.setB(x.getB() + y.getB());
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();
                    result.setA((x.getA() * y.getA()) + ((x.getB() * y.getB()) * y.getB() * y.getB()));
                    result.setB((x.getA() * y.getB()) + ((x.getB() * y.getA())));
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();
                    result.setA((x.getA() + x.getB()) / (y.getA() + y.getB()));
                    result.setB((y.getA() - y.getB()) / (y.getA() - y.getB()));
                    return result;
                }
        );
        Number numberX = new Number();
                Number numberY = new Number();
                int xa = 0;
                int xb = 0;
                int ya = 0;
                int yb = 0;
                int i = 1;
        switch (input) {
            case 1:
                do{
                switch (i) {
                case 1:
                    System.out.println("Enter number x a>");
                    xa = Integer.parseInt(scanner.nextLine());
                        numberX.setA(xa);
                        i++;
                    break;
                case 2:
                    System.out.println("Enter number x b>");
                    xb = Integer.parseInt(scanner.nextLine());
                        numberX.setB(xb);
                        i++;
                    break;
                case 3:
                    System.out.println("Enter number y a>");
                    ya = Integer.parseInt(scanner.nextLine());
                        numberY.setA(ya);
                        i++;
                    break;
                case 4:
                    System.out.println("Enter number y b>");
                    yb = Integer.parseInt(scanner.nextLine());
                        numberY.setB(yb);
                        i++;
                    break;
                 default:
                    break;
                }
            }while(i <= 4);

                System.out.println("Choose operation :");
                System.out.println("1 - add");
                System.out.println("2 - subtract");
                System.out.println("3 - multiply");
                System.out.println("4 - divide");
                System.out.println("5 - enter numbers again");
                int operation = Integer.parseInt(scanner.nextLine());
            switch (operation) {
                case 1:
                    System.out.println(relationalCalc.add(numberX, numberX).toString());
                    break;
                case 2:
                    System.out.println(relationalCalc.subtract(numberX, numberY).toString());
                    break;
                case 3:
                    System.out.println(relationalCalc.multiply(numberX, numberY).toString());
                    break;
                case 4:
                    System.out.println(relationalCalc.divide(numberX, numberY).toString());
                    break;
                case 5:
                    i = 1;
                    do{
             switch (i) {
                case 1:
                    System.out.println("Enter number x a>");
                    xa = Integer.parseInt(scanner.nextLine());
                        numberX.setA(xa);
                        i++;
                    break;
                case 2:
                    System.out.println("Enter number x b>");
                    xb = Integer.parseInt(scanner.nextLine());
                        numberX.setB(xb);
                        i++;
                    break;
                case 3:
                    System.out.println("Enter number y a>");
                    ya = Integer.parseInt(scanner.nextLine());
                        numberY.setA(ya);
                        i++;
                    break;
                case 4:
                    System.out.println("Enter number y b>");
                    yb = Integer.parseInt(scanner.nextLine());
                        numberY.setB(yb);
                        i++;
                    break;
                 default:
                    break;
                 }
            }while(i <= 4);
                break;
                default:
                    System.out.println("Invalid input!");
                    System.out.println("Choose operation :");
                    System.out.println("1 - add");
                    System.out.println("2 - subtract");
                    System.out.println("3 - multiply");
                    System.out.println("4 - divide");
                    System.out.println("5 - enter numbers again");
                    operation = Integer.parseInt(scanner.nextLine());
            }
            break;
            case 2:
            do{
             switch (i) {
                case 1:
                    System.out.println("Enter number x a>");
                    xa = Integer.parseInt(scanner.nextLine());
                        numberX.setA(xa);
                        i++;
                    break;
                case 2:
                    System.out.println("Enter number x b>");
                    xb = Integer.parseInt(scanner.nextLine());
                        numberX.setB(xb);
                        i++;
                    break;
                case 3:
                    System.out.println("Enter number y a>");
                    ya = Integer.parseInt(scanner.nextLine());
                        numberY.setA(ya);
                        i++;
                    break;
                case 4:
                    System.out.println("Enter number y b>");
                    yb = Integer.parseInt(scanner.nextLine());
                        numberY.setB(yb);
                        i++;
                    break;
                 default:
                    break;
                 }
            }while(i <= 4);
                System.out.println("Choose operation :");
                System.out.println("1 - add");
                System.out.println("2 - subtract");
                System.out.println("3 - multiply");
                System.out.println("4 - divide");
                System.out.println("5 - enter numbers again");
                operation = Integer.parseInt(scanner.nextLine());
            switch (operation) {
                case 1:
                    System.out.println(vectorCalc.add(numberX, numberY).toString());
                    break;
                case 2:
                    System.out.println(vectorCalc.subtract(numberX, numberY).toString());
                    break;
                case 3:
                    System.out.println(vectorCalc.multiply(numberX, numberY).toString());
                    break;
                case 4:
                    System.out.println(vectorCalc.divide(numberX, numberY).toString());
                    break;
                case 5:
                    i = 1;
                    do{
             switch (i) {
                case 1:
                    System.out.println("Enter number x a>");
                    xa = Integer.parseInt(scanner.nextLine());
                        numberX.setA(xa);
                        i++;
                    break;
                case 2:
                    System.out.println("Enter number x b>");
                    xb = Integer.parseInt(scanner.nextLine());
                        numberX.setB(xb);
                        i++;
                    break;
                case 3:
                    System.out.println("Enter number y a>");
                    ya = Integer.parseInt(scanner.nextLine());
                        numberY.setA(ya);
                        i++;
                    break;
                case 4:
                    System.out.println("Enter number y b>");
                    yb = Integer.parseInt(scanner.nextLine());
                        numberY.setB(yb);
                        i++;
                    break;
                 default:
                    break;
                 }
            }while(i <= 4);
                    break;
                default:
                    System.out.println("Invalid input!");
                    System.out.println("Choose operation :");
                    System.out.println("1 - add");
                    System.out.println("2 - subtract");
                    System.out.println("3 - multiply");
                    System.out.println("4 - divide");
                    System.out.println("5 - enter numbers again");
                    operation = Integer.parseInt(scanner.nextLine());
                    break;
                }
                break;

            case 3:
                do{
             switch (i) {
                case 1:
                    System.out.println("Enter number x a>");
                    xa = Integer.parseInt(scanner.nextLine());
                        numberX.setA(xa);
                        i++;
                    break;
                case 2:
                    System.out.println("Enter number x b>");
                    xb = Integer.parseInt(scanner.nextLine());
                        numberX.setB(xb);
                        i++;
                    break;
                case 3:
                    System.out.println("Enter number y a>");
                    ya = Integer.parseInt(scanner.nextLine());
                        numberY.setA(ya);
                        i++;
                    break;
                case 4:
                    System.out.println("Enter number y b> 2");
                    yb = Integer.parseInt(scanner.nextLine());
                    if(yb > 2)
                    {
                        numberY.setB(yb);
                        i++;
                    }
                    break;
                 default:
                    break;
                 }
            }while(i <= 4);
                System.out.println("Choose operation :");
                System.out.println("1 - add");
                System.out.println("2 - subtract");
                System.out.println("3 - multiply");
                System.out.println("4 - divide");
                System.out.println("5 - enter numbers again");
                operation = Integer.parseInt(scanner.nextLine());
            switch (operation) {
                case 1:
                    System.out.println(complexCalc.add(numberX, numberY).toString());
                    break;
                case 2:
                    System.out.println(complexCalc.subtract(numberX, numberY).toString());
                    break;
                case 3:
                    System.out.println(complexCalc.multiply(numberX, numberY).toString());
                    break;
                case 4:
                    System.out.println(complexCalc.divide(numberX, numberY).toString());
                    break;
                case 5:
                    i = 1;
                    do{
             switch (i) {
                case 1:
                    System.out.println("Enter number x a>");
                    xa = Integer.parseInt(scanner.nextLine());
                        numberX.setA(xa);
                        i++;
                    break;
                case 2:
                    System.out.println("Enter number x b>");
                    xb = Integer.parseInt(scanner.nextLine());
                        numberX.setB(xb);
                        i++;
                    break;
                case 3:
                    System.out.println("Enter number y a>");
                    ya = Integer.parseInt(scanner.nextLine());

                        numberY.setA(ya);
                    break;
                case 4:
                    System.out.println("Enter number y b>");
                    yb = Integer.parseInt(scanner.nextLine());
                        numberY.setB(yb);
                        i++;
                    break;
                 default:
                    break;
                 }
            }while(i <= 4);
                    break;
                default:
                    System.out.println("Invalid input!");
                    System.out.println("Choose operation :");
                    System.out.println("1 - add");
                    System.out.println("2 - subtract");
                    System.out.println("3 - multiply");
                    System.out.println("4 - divide");
                    System.out.println("5 - enter numbers again");
                    operation = Integer.parseInt(scanner.nextLine());
                    break;
                }
                break;
            case 4:
                NumberTester nt = new NumberTester(new File("numbers.txt"));
                nt.testFile();
                break;
            case 5:
                System.out.println("Auf Wiedersehen");
                break;
            default:
                System.out.println("Falsche Eingabe");
        }
    }
}
