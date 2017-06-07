public ArrayList<ArratList<Integer>> fourSum(int[] numbers, int target){
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    
    // sort first and will be faster
    Arrays.sort(numbers);
    // remain last 4 numbers
    for(int i = 0; i < numbers.length - 4; i++){
        if(i != 0 && numbers[i] == numbers[i - 1]) continue;
        for(int j = i + 1; j < numbers.length - 3; j++){
            if(j != i+1 && numbers[j] == numbers[j - 1]) continue;
            int left = j + 1;
            int right = numbers.length - 1;
            while(left < right){
                int sum = numbers[i] + numbers[j] + numbers[left] + numbers[right];
                if(sum < target) left++;
                else if(sum > target) right--;
                else{
                    ArrayList<Integer> entry = new ArrayList<Integer>();
                    entry.add(numbers[i]);
                    entry.add(numbers[j]);
                    entry.add(numbers[left]);
                    entry.add(numbers[right]);
                    result.add(entry);
                    left++;
                    right--;
                    while(left < right && numbers[left] == numbers[left - 1]) left++;
                    while(left < right && numbers[right] == numbers[right + 1]) right--;
                }
            }
        }
    }
    return result;
}
