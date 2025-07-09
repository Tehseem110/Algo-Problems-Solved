class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
         unordered_map<string,vector<string>> anagramGroups;

        for(string word : strs){
        
           string sortedWord = word;
           sort(sortedWord.begin(),sortedWord.end());
           anagramGroups[sortedWord].push_back(word);
        }

        // convert map to array

        vector<vector<string>> result;

        for(auto& pair : anagramGroups){
            result.push_back(pair.second);
        }

      return result;
    }
};