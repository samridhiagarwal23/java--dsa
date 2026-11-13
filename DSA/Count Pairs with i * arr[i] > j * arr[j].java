class Solution {
    public int countPairs(List<Integer> arr) {
        // code here
        int[]newArray=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            newArray[i]=i*arr.get(i);
        }
        return mergesort(newArray,0,newArray.length-1);
    }
    int mergesort(int[]newArray,int left,int right){
        if(left>=right){
            return 0;
        }
         int mid=(left+right)/2;
         int count=0;
         count+=mergesort(newArray,left,mid);
         count+=mergesort(newArray,mid+1,right);
         int[] temp=new int[right-left+1];
         int i=left;
         int j=mid+1;
         int k=0;
         while(i<=mid && j<=right){
             if(newArray[i]<=newArray[j]){
                 temp[k]=newArray[i];
                 i++;
                 k++;
             }else{
                 count+=(mid-i+1);
                 temp[k]=newArray[j];
                 j++;
                 k++;
             }
         }
             while(i<=mid){
                 temp[k]=newArray[i];
                 i++;
                 k++;
             }
             while(j<=right){
                 temp[k]=newArray[j];
                 j++;
                 k++;
             }
             for(int x=0;x<temp.length;x++){
                 newArray[left+x]=temp[x];
             }
             return count;
             }
         }
       
