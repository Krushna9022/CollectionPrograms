package r33;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueJob {
    public static void main(String[] args) {
        Queue<String> job=new PriorityQueue<>();
        job.offer("krushna");
        job.offer("pawar");
        System.out.println(job);

    }
}
