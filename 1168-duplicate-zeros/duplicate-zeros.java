class Solution {
    public void duplicateZeros(int[] arr) {
        int pzd = 0;
        int lastidx = arr.length-1;

        for(int i =0;i<=lastidx -pzd; i++){
            if(arr[i]==0){
                //edge case
                if(i==lastidx-pzd){
                    arr[lastidx]=0;
                    lastidx -=1;
                    break;
                }
                pzd++;
            }
        }
        int newlastidx = lastidx-pzd;
        for(int i =newlastidx; i>=0;i--){
            if(arr[i]==0){
                arr[i+pzd]=0;
                pzd--;
                arr[i+pzd]=0;
            }else{
                arr[i+pzd]=arr[i];
            }
        }
    }
}