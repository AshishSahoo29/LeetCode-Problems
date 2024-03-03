/*118. Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]] */

/*Approach:
To generate Pascal's triangle, we can use a 2D array. 
We'll initialize the first row with [1], as it always contains a single 1. Then, for each subsequent row, we'll calculate its elements by adding the elements from the previous row and their adjacent elements.

Steps to solve the problem:
1.Initialize a 2D array to store Pascal's triangle.
2.Iterate from 1 to numRows:
3.Initialize a list to store the current row.
4.The first element of each row is always 1.
5.For the remaining elements, calculate them by summing the corresponding elements from the previous row and its previous element.
6.Add each row to the result 2D array.
7.Return the resulting 2D array. */
import java.util.*;
public class PascalsTraingle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        //edge case:
        if(numRows == 0)return triangle;// returns empty list

        //fill the 1st row of list with single element  1
        triangle.add(Arrays.asList(1));

        for(int i = 1; i < numRows; i++){
            List<Integer> currRow = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            //as 1st element of each row is 1
            currRow.add(1);

            for(int j = 1; j < i; j++){
                int val = prevRow.get(j - 1) + prevRow.get(j);
                currRow.add(val);
            }

            //As last element of each row is 1
            currRow.add(1);

            //update the triangle list
            triangle.add(currRow);

        }
        return triangle;        
    }
}
