/*70. Climbing Stairs

You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 
Constraints:
1 <= n <= 45*/

class Solution {
public int climbStairs(int n) {

  int cp = climb(n, new int[n+1]);
  return cp;
   
}
public static int climb(int n , int[] strg){
if(n == 0){
return 1;
} else if(n < 0){
return 0;
}

if(strg[n] != 0){
  return strg[n];
}


int first  = climb(n-1, strg);
int sec = climb(n-2,strg);
 
int res = first + sec ;


strg[n] = res;

return res;
}
}
