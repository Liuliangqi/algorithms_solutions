public void wiggleSort(int[] nums){
    for(int i = 0; i < nums.length; i++){
        if((i % 2 == 1 && nums[i] < nums[i - 1]) || (i % 2 == 0 && nums[i] > nums[i - 1])){
                swap(nums, i - 1, i);
        }
    }
}


public void swap(int[] nums, int index1, int index2){
    int temp = nums[index1];
    nums[index1] = nums[index2];
    nums[index2] = temp;
}
