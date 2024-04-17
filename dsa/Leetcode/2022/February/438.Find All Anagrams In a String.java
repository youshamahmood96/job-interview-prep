import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr = new int[26];
        List<Integer> res = new ArrayList();
        if(s.length() == 0 || s == null) return res;
        for(int i=0;i<p.length();i++){
            char c = p.charAt(i);
            arr[c-'a']++;
        }
        int left = 0;
        int right = 0;
        int len = p.length();
        while(right<s.length()){
            if(arr[s.charAt(right++)-'a']-->=1){
                len--;
            }
            if(len==0){
                res.add(left);
            }
            if(right-left==p.length() && arr[s.charAt(left++) - 'a' ]++>=0){
                len++;
            }
        }
        
        return res;
    }
}