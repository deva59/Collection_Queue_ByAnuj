package Collection_Queue_ByAnuj;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {

        //Queue is LinkedList Implement LinkedList
        Queue<Integer> q = new LinkedList<>();

        //q.offer - return boolean value is not throw exception
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        //System.out.println(q.poll());

       // System.out.println(q);

        //q.poll - return removing first element like First In First Out.
        //System.out.println(q.poll());
        //System.out.println(q);

        //q.peek - return which element is exit
        //System.out.println(q.peek());
        //System.out.println(q);
    }
}
