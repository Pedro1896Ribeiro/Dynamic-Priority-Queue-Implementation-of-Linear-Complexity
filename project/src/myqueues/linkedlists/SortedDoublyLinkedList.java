
package myqueues.linkedlists;

import java.util.Comparator;

/**
 *
 * @author 
 */

public class SortedDoublyLinkedList<E> extends DoublyLinkedList<E> {
    private Comparator<E> comp;

    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static class DefaultComparator<E> implements Comparator<E> {
        public int compare(E a, E b) throws ClassCastException {
            return ((Comparable<E>) a).compareTo(b);
        }   
    }

    public SortedDoublyLinkedList() {
        this(new DefaultComparator<E>());
    }

    public SortedDoublyLinkedList(Comparator<E> othercmp){
        super();
        comp=othercmp;
    }

    private Node<E> ceilingNode(E e) {
        Node<E> n= header.getNext();
        while(n!=trailer && comp.compare(e,n.getElement())>0) n=n.getNext();
        return n;
    }

    public E find(E e) {
        Node<E> n = ceilingNode(e);
        if(n!=trailer && comp.compare(e,n.getElement())==0) return n.getElement();
        else return null;
    }

    public void add(E e) {
        Node<E> n= ceilingNode(e);
        addBetween(e, n.getPrev(), n); // place just before the n
    }

    @Override
    public void addFirst(E e) {
        throw new UnsupportedOperationException("Método de inserção não permitido.");
    }
    
    @Override
    public void addLast(E e) {
        throw new UnsupportedOperationException("Método de inserção não permitido.");
    }

    public E put(E e) {
        Node<E> n= ceilingNode(e);
        if(n!=trailer && comp.compare(e,n.getElement())==0){
            E old=n.getElement();
            n.setElement(e);
            return old;
        }else{
            addBetween(e, n.getPrev(), n); // place just before the n
            return null;
        }
    }

    public E remove(E e) {
        Node<E> n = ceilingNode(e);
        if(n!=trailer && comp.compare(e,n.getElement())==0) return remove(n);
        else return null;
    }
}
