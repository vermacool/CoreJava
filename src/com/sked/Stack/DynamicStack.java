package com.sked.Stack;

/**
 * Created by Android on 8/17/2017.
 */

public class DynamicStack {
    private int[] stackArray;
    private int top;
    private int stackSize;

    public DynamicStack(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray = new int[stackSize];
        this.top = -1;
    }

    public static void main(String[] args) {
        DynamicStack obj = new DynamicStack(5);
        try {
            for (int i = 0; i < 11; i++) {
                obj.push(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i <= 6; i++) {
            try {
                obj.pop();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void push(int entry) throws Exception {
        if (this.isStackFull()) {
            System.out.println("stack is full please increse the capacity");
            this.increaseStackCapacity();
        }
        System.out.println("pushing the element : " + entry);
        this.stackArray[++top] = entry;
    }

    /**
     * removing elements from top of the stack
     *
     * @return
     * @throws Exception
     */
    public int pop() throws Exception {
        if (this.isStackEmpty()) {
            throw new Exception("stack is empty,can't remove element");
        }
        int entry = this.stackArray[top--];
        System.out.println("removing element" + entry);
        return entry;
    }

    public int peek() {
        return stackArray[top];
    }

    public void increaseStackCapacity() {
        int[] newStackArray = new int[this.stackSize * 2];
        for (int i = 0; i < stackSize; i++) {
            newStackArray[i] = this.stackArray[i];
        }
        this.stackArray = newStackArray;
        this.stackSize = this.stackSize * 2;
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }

    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
}
