// 1. implemented using ascaii
public int lengthOfLongestSubstring(String s){
    int[] map = new int[256];
    int i = 0;
    int j = 0;
    int max = 0;
    for(i = 0; i < s.length(); i++){
        while(j < s.length() && map[s.charAt(j)] == 0){
            map[s.charAt[j]] == 1;
            max = Math.max(max, j - i + 1);
            j++;
        }
        map[s.charAt[i]] = 0;
    }
    return max;
}

// 2.implemented using hash map
public int lengthOfLongestSubString(String s){
    if(s == null || s.length() == 0) return 0;
    int max = 0;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for(int i = 0; i < s.length(); i++){
        map.put(s.chartAt(i), 1);
        for(int j = i + 1; j < s.length(); j++){
            if(s.substring(i,j).contains(s.charAt(j) + "")){
                break;
            }else{
                map.put(s,charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        
        max = Math.max(max, map.get(s.charAt(i)));
    }
    return max;
}
