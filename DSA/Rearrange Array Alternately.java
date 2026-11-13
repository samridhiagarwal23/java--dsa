class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int temp[]=new int[n];
        int i=0;
        int j=n-1;
        int k=0;
        while(i<=j){
            if(i!=j){
                temp[k++]=arr[j--];
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[i++];
            }
        }
        for(int x=0;x<n;x++){
           arr[x]=temp[x];
        }
    }
}
