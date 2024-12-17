package Collection_Queue_ByAnuj;

import javax.swing.*;
import java.util.ArrayDeque;

public class Stack_Queue {
    public static void main(String[] args) {

        //statck class ke under vector hota hai usme Syanchronize laga hota hai
        //Isliye stack ka object use nahi karte hamesha ArrayDeque ke under hi operation karenge.
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        ArrayDeque<Integer> g = new ArrayDeque<>();
        g.offer(10);
        g.offer(20);
        g.offer(30);

        System.out.println("Queue "+g);

        System.out.println(g.pop());

    }
}
