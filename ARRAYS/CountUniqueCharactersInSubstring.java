class Solution {
    public int uniqueLetterString(String s) {
        
        int[] leftIndex = new int[s.length()];
        int[] rightIndex = new int[s.length()];
        
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            leftIndex[i] = lastIndex[ch - 'A'];
            lastIndex[ch - 'A'] = i;
        }
        
        Arrays.fill(lastIndex, s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            
            rightIndex[i] = lastIndex[ch - 'A'];
            lastIndex[ch - 'A'] = i;
        }
        
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            
            int left = leftIndex[i];
            int right = rightIndex[i];
            
            res += (i - left) * (right - i);
        }
        
        return res;
    }
}
