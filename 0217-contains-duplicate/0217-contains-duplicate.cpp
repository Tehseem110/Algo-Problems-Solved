class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {

        unordered_set<int> datamap;

        for(int num: nums){
            if(datamap.count(num)){
                return true;
            }

            datamap.insert(num);
        }

        return false;
        
    }
};