class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        int thirdLargest=-1;
        int secondLargest=-1;
        int Largest=-1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>Largest){
                 thirdLargest=secondLargest;
                 secondLargest=Largest;
                 Largest=arr.get(i);
                    }
                    else if(arr.get(i)>secondLargest){
                            thirdLargest=secondLargest;
                            secondLargest=arr.get(i);
                        }
                        else if(arr.get(i)>thirdLargest){
                            thirdLargest=arr.get(i);
                        }
                    }
                       if(thirdLargest!=-1){
                           return thirdLargest;
                       }
                       return -1;
        }
    }
