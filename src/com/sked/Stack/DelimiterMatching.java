package com.sked.Stack;

/**
 * Created by Android on 8/21/2017.
 */
public class DelimiterMatching {
    public static void main(String[] args) {
        DelimiterMatching obj = new DelimiterMatching();
     /*   String expression = "{(a+b)*(c+d)}";
        boolean result = obj.isDelimiterMatching(expression);
        System.out.println(expression + "  :  " + result);*/

        String expressionSecond = "{(a+b)+[x*(c+d)}}";
        boolean result = obj.isDelimiterMatching(expressionSecond);
        System.out.println(expressionSecond + " : " + result);
    }

    private boolean isDelimiterMatching(String input) {
        int stackSize = input.length();
        StackImpl<Character> stackObj = new StackImpl<>(stackSize);
        for (int i = 0; i < stackSize; i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    try {
                        stackObj.push(ch);
                    } catch (Exception e) {
                        break;
                    }
                    break;
                case ')':
                case '}':
                case ']':
                    if (!stackObj.isStackEmpty()) {
                        try {
                            char outChat = stackObj.pop();
                            if ((ch == ')' && outChat != '(') || (ch == '}' && outChat != '{') || (ch == ']' && outChat != '[')) {
                                System.out.println("mismatch found: " + ch + "at" + i);
                                return false;
                            }
                        } catch (Exception e) {
                            break;
                        }

                    } else {
                        System.out.println("mismatch found :" + ch + "at - " + i);
                        return false;
                    }
                    break;
                default:
                    break;
            }

        }
        if (!stackObj.isStackEmpty()) {
            System.out.println("Error: missing right delimiter");
            return false;
        }
        return true;
    }

    class StackImpl<T extends Object> {
        private int top;
        private T[] stackArray;
        private int stackSize;


        public StackImpl(int size) {
            this.stackSize = size;
            this.stackArray = (T[]) new Object[size];
            this.top = -1;
        }

        private void push(T entry) throws Exception {
            if (isStackFull()) {
                throw new Exception("Stack is full");
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

        private T peep() {
            return stackArray[top];
        }

        public boolean isStackEmpty() {
            return (top == -1);
        }

        public boolean isStackFull() {
            return (top == stackSize - 1);
        }
    }
}
