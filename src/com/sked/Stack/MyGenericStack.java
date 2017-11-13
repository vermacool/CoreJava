package com.sked.Stack;

/**
 * Created by Android on 8/17/2017.
 */
public class MyGenericStack<T extends Object> {
    private T[] stackArray;
    private int stackSize;
    private int top;

    public MyGenericStack(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray = (T[]) new Object[stackSize];
        this.top = -1;
    }

    public static void main(String[] args) {
        MyGenericStack<String> mObject = new MyGenericStack<>(4);
       try {
           mObject.push("first entry");
           mObject.push("second entry");
           mObject.push("third entry");
           mObject.push("four entry");
           mObject.push("fifth entry");
           mObject.pop();
           mObject.pop();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
       MyGenericStack<Integer> mObjectInt=new MyGenericStack<>(2);
       try {
           mObjectInt.push(1);
           mObjectInt.push(6);
           mObjectInt.push(3);
           mObjectInt.push(1);
           mObjectInt.push(1);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }

    }

    private void push(T entry) {
        if (this.isStackFull()) {
            System.out.println("stack is full incresing the size");
            this.increaseStackSize();
        }
        System.out.println("adding to stack: "+entry);
        this.stackArray[++top] = entry;
    }

    private T pop() throws Exception {
        if (this.isStackEmpty()) {
            throw new Exception("stack is empty,can't remove elements");
        }
        T entry = this.stackArray[top--];
        System.out.println("removing the element" + entry);
        return entry;
    }

    private void increaseStackSize() {
        T[] mNewStack = (T[]) new Object[this.stackSize * 2];
        for (int i = 0; i < stackSize; i++) {
            mNewStack[i] = this.stackArray[i];
        }
        this.stackArray = mNewStack;
        this.stackSize = this.stackSize * 2;
    }

    /**
     * check whether stack is empty
     *
     * @return boolean
     */
    private boolean isStackEmpty() {
        return (top == -1);
    }

    private boolean isStackFull() {
        return (top == stackSize - 1);
    }
}
