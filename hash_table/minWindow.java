public String minWindwo(String source, String target){
    int[] hashTable = new int[256];
    int[] sourceHash = new int[256];
    
    for(int i = 0; i < target.length(); i++) hashTable[target.charAt(i)]++;
    
    int sLen = source.length(), tlen = target.length();
    int found = 0, begin = -1, end = sLen, minLen = sLen;
    for(int i = 0, start = 0; i < source.length(); i++){
        sourceHash[source.charAt(i)]++;
        if(sourceHash[source.charAt(i)] <= hashTable[source.charAt(i)]) found++;
        if(found == tLen){
            while(start < i && sourceHash[source.charAt(start)] > hashTable[source.charAt(start)]){
                sourceHash[source.charAt(start)]--;
                start++;
            }
            
            if(i - start + 1 <= minLen){
                minLen = i - start + 1;
                begin = start;
                end = i;
            }
            
            sourceHash[source.charAt(start)]--;
            start++;
            found--;
        } 
    }
    if(begin == -1) return "";
    else return source.substring(begin, end+1);
}
