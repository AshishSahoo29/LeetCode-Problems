/*69. Sqrt(x)
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python. */
public class Sqrt {
    
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }

        //define range for binary search
        int left = 0;
        int right = x/2 + 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;

            if(sq == x){
                return mid;
            }else if(sq < x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return right;         
    }

}
