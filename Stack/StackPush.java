public class StackPush {

    public static class Stack {
        int[] stack = new int[5];
        int top = -1;

        void push(int element) {
            if(top == stack.length-1) {
               System.out.println("Stack is Full");
            }
            else {
                top = top+1;
                stack[top] = element;
            }
        }
        void display() {
            for(int i=top; i>=0; i--) {
                System.out.print(stack[i]+" ");
            }
        }
    }
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(5);
        s.push(6); 
        s.push(8);   
        s.display();
    }
}