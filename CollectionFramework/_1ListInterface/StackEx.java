package CollectionFramework._1ListInterface;

import java.util.*;

//stack is child class of vector class
class StackEx{
    public static void main(String[] args) {
        
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);

        System.out.println("LAst element is popped "+ stack.pop());
        System.out.println("Top element is printed "+ stack.peek());   //it prints the last element of stack

        System.out.println(stack.search(40));

        //Iterator is an interface for iterating over collections objects it contains 4 methods hasNext(), next(), remove(), forEachRemaining()
        Iterator<Integer> itr=stack.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}