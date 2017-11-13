package com.sked.Stack;

import com.sun.istack.internal.NotNull;

import java.util.Scanner;

/**
 * Created by Android on 8/17/2017.
 */
public class ReverseString {

    public String reverseString(@NotNull String word) {
        StringBuilder builder = new StringBuilder();
        int length = word.length();
        ReverseStringMain<Character> stackObj = new ReverseStringMain<>(length);
        for (int i = 0; i < length; i++) {
            try {
                stackObj.push(word.charAt(i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (true) {
            try {
                builder.append(stackObj.pop());
            } catch (Exception e) {
                break;
                /*e.printStackTrace();*/
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        ReverseString reverseString=new ReverseString();
        System.out.println("enter your word to reverse: ");
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println("your reverse word is: "+reverseString.reverseString(word));
    }

    class ReverseStringMain<T extends Object> {
        private int stackSize;
        private T[] stackArray;
        private int top;

        private ReverseStringMain(int entry) {
            this.stackSize = entry;
            this.stackArray = (T[]) new Object[entry];
            this.top = -1;
        }

        private void push(T entry) throws Exception {
            if (isStackFull()) {
                throw new Exception("stack is full,can't push element");
            }
            this.stackArray[++top] = entry;

        }

        private T pop() throws Exception {
            if (isStackEmpty()) {
                throw new Exception("stack is empty");

            }
            T entry = this.stackArray[top--];

            return entry;
        }

        private boolean isStackEmpty() {
            return (top == -1);
        }

        private boolean isStackFull() {
            return (top == stackSize - 1);
        }

    }
}
