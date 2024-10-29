import java.util.Deque;
import java.util.LinkedList;
import java.util.HashSet;

public class LRUCache {

    // store keys of cache
    static Deque<Integer> dq;

    // store references of key in cache
    private static HashSet<Integer> map;

    //maximum capacity of cache
    static int csize;

    LRUCache(int n)
    {
        dq=new LinkedList<>();
        map=new HashSet<>();
        csize=n;
    }

    void refer(int x)
    {
        // not present in cache
        if (!dq.contains(x))
        {
            if (dq.size() >= csize)
            {
                int lru_key = dq.removeLast();
                map.remove(lru_key);
            }

            dq.push(x);
            map.add(x);
        } else
        {
            // present in cache
            dq.remove(x);
            dq.push(x);
        }
    }

    // display contents of cache
    private void display()
    {
        for (Integer integer : dq) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LRUCache ca=new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }

}
