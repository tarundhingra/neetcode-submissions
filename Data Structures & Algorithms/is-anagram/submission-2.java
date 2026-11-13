class Solution {
    public boolean isAnagram(String s, String t) {
    //     if(s.length()!=t.length()){
    //         return false;
    //     }
    //    int[] number = new int[26];
    //    for(int i=0;i<s.length();i++){
    //     number[s.charAt(i)-'a']++;
    //     number[t.charAt(i)-'a']--;
    //    }
    //    for(int i=0;i<number.length;i++){
    //     if(number[i]!=0){
    //         return false;
    //     }
    //    }
    //    return true;
    char[] sa = s.toCharArray();
    char[] ta = t.toCharArray();
    Arrays.sort(sa);
    Arrays.sort(ta);
    if(Arrays.equals(sa,ta)){
        return true;
    }
    return false;
}}
