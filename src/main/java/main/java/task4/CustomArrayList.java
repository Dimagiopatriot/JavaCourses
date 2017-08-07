package main.java.task4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by troll on 03.08.2017.
 */
public class CustomArrayList<E> {

    private List<E> baseArrayList = new ArrayList<E>();

    public boolean add(E e){
        return baseArrayList.add(e);
    }

    public void add(int index, E e){
        baseArrayList.add(index, e);
    }

    public boolean addAll(Collection<? extends E> e){
        return baseArrayList.addAll(e);
    }

    public boolean contains(Object o){
        return baseArrayList.contains(o);
    }

    public boolean containsAll(Collection<?> c){
        return baseArrayList.containsAll(c);
    }

    public E get(int index){
        return baseArrayList.get(index);
    }

    public int indexOf(Object o){
        return baseArrayList.indexOf(o);
    }

    public void set(int index, E e){
        baseArrayList.set(index, e);
    }

    public int size(){
        return baseArrayList.size();
    }

    public boolean isEmpty(){
        return baseArrayList.isEmpty();
    }
}
