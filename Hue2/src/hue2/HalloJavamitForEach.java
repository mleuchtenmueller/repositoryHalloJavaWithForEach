package hue2;

import java.util.List;

/**
 *
 * @author Moritz Leuchtenmüller
 */
public class HalloJavamitForEach {

    List<String> liste;

    public void printList() {
        for (String element : liste) {
            System.out.println(element);
        }
        liste.forEach((String s) -> System.out.println(s));
        liste.forEach(System.out::print);
    }
}
