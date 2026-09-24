class Solution {
    public boolean lemonadeChange(int[] bills) {
            if(bills[0]!=5){return false;}
            
            int c=0;
            int t=0;
        for(int i=0;i<bills.length;i++){
          if(bills[i]==5){
                c++;
              } 
  else if(bills[i]==10 ){
    if(c>0)
    {c--;
    t++;}
    else{return false;}
  }
  else{
    if(c>0 && t!=0){t--;c--;}
    else if(c>=3){c=c-3;}
    else {return false;}
  }
    }
return true;
    }
    
}

/*
 * Takeaways for Lemonade Change (Greedy Algorithm):
 * 
 * 1. Greedy Choice Strategy:
 *    - Always save $5 bills whenever possible—they are universal change ($10 & $20).
 *    - For a $20 bill, prioritize using ($10 + $5) over (3 x $5).
 * 
 * 2. Early Exit:
 *    - Return `false` immediately when change cannot be provided to avoid processing 
 *      subsequent bills that could incorrectly invalidate an earlier failure.
 */
