import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class StoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int x:stones)
            pq.add(x);

        while (pq.size()>1) {
            int max=pq.remove();
            int smax=pq.remove();

            int newStone=max-smax;
            if(newStone!=0)
                pq.add(newStone);
        }

        if(pq.size()==0)
            return 0;
        else
            return pq.remove();
    }
    public static void main(String[] args) {
        int[] stone={2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stone));
    }
}
