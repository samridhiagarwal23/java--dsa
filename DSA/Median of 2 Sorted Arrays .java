class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        int[] arr = new int[a.length + b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
           if(a[i]<b[j]){
               arr[k]=a[i];
               i++;
               k++;
           } 
           else{
               arr[k]=b[j];
                   j++;
                   k++;
               }
           }
           while(i<a.length){
               arr[k]=a[i];
               i++;
               k++;
           }
           while(j<b.length){
               arr[k]=b[j];
               j++;
               k++;
        }
        int n = arr.length;
        double median;

        if(n % 2 != 0) {
            median = arr[n/2];
        }
        else {
            median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
        }

        return median;
    }
}
