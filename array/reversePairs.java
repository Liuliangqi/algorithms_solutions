// actually this is a merge sort
// every time you merge two subArray
// if left > right, that means from left to mid, all greater than mid
// so we just need to finish this merge sort process, then we can get the result
public long reversePairs(int[] A){
    return mergeSort(A, 0, A.length - 1);
}

public int mergeSort(int[] A, int start, int end){
    if(start >= end) return 0;
    int mid = start + (end - start) / 2;
    int sum = 0;
    sum += mergeSort(A, start, mid);
    sum += mergeSort(A, mid + 1, end);
    sum += merge(A, start, mid, end);
    return sum;
}

public int merge(int[] A, int start, int mid, int end){
    int[] temp = new int[A.length];
    // merge should start from index of start, because different stage in this program
    // will deal with different part of the array
    int index = start;
    int leftIndex = start;
    int rightIndex = mid + 1;
    int sum = 0;
    while(leftIndex <= mid && rightIndex <= end){
        if(A[leftIndex] <= A[rightIndex]){
            temp[index++] = A[leftIndex++];
        }else{
            sum += mid - leftIndex + 1;;
            temp[index++] = A[rightIndex++]
        }
    }
    
    while(leftIndex <= mid){
        temp[index++] = A[leftIndex++];
    }
    while(rightIndex <= end){
        temp[index++] = A[rightIndex++];
    }
    
    for(int i = start; i <= end; i++){
        A[i] = temp[i];
    }
    
    return sum;
}
