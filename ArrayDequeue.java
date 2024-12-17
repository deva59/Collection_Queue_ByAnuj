package Collection_Queue_ByAnuj;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeue {
    public static void main(String[] args) {
        //ArrayDeque<Integer> dq = new ArrayDeque<>();

        //If Write Queue Only Execute Queue Methods Not ArrayDeque
        //But Write Deque So Execute Both..
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        //Add Element last(rear).
        dq.offer(10);
        //Its Benefits in sliding window both side operation that is use offerFirst and Last
        dq.offerLast(20);
        dq.offerFirst(30);

        System.out.println(dq);

        //First Element Remove
        System.out.println(dq.poll());
        //Last Element Remove
        System.out.println(dq.pollLast());

        System.out.println(dq);

        //which is First Element check
        System.out.println(dq.peek());

        //which is Second Element Check
        System.out.println(dq.peekLast());

        System.out.println(dq);




    }
}
