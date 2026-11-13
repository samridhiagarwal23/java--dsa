class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer>positive=new ArrayList<>();
        ArrayList<Integer>negative=new ArrayList<>();
        for(int j=0;j<arr.size();j++){
            if(arr.get(j)>=0){
                positive.add(arr.get(j));
            }
            else{
                negative.add(arr.get(j));
            }
        }
        int place=0;
        int p=0;
        int n=0;
        while(p < positive.size() && n<negative.size()){
            if(place%2==0){
                arr.set(place,positive.get(p));
                p++;
            }
            else{
                arr.set(place,negative.get(n));
                n++;
            }
            place++;
        }
        while(p<positive.size()){
            arr.set(place,positive.get(p));
            p++;
            place++;
        }
            while(n<negative.size()){
                arr.set(place,negative.get(n));
                n++;
                place++;
            }
        }
    }
