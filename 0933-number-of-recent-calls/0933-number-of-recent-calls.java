import java.util.*;

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // Add the new request
        queue.add(t);

        // Remove requests older than t - 3000
        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        // Number of requests in the valid range
        return queue.size();
    }
}