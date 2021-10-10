package hue2;

import java.util.Scanner;

/**
 *
 * @author Moritz Leuchtenmüller
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Choose calculator:");
        System.out.println("1 - Relational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit program");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        RationalCalculator rationalCalc = new RationalCalculator(
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
    }
}
