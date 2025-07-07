class Solution {
public:
    bool isAnagram(string s, string t) {
          unordered_map<char, int> charCountS;
            unordered_map<char, int> charCountT;

            if(s.length() != t.length()) {
                return false; // If lengths differ, they cannot be anagrams
            }

            for(char c : s) {
                charCountS[c]++;
            }

            for(char c : t) {
                charCountT[c]++;
            }

            bool isAnagram = true;

            

            // Compare the character counts

            for(auto& pair : charCountS) {
                char c = pair.first;
                int count = pair.second;

                if(charCountT[c] != count) {
                    isAnagram = false;
                    break; // If any character count doesn't match, they are not anagrams
                }
            }

            
            return isAnagram;
    }
};