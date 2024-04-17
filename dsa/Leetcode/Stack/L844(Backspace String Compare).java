class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack();
        Stack<Character> s2 = new Stack();
         for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '#' && !s1.isEmpty()){
                s1.pop();
            }
            else if(c != '#') {
                s1.push(c);
            }
         }
          for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(c == '#' && !s2.isEmpty()){
                s2.pop();
            }
            else if(c != '#') {
                s2.push(c);
            }
         } 
        
        if(s1.size() != s2.size()) return false;
        if(s1.isEmpty() && s2.isEmpty()) return true;
        if(!s1.isEmpty() && s2.isEmpty()) return false;
        if(s1.isEmpty() && ! s2.isEmpty()) return false;
        Iterator I = s1.iterator();
        Iterator J = s2.iterator();
        if(!I.hasNext()){
            return I.next() == J.next();
        }
        while(I.hasNext() && J.hasNext()){
            if(I.next() != J.next()){
                return false;
            }
        }
        return true;
    }
}
