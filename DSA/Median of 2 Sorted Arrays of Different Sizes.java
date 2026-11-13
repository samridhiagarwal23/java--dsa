class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
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
            while(i < a.length) {
                arr[k] = a[i];
                i++;
                k++;
            }

            while(j < b.length) {
                arr[k] = b[j];
                j++;
                k++;
            }
            int n = arr.length;

            if(n % 2 == 0) {
                return ((double)arr[n/2] + arr[n/2 - 1]) / 2.0;
            }
            else {
                return arr[n/2];
            }
        }
        
    }
