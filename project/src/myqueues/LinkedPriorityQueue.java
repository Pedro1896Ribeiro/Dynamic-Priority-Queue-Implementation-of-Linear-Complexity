package myqueues;

import myqueues.linkedlists.*;
import java.util.Iterator;
import myqueues.PriorityQueue;

/**
 *
 * @author a37553 - Nuno Barreira - Eng. informática
 * @author a37557 - Pedro Ribeiro - Eng. informática
 */
public class LinkedPriorityQueue<E extends Comparable<E>> implements PriorityQueue<E> {

    private SortedDoublyLinkedList<E> list = new SortedDoublyLinkedList<>();

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(E e) {
        return list.find(e) != null;
    }

    @Override
    public void insert(E e) {
        list.add(e);
    }

    @Override
    public E removeMin() {
        return list.removeFirst();
    }

    @Override
    public E min() {
        return list.first();
    }

    @Override
    public boolean containsAll(PriorityQueue<E> other) {
        boolean aux = false;
        for(Iterator<E> x = other.iterator() ; x.hasNext();){
            E o = x.next();
            for(Iterator<E> i = list.iterator() ; i.hasNext();){
                E e = i.next();
                    if (e.compareTo(o) == 0) {
                        aux = true;
                        break;
                    }
            }
            if (aux) aux=false;
            else return false;
        }
        return true;
    }

    @Override
    public void addAll(PriorityQueue<E> other) {
         for(Iterator<E> x = other.iterator() ; x.hasNext();){
             insert(x.next());
         }
    }

    @Override
    public void removeAll(PriorityQueue<E> other) {
        for(Iterator<E> x = other.iterator() ; x.hasNext();){
            E o = x.next();
            for(Iterator<E> i = list.iterator() ; i.hasNext();){
                E e = i.next();
                    if (e.compareTo(o) == 0) {
                        list.remove(e);
                    }
            }
        }
    }

    @Override
    public void clear() {
        for(Iterator<E> i = list.iterator() ; i.hasNext();){
            list.remove(i.next());
        }
    }

    @Override
    public LinkedPriorityQueue<E> clone() {
        LinkedPriorityQueue<E> copy = new LinkedPriorityQueue<>();
        copy.addAll(this);
        return copy;
    }

}