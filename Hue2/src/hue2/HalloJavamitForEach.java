package hue2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

/**
 *
 * @author Moritz Leuchtenmüller
 */
public class HalloJavamitForEach implements List {

    List<String> liste;

    public void printList() {
        for (String element : liste) {
            System.out.println(element);
        }
        Consumer<String> consumer = (String s) -> System.out.println(s);
        liste.forEach((String s) -> System.out.println(s));
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean contains(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object[] toArray(Object[] arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean add(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean remove(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean containsAll(Collection arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(Collection arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(int arg0, Collection arg1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removeAll(Collection arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean retainAll(Collection arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object get(int arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object set(int arg0, Object arg1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void add(int arg0, Object arg1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object remove(int arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int indexOf(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lastIndexOf(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListIterator listIterator(int arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List subList(int arg0, int arg1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
