package Collection_Queue_ByAnuj;

import java.util.PriorityQueue;
import java.util.Queue;


public class ComparatorUse {
    public static void main(String[] args) {

        //Abhi ye Biggest number ko Priroty dega - It is also known as Max heap ye max heap jaisa treet karega.
        //Bada Number Bahar niklega
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        pq.add(30);
        pq.add(40);
        pq.add(40);
        pq.add(40);
        pq.add(10);
        pq.add(20);


        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq.poll());


    }
}
