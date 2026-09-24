class Solution {
    public int[] productExceptSelf(int[] nums) {
        int k=nums.length;
        int[] pre=new int[k];
        int[] suf=new int[k];
        int[] output=new int[k];
        pre[0]=1;
        for(int i=1;i<k;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        suf[k-1]=1;
        for(int i=k-2;i>=0;i--){
            suf[i]=suf[i+1]*nums[i+1];
        }
        for(int i=0;i<k;i++){
            output[i]= pre[i]*suf[i];
        }
        return output;
    }
}  
