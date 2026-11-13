class Solution {
    String findSum(String s1, String s2) {
        // code here
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;
        StringBuilder result=new StringBuilder();
        while(i>=0 ||j>=0 || carry>0){
            int sum=carry;
            if(i>=0){
                int digit1=s1.charAt(i)-'0';
                sum+=digit1;
                i--;
            }
            if(j>=0){
                int digit2=s2.charAt(j)-'0';
                sum+=digit2;
                j--;
            }
            
            int digit=sum%10;
            carry=sum/10;
            result.append(digit);
        }
        result.reverse();
        int k=0;
        while(k<result.length()-1 && result.charAt(k)=='0'){
            k++;
        }
        return result.substring(k);
        }
}
