class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        int[] need = new int[128]; // ASCII chars
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0, right = 0; 
        int required = t.length(); // how many chars we still need
        int minLen = Integer.MAX_VALUE;
        int start = 0; // starting index of best window

        while (right < s.length()) {
            char c = s.charAt(right);

            if (need[c] > 0) { 
                required--; 
            }
            need[c]--;  
            right++;

            while (required == 0) { // valid window
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++; 
                if (need[leftChar] > 0) {
                    required++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

}