package com.sked.Stack;

/**
 * Created by Android on 8/9/2017.
 */
public class StackOperation {
    private int stackSize;
    private int[] stackArr;
    private int top;

    public StackOperation(int size) {
        this.stackSize = size;
        this.stackArr = new int[size];
        this.top = -1;
    }

    /**
     * this method adds an entry at the top
     *
     * @param entry
     * @throws Exception
     */
    public void push(int entry) throws Exception {
        if (this.isStackFull()) {
            throw new Exception("Stack is already full, Can't add element");
        }
        System.out.println("adding entry" + entry);
        this.stackArr[top++] = entry;
    }

    /**
     * this method will return the top element of the stack
     *
     * @return top
     */
    public int peek() {
        return stackArr[top];
    }

    /**
     * this method remove an entry from top of stack
     *
     * @return
     * @throws Exception
     */
    public int pop() throws Exception {
        if (this.isStackEmpty()) {
            throw new Exception("stack is empty,can't delete element");
        }
        int entry = this.stackArr[top--];
        System.out.println("removing elements from stack" + entry);
        return entry;
    }

    public boolean isStackFull() {
        return (top == stackSize - 1);
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        StackOperation obj = new StackOperation(10);
        try {
            obj.push(2);
            obj.push(56);
            obj.push(4);
            obj.push(5);
            obj.push(6);
            obj.push(14);
            obj.push(41);
            obj.push(90);
            obj.push(49);
            obj.push(23);
            obj.push(65);
            obj.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
