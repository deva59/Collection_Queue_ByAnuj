package Collection_Queue_ByAnuj;

import java.util.PriorityQueue;
import java.util.Queue;

//Priority: means gernal man and vip man go to comes darshan 1st Priority get Vip and then afer genral man same goes time Because vip priority is high compare to genral.
public class LearnPriorityQueue {
    public static void main(String[] args) {

        //Priority ki implement hoti hai queue me.
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(40);
        pq.add(10);//By Default Small Number Priority is High.
        pq.add(20);


        //By Default Sort Queue - Its Also Known as Min Heap implement kiya hai.
        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq.poll());


    }
}
