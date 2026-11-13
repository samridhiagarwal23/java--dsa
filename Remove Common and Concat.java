class Solution {
    public static String concatenatedString(String s1, String s2) {
        // code here
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s2.indexOf(s1.charAt(i))==-1){
                result.append(s1.charAt(i));
            }
        }
        for(int i=0;i<s2.length();i++){
            if(s1.indexOf(s2.charAt(i))==-1){
                result.append(s2.charAt(i));
            }
        }
        if(result.length()==0){
            return "-1";
        }
        return result.toString();
        
    }
}
