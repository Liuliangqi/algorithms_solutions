public int majorityNumber(ArrayList<Integer> nums, int k){
    if(nums == null || nums.size() == 0) return -1;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int weight = nums.size() / k;
    for(int i = 0; i < nunms.size(); i++){
        if(map.containsKey(nums.get(i))) map.put(nums.get(i), map.get(nums.get(i)) + 1);
        else map.put(nums.get(i), 1);
    }
    
    for(int key : map.keySet()){
        if(map.get(key) > weight) return key;
    }
    
    return -1;
}
