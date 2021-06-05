import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kthelement {
        public static int kthsmallest(int[] arr, int arrLen , int k) {
            PriorityQueue<Integer> heap  = new PriorityQueue<>(Collections.reverseOrder()); //maxheap
            //PriorityQueue<Integer> heap  = new PriorityQueue<>(); //minheap

            for(int i=0; i<arrLen-1; i++) {
                heap.add(arr[i]);
            
                if(heap.size() > k){
                    heap.poll();
                }
            }
            return heap.peek();
        }

        public static void main(String[] args) {
            int[] arr = {6, 3, 8, 5, 2, 1}; // 1, 2, 3, 5, 6, 8 
            int k = 2;

            int arrUpdated = kthsmallest(arr, arr.length, k);
            System.out.println("PQ: "+arrUpdated);
        }
    }
