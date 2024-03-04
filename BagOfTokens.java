/*948. Bag of Tokens
You start with an initial power of power, an initial score of 0, and a bag of tokens given as an integer array tokens, where each tokens[i] donates the value of tokeni.
Your goal is to maximize the total score by strategically playing these tokens. In one move, you can play an unplayed token in one of the two ways (but not both for the same token):

Face-up: If your current power is at least tokens[i], you may play tokeni, losing tokens[i] power and gaining 1 score.
Face-down: If your current score is at least 1, you may play tokeni, gaining tokens[i] power and losing 1 score.
Return the maximum possible score you can achieve after playing any number of tokens. 

Example: 
Input: tokens = [100,200,300,400], power = 200
Output: 2
Explanation: Play the tokens in this order to get a score of 2:
Play token0 (100) face-up, reducing power to 100 and increasing score to 1.
Play token3 (400) face-down, increasing power to 500 and reducing score to 0.
Play token1 (200) face-up, reducing power to 300 and increasing score to 1.
Play token2 (300) face-up, reducing power to 0 and increasing score to 2.
The maximum score achievable is 2.
*/

/*Approach:

To maximize the total score, we can use a greedy approach. We sort the tokens array and then use two pointers to keep track of the leftmost and rightmost elements. We play tokens greedily: if we have enough power, we play the token with the least value face-up, otherwise, we play the token with the greatest value face-down.

Steps to solve the problem:

1. Sort the tokens array.
2. Initialize two pointers, left and right, pointing to the beginning and end of the sorted array, respectively.
3. While left <= right:
    If power >= tokens[left], play token[left] face-up, increment score, and decrease power by tokens[left]. Move left pointer one step to the right.
    If score > 0 and power < tokens[left], play token[right] face-down, decrement score, and increase power by tokens[right]. Move right pointer one step to the left.
    If power < tokens[left] and score == 0, break the loop since further play is not possible.
4. Return the maximum score achieved.

The time complexity of the algorithm is O(n log n) due to the sorting operation. The subsequent linear traversal of the array takes O(n) time.
The space complexity of the algorithm is O(1) since we use only a constant amount of extra space for variables. */

import java.util.Arrays;
public class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        //initialize two pointers
        int left = 0;
        int right = tokens.length - 1;

        //sort the token array to maximize profit
        Arrays.sort(tokens);

        int score = 0;
        int maxScore = 0;

        while(left <= right){
            //face up style
            if(power >= tokens[left]){
                power -= tokens[left];
                score++;
                maxScore = Math.max(maxScore, score);
                left++;
            }else if(score > 0){
                power += tokens[right];
                score--;
                right--;                
            }else{
                break;
            }
        }
        return maxScore;
    }
    
}
