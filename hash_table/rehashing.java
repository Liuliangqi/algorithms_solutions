public int hashcode(int key, int capacity){
    if(key >= 0){
        return key % capacity;
    }else{
        return hashcode(key + capacity, capacity);
    }
}


public ListNode[] rehashing(ListNode[] hashTable){
    if(hashTable.length <= 0) return hashTable;
    int capacity = hashTable.length*2;
    ListNode[] newHashTable = new ListNode[capacity];
    for(int i = 0; i < hashTable.length; i++){
        while(hashTable[i] != null){
            int index = hashcode(hashTable[i].val, capacity);
            if(newHashTable[index] == null){
                newHashTable[index] = new ListNode(hashTable[i].val);
            }else{
                ListNode dummy = newHashTable[index];
                while(dummy.next != null)
                    dummy = dummy.next;
                dummy.next = new ListNode(hashTable[i].val);
            }
            hashTable[i] = hashTable[i].next;
        }
    }
    
    return newHashTable;
}
