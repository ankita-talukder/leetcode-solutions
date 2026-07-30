class Solution {
    public int minimumPushes(String word) {
        int ans = 0 ;
        int n = word.length();
        int count = 0;
        int k = 1;
        for(int i=0;i<=n-1;i++){
            count++;
            if(count == 8){
                ans = ans+k;
                count = 0;
                k++;
            }else{
                ans = ans+k;
            }
        }
        return ans;
    }
}