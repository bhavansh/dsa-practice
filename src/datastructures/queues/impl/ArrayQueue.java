package datastructures.queues.impl;

import datastructures.queues.Queue;

import java.beans.PropertyEditorManager;
import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    private int size = 0;
    private int front = 0;
    private int rear = -1;
    private int resizeFactor = 2;

    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayQueue(int capacity) {
        if(capacity > 0)
            elements = (E[]) new Object[DEFAULT_CAPACITY];
        else
            elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void enqueue(E e) {
        if(size == elements.length){
            resize();
        }
        rear = (rear + 1) % elements.length;;
        elements[rear] = e;
        size++;

    }

    private void resize() {
        E[] newElements = (E[]) new Object[elements.length * resizeFactor];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            return null;
        }
        else {
            E removedElement = elements[front];
            elements[front] = null;
            front = (front + 1) % elements.length;
            size--;
            return removedElement;
        }
    }

    @Override
    public E front() {
        if(isEmpty()){
            return null;
        }
        return elements[front];
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
