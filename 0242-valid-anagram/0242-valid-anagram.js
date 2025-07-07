/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {

     if(s.length !== t.length){
        return false
    }
    
    let mainResult = true
    
    let results = {}
    
    let resultt ={}
    
    for(let i = 0;i < s.length;i++){
        
        if(results[s[i]]){
             results[s[i]] =  results[s[i]] + 1
        }else{
            results[s[i]] = 1
        }
        
        if(resultt[t[i]]){
             resultt[t[i]] =  resultt[t[i]] + 1
        }else{
            resultt[t[i]] = 1
        }
      
        
        
    }
    
    for (let key in results){
        
        if(results[key] !== resultt[key]){
            
            mainResult = false
        }
    }
    
    
    console.log(mainResult)
    return mainResult
    
};