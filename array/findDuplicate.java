public int findDuplicate(int[] nums){
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0; i < nums.length; i++){
        if(map.get(nums[i]) != null){
            return nums[i];
        }
        map.put(nums[i], 1);
    }
    return -1;
}

public int findDuplicateII(int[] nums){
    int min = 0, max = nums.length - 1;
    
    while(min <= max){
        int mid = min + (max - min) / 2;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= mid)
                count++;
        }
        
        if(count > mid){
            max = mid - 1;
        }else{
            min = mid + 1;
        }
    }
    return min;
}

public int findDuplicateIII(int[] nums){
    int slow = 0;
    int fast = 0;
    
    do(
        slow = nums[slow];
        fast = nums[nums[fast]];
    ){slow != fast};
    find = 0;
    while(find != slow){
        find = nums[find];
        slow = nums[slow];
    }
    return find;
}
