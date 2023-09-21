/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s=1;
        int ans=-1;
        while(s<=n)
        {
            int mid=s+(n-s)/2;
            if(guess(mid)==0)
            {
                ans=mid;
                return ans;
            }
            else if(guess(mid)==-1)
            {
                n=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
      return ans;
    }
}
