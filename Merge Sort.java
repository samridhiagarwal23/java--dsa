class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return;
        }
            int mid=l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
    }
              public void merge(int arr[],int l,int mid,int r){
                  int temp[]=new int[r-l+1];
                  int i=l;
                  int j=mid+1;
                  int k=0;
                  while(i<=mid && j<=r){
                      if(arr[i]<=arr[j]){
                       temp[k]=arr[i];
                          i++;
                          k++;
                      }else{
                          temp [k]=arr[j];
                          j++;
                          k++;
                      }
                  }
                  while(i<=mid){
                       temp[k]=arr[i];
                      i++;
                      k++;
                  }
                  while(j<=r){
                      temp[k]=arr[j];
                      j++;
                      k++;
                  }
                  for(int x=0;x<temp.length;x++){
                      arr[l+x]=temp[x];
                  }
              }
            }
