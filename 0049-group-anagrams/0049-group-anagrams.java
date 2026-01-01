class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String,List<String>> map = new HashMap<>();

        // run the loop of array of str

      for(int i = 0; i < strs.length ; i++){

            int[] tempKeyArray = new int[26];
            StringBuilder keyString = new StringBuilder();

            for(char c: strs[i].toCharArray()){
               tempKeyArray[c - 'a']++;

            }
            for(int k: tempKeyArray){
              keyString.append("#" + k);
            }

            String key = keyString.toString();

            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else{
                List<String> tempList = new ArrayList();
                tempList.add(strs[i]);
                map.put(key,tempList);
            }
        }

        List<List<String>> result = new ArrayList<>(map.values());
        
        return result;
    }
}