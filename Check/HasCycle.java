//https://www.hackerrank.com/challenges/ctci-linked-list-cycle

boolean hasCycle(Node head) {
    if(head==null)return false;
    Node walker=head;
    Node runner=head;
    while(runner.next!=null&&runner.next.next!=null){
        runner=runner.next.next;
        walker=walker.next;
        if(walker==runner)return true;
    }
    return false;
}
