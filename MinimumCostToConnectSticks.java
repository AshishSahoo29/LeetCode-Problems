/*
 * You have some sticks with positive integer lengths.
You can connect any two sticks of lengths X and Y into one stick by paying a cost of X + Y.  You perform this action until there is one stick remaining.
Return the minimum cost of connecting all the given sticks into one stick in this way.
Example 1:
Input: sticks = [2,4,3]
Output: 14

Example 2:
Input: sticks = [1,8,3,5]
Output: 30

Constraints:
1 <= sticks.length <= 10^4
1 <= sticks[i] <= 10^4
 */
/*
 * Given: 
 * sticks[] -> int type
 * sticks[i] -> defines the cost of each stick
 * 
 * Buteforce approach:
 * steps:
 * 1.create a list and store all the elements of array sticks
 * 2.sort the list 
 * 3.run the loop till at least 2 elements are left in the list
 * 4.get the smallest elements from the list add them to get cost
 * 5. remove the first two elements from list
 * 6.then add cost to the list and sort it 
 */
import java.util.*;
public class MinimumCostToConnectSticks {
    public static void main(String[] args){
        int[] sticks = {1,8,3,5};
        int x = findCost(sticks);
        System.out.println("Minimum cost would be: " + x);
    }
    static int findCost(int[] sticks){
        List<Integer> ls = new ArrayList<>();
        for(int stick: sticks){
            ls.add(stick);
        }
        Collections.sort(ls);
        int totalCost = 0;
        while(ls.size() > 1){
            int i = 0;
            int j = 1;
            int cost = ls.get(i) + ls.get(j);
            totalCost += cost;
            
            
            ls.remove(i);
            ls.remove(i);
            ls.add(cost);            
            Collections.sort(ls);
        }
        return totalCost;

    }
}

/*
 * Optimal approach
 * create a priority queue and insert all the elements into them
 * get the 2 smallest element from it and add them. repeat it until there is only one element left in queue.
 * 
 */
class SecondApproach{
    static int minimumCost(int[] sticks){
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int stick : sticks){
            q.offer(stick);
        }
        int ans = 0; // stores the total cost required to bind all the ropes

        while(q.size() > 1){
            int x = q.poll();
            int y = q.poll();
            int cost = x + y;
            ans += cost;

            //add the cost to queue
            q.offer(cost);
        }
        return ans;
    }
}
