import java.util.*;
class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int sum=0;
        while(n!=0)
        {
            int mod=n%10;
            sum=(sum*10)+mod;
            n=n/10;
        }
      int m=Math.abs(num-sum);
      return m;
    }
}