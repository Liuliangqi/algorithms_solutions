public RandomListNode copyRandomList(RandomListNode head){
    if(head == null) return null;
    HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
    
    RandomListNode dummy = new RandomListNode(0);
    RandomListNode pre = dummy;
    RandomListNode newNode;
    while(head != null){
        // if already copied head, just get it
        if(map.containsKey(head)){
            newNode = map.get(head);
        }else{
            // else create a new node has the same value with head
            newNode = new RandomListNode(head.label);
            map.put(head, newNode);
        }
        
        // start to connect new nodes
        pre.next = newNode;
        // if head has a random next node
        if(head.random != null){
            // if already copied this random node then just get it
            if(map.containsKey(head.random)){
                newNode.random = map.get(head.random);
            }else{
                // else create a new node has the same value with the random node, and connected with the new node
                newNode.random = new RandomListNode(head.random.label);
                map.put(head.random, newNode.random)
            }
        }
        pre = pre.next;
        head = head.next;
    }
}
