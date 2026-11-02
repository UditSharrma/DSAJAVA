package org.StackAndQueue;

public class BasicStack {
    public static void main(String[] args) {
        Stack stack=new Stack(3);
        stack.add(5);
        stack.add(12);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.peek());
        System.out.println();
    }
    static class Stack {

        public Stack(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1; // Stack is empty initially
        }
        int maxSize;
        int[] stackArray;
        int top;

         void add(int n) {
             if (isFull()){
                 System.out.println("Stack is full");
             }
             else {
                 stackArray[++top]=n;
             }


        }

        int remove() {
             if (isEmpty()){
                 System.out.println("Stack is Empty");
                 return -1;
             }
                 return stackArray[top--];

        }

         int peek() {
             if (isEmpty()){
                 System.out.println("Stack is Empty");
                 return -1;
             }
             return stackArray[top];


        }
        boolean isFull(){
             return (top==maxSize -1);

        }

        boolean isEmpty(){
             return (top==-1);

        }


    }

}
