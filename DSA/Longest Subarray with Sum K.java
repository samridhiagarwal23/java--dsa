class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here

               HashMap<Integer, Integer> map = new HashMap<>();

               int sum = 0;
               int longest = 0;

               for (int i = 0; i < arr.length; i++) {

                   sum += arr[i];

                   // Agar starting se hi sum K hai
                   if (sum == k) {
                       longest = i + 1;
                   }

                   // Check karo kya pehle aisa prefix sum mila tha
                   if (map.containsKey(sum - k)) {
                       int length = i - map.get(sum - k);
                       if (length > longest) {
                           longest = length;
                       }
                   }

                   // Pehli occurrence hi store karni hai
                   if (!map.containsKey(sum)) {
                       map.put(sum, i);
                   }
               }

               return longest;
           }
       }
