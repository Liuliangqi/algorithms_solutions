public boolean find132Pattern(int[] nums){
    int s3 = Integer.MIN_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    for(int i = nums.length - 1; i >= 0; i--){
        if(nums[i] < s3) return true;
        else{
            while(!stack.empty() && nums[i] > stack.peek()){
                s3 = stack.pop();
            }
        }
        stack.push(nums[i]);
    }
    return false;
}

public boolean find132Pattern(int[] nums){
    if(nums.length < 3) return false;
    int i = 0,j = 0,k = 0;
    int n = nums.length;
    while(i < n){
        // find the smallest one
        while(i + 1 < n && nums[i] >= nums[i + 1]) i++;
        // find the maximum one
        j = i + 1;
        while(j + 1 < n && nums[j] <= nums[j+1]) j++;
        k = j + 1;
        while(k < n){
            if(nums[k] > nums[i] && nums[k] < nums[j]) return true;
            k++;
        }
        // 如果不合适，就要找j之后的，因为如果之前的找不到，j也是最大的，说明就没有合适的
        i = j + 1;
    }
    return false;
}
