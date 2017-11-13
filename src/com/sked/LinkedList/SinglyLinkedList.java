package com.sked.LinkedList;

/**
 * Created by Android on 8/9/2017.
 */
public class SinglyLinkedList<T> {
    private Node<T> head;

    public void add(T elements) {
        Node<T> nd = new Node<T>();
        nd.setValues(elements);
        System.out.println("adding elements to node:" + elements);
        Node<T> tmp = head;
        while (true) {
            if (tmp == null) {
                //since there is only one element, both head and
                //tail points to the same object.
                head = nd;
                break;
            } else if (tmp.getNextValue() == null) {
                tmp.setNextValue(nd);
                break;
            } else {
                tmp = tmp.getNextValue();
            }
        }
    }

    public void traverse() {
        Node<T> tmp = head;
        while (true) {
            if (tmp == null) {
                break;
            }
            System.out.println(tmp.getValues() + "\t");
            tmp = tmp.getNextValue();
        }
    }

    public void reverseList() {
        System.out.println("\n Reversing linkedList \n");
        Node<T> next = null;
        Node<T> current = head;
        Node<T> prev = null;

        while (current != null) {

            next = current.getNextValue();
            current.setNextValue(prev);
            prev = current;
            current = next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> mLinkedList = new SinglyLinkedList<>();
        mLinkedList.add(7);
        mLinkedList.add(8);
        mLinkedList.add(9);
        mLinkedList.add(10);

        mLinkedList.traverse();
        System.out.println();
        mLinkedList.reverseList();
        System.out.println();
        mLinkedList.traverse();
    }

    public class Node<T> implements Comparable<T> {
        private T values;
        private Node<T> nextValue;

        public T getValues() {
            return values;
        }

        public void setValues(T values) {
            this.values = values;
        }

        public Node<T> getNextValue() {
            return nextValue;
        }

        public void setNextValue(Node<T> nextValue) {
            this.nextValue = nextValue;
        }

        @Override
        public int compareTo(T args) {
            if (args == this.values)
                return 0;
            else return 1;
        }
    }
}
