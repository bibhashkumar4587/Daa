
import java.util.Scanner;

public class stackOperation<Template> {
        private int msize;
        private int top;
        private Template[] stack;
        Scanner scanner = new Scanner(System.in);

        public stackOperation(int size) {
                msize = size;
                stack = (Template[]) new Object[msize];
                top = -1;
        }

        public boolean isFull() {
                return (top == msize - 1);
        }

        public void checkFull() {
                if (isFull()) {
                        System.out.println("Stack is full");
                } else {
                        System.out.println("Stack is not full");
                }
        }


        public boolean isEmpty() {
                return (top == -1);
        }

        public void checkEmpty() {
                if (isEmpty()) {
                        System.out.println("Stack is Empty");
                } else {
                        System.out.println("Stack is not Empty");
                }
        }

        public void push(Template value) {
                if (isFull()) {
                        System.out.println("Stack is full to push");
                } else {
                        stack[++top] = value;
                        System.out.println("Push is : " + value);
                }
        }

        public Template pop() {
                if (isEmpty()) {
                        System.out.println("Stack is empty");
                        return null;
                } else {
                        Template value = stack[top--];
                        System.out.println("popped  :" + value);
                        return value;
                }
        }

        public Template peek() {
                if (isEmpty()) {
                        System.out.println("Stack is empty");
                        return null;
                } else {
                        Template value = stack[top];
                        System.out.println("Top element is  :" + value);
                        return value;
                }
        }

        public static void main(String[] arg) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your stack size");
                int num = scanner.nextInt();
                stackOperation<Integer> object = new stackOperation<>(num);

                System.out.println("Enter 1 for checking stack full or not");
                System.out.println("Enter 2 for checking stack Empty or not");
                System.out.println("Enter 3 for push");
                System.out.println("Enter 4 for pop");
                System.out.println("Enter 5 for peek");
                System.out.println("Enter 6 for Exit");
                while (true) {
                        System.out.println("Enter your choice");
                        int choice = scanner.nextInt();
                        switch (choice) {
                                case 1:
                                      object.checkFull();
                                      break;

                                case 2:
                                      object.checkEmpty();
                                      break;
                                case 3:
                                        System.out.println("Enter element");
                                        int input = scanner.nextInt();
                                        object.push(input);
                                        break;
                                case 4:
                                        object.pop();
                                        break;
                                case 5:
                                        object.peek();
                                        break;
                                case 6:
                                        System.out.println("Exiting...");
                                        scanner.close();
                                        return;
                                default:
                                        System.out.println("Invalid choice. Please try again.");
                        }
                }
        }
}