/*Problem: Pascal's Triangle II
Given an integer rowIndex, return the rowIndexth (0-indexed) row of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.

Approach:
To generate the rowIndexth row of Pascal's triangle, we don't need to generate the entire triangle. Instead, we can use the property of Pascal's triangle that each element in a row can be calculated based on the elements of the previous row.

Steps to solve the problem:
Initialize a list to store the rowIndexth row.
Initialize the first element of the row as 1.
For each subsequent element in the row:
Calculate the element using the formula: current_element = previous_row[j - 1] + previous_row[j].
Add each element to the row list.
Return the row list. */

import java.util.*;
public class PascalsTraingleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        //add 1 to first row
        row.add(1);

        for(int i = 1; i <= rowIndex; i++){
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j = 1; j < i; j++){
                int value = row.get(j-1) + row.get(j);
                currRow.add(value);                
            }
            currRow.add(1);
            row = currRow;
        }
        return row;
    }
}
