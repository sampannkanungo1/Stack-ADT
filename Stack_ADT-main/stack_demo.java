package arraylist;
import java.util.Stack;
public class stack_demo {
		 public static void main(String[] args) {
		 Stack<Integer> stack = new Stack<Integer>();
		 int temp;
		 stack.push(1); //Adds value k to the top of the stack
		 stack.push(2);
		 stack.push(3);
		 System.out.println("Stack : "+stack);  //DISPLAY THE STACK 
		 System.out.println("Stack size : "+stack.size()); // TO KNOW THE SIZE OF STACK
		 System.out.println("Stack pop : "+stack.pop()); //Remove element from the top of the stack and return its value.
		 System.out.println("Stack top : "+stack.peek()); //Returns the value of the element at the top of the stack
		 System.out.println("Stack isEmpty : "+stack.isEmpty()); //determines whether the stack is empty. It return true if the stack is empty otherwise return false.

		 }
		}
