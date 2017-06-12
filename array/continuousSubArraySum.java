public ArrayList<Integer> continuousSubarraySum(int[] A){
    ArrayList<Integer> result = new ArrayList<Integer>();
    result.add(0);
    result.add(0);
    int start = 0, end = 0;
    int sum = 0;
    int ans = -0x7fffffff;
    for(int i =0; i < A.length; i++){
        if(sum < 0){
            sum = A[i];
            start = end = i;
        }else{
            sum += A[i];
            end = i;
        }
        if(sum >= ans){
            ans = sum;
            result.set(0, start);
            result.set(1, end);
        }
    }
    return result;
}
