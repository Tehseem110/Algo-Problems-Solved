/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
 const map = new Map();

  for (let word of strs) {
    const sorted = word.split('').sort().join(''); // key
    if (!map.has(sorted)) {
      map.set(sorted, []);
    }
    map.get(sorted).push(word);
  }

  return Array.from(map.values());
    
};

