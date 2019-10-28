package com.school.mindera;

public class Linked<T> {
    Node<T> root = null;

    public T get(int index) {
        Node<T> tmp = this.root;

        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.value;
    }

    public void add(T value) {
        if (root == null) {
            this.root = new Node<>(value);
        } else {
            Node<T> currentLast = this.root;
            while (currentLast.next != null) {
                currentLast = currentLast.next;
            }

            Node<T> newLast = new Node<>(value);
            currentLast.next = newLast;
            newLast.previous = currentLast;
        }
    }

    @Override
    public String toString() {
        return "Linked{" + "root=" + root + '}';
    }

    static class Node<T> {
        T value;
        Node<T> next;
        Node<T> previous;

        public Node(T value) {
            this.value = value;
        }
    }

}


