/*Music Teacher Problem: asked in Mitsogo company
 * A string was given in the problem which describes each character as musical notes to learn. 
 * Notes with same frequency can be learned on same day, or if the frequency differs another day will take to learn for a new variety of note.
 * find the number of days a person can take to learn.
 * 
 * example1:
 * "aababbcd"
 * here a->3 
 *      b->3
 *      c->1
 *      d->1
 *    so it will take 2 days to learn 
 * 
 * steps: 
 * create a hashmap
 * store the frequencies of each note
 * create a set and add frequencies to them
 * return size of set as it contains unique varieties of frequencies
*/  
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MusicTeacher {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = daysToTeach(s);
        System.out.println(res);
        sc.close();
    }
    public static int daysToTeach(String s){
        Map<Character, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : map.keySet()){
            int val = map.get(ch);
            if(!set.contains(val)){
                set.add(val);
            }
        }
        return set.size();
    }
    
}
