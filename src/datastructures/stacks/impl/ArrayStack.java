package datastructures.stacks.impl;

import datastructures.stacks.Stack;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    private int size;
    private int resizeFactor = 2;


    public ArrayStack(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void push(E element) {
        if(size == elements.length){
            resize();
        }
        elements[size++] = element;
    }

    private void resize() {
        E[] newElements = (E[]) new Object[elements.length * resizeFactor];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            return null;
        } else {
            E element = elements[--size];
            elements[size] = null;
            return element;
        }
    }

    @Override
    public E top() {
        if(isEmpty()){
            return null;
        } else {
            return elements[size - 1];
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(elements));
    }


}
